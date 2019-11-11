package gql.demo.service;

import java.util.List;

import gql.demo.dao.entity.State;

public interface StateService {
    List<State> findAll();

    State findById(Long id);

    State save(State state);
}
