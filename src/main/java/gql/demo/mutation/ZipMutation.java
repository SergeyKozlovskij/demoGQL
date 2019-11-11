package gql.demo.mutation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import gql.demo.dao.entity.State;
import gql.demo.dao.entity.Zip;
import gql.demo.service.StateService;
import gql.demo.service.ZipService;

@Component
public class ZipMutation  implements GraphQLMutationResolver {
    private final ZipService zipService;
    private final StateService stateService;

    public ZipMutation(ZipService zipService, StateService stateService) {
        this.zipService = zipService;
        this.stateService = stateService;
    }

    public Zip createZip(String code, State state) {
        return zipService.save(new Zip(code, stateService.findByName(state.getName()).orElseGet(() -> stateService.save(state))));
    }
}
