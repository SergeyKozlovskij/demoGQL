package gql.demo.mutation;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import gql.demo.dao.entity.State;
import gql.demo.service.StateService;

@Component
public class StateMutation implements GraphQLMutationResolver {
    private final StateService stateService;

    public StateMutation(StateService stateService) {
        this.stateService = stateService;
    }

    public State createState(String name, String abbrev) {
        return stateService.save(new State(name, abbrev));
    }
}
