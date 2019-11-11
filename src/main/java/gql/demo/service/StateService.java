package gql.demo.service;

import java.util.List;
import java.util.Optional;

import gql.demo.dao.entity.State;

public interface StateService {
    List<State> findAll();

    Optional<State> findById(Long id);

    State save(State state);

    Optional<State> findByName(String name);
}
