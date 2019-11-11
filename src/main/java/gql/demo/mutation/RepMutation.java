package gql.demo.mutation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import gql.demo.dao.entity.Rep;
import gql.demo.dao.entity.State;
import gql.demo.dao.entity.Zip;
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
    public Rep createRep(String name, List<Zip> zips, List<State> states) {
        List<State> stateList = states.stream().map(state -> stateService.findByName(state.getName()).orElseGet(() -> stateService.save(state))).collect(Collectors.toList());
        List<Zip> zipList = zips.stream().map(zip -> zipService.findByCode(zip.getCode()).orElseGet(() -> zipService.save(zip))).collect(Collectors.toList());
        return repService.save(new Rep(name, zipList, stateList));
    }
}
