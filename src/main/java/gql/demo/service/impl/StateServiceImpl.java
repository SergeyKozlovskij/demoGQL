package gql.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public List<State> findAll() {
        return stateRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<State> findById(Long id) {
        return stateRepository.findById(id);
    }

    @Override
    @Transactional
    public State save(State state) {
        return stateRepository.save(state);
    }

    @Override
    public Optional<State> findByName(String name) {
        return stateRepository.findByName(name);
    }
}
