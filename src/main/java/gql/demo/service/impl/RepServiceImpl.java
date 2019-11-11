package gql.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import gql.demo.dao.entity.Rep;
import gql.demo.dao.repository.RepRepository;
import gql.demo.service.RepService;

@Service
public class RepServiceImpl implements RepService {
    private final RepRepository repRepository;

    public RepServiceImpl(RepRepository repRepository) {
        this.repRepository = repRepository;
    }

    @Override
    public List<Rep> findAll() {
        return repRepository.findAll();
    }

    @Override
    public Optional<Rep> findById(Long id) {
        return repRepository.findById(id);
    }

    @Override
    public Rep save(Rep rep) {
        return repRepository.save(rep);
    }
}
