package gql.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import gql.demo.dao.entity.State;
import gql.demo.dao.repository.StateRepository;
import gql.demo.service.StateService;

@Service
public class StateServiceImpl implements StateService {
    private final StateRepository stateRepository;

    public StateServiceImpl(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Override
    public List<State> findAll() {
        return stateRepository.findAll();
    }

    @Override
    public State findById(Long id) {
        return stateRepository.getOne(id);
    }

    @Override
    public State save(State state) {
        return stateRepository.save(state);
    }
}
