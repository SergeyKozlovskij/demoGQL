package gql.demo.mutation;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import gql.demo.dao.entity.State;
import gql.demo.dao.entity.Zip;
import gql.demo.service.StateService;

@Component
public class StateMutation implements GraphQLMutationResolver {
    private final StateService stateService;

    public StateMutation(StateService stateService) {
        this.stateService = stateService;
    }

    public State createState(String name, String abbrev, List<Zip> zips) {
        return stateService.save(new State(name, abbrev, zips));
    }
}
