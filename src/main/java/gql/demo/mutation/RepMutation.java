package gql.demo.mutation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import gql.demo.dao.entity.Rep;
import gql.demo.dao.entity.State;
import gql.demo.service.RepService;
import gql.demo.service.StateService;
import gql.demo.service.ZipService;

@Component
public class RepMutation implements GraphQLMutationResolver {
    private final RepService repService;
    private final ZipService zipService;
    private final StateService stateService;

    public RepMutation(RepService repService, ZipService zipService, StateService stateService) {
        this.repService = repService;
        this.zipService = zipService;
        this.stateService = stateService;
    }

    @Transactional
    public Rep createRep(String name, List<State> states) {
        states.forEach(state -> state.setZips(state.getZips().stream().map(zip -> zipService.findByCode(zip.getCode()).orElseGet(() -> zipService.save(zip))).collect(Collectors.toList())));
        List<State> stateList = states.stream().map(state ->
                stateService.findByName(state.getName()).map(persistedState -> {
                    persistedState.setZips(
                            Stream.concat(persistedState.getZips().stream(), state.getZips().stream()).distinct().collect(Collectors.toList()));
                    return persistedState;
                })
                        .orElseGet(() -> stateService.save(state))).collect(Collectors.toList());
        return repService.save(new Rep(name, stateList));
    }
}
