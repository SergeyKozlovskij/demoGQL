package gql.demo.query;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import gql.demo.dao.entity.State;
import gql.demo.service.StateService;

@Component
public class StateQuery implements GraphQLQueryResolver {
    private final StateService stateService;

    public StateQuery(StateService stateService) {
        this.stateService = stateService;
    }

    public State getState(Long id) {
        return stateService.findById(id);
    }

    public List<State> getStates() {
        return stateService.findAll();
    }
}
