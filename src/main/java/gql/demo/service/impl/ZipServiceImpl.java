package gql.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gql.demo.dao.entity.Zip;
import gql.demo.dao.repository.ZipRepository;
import gql.demo.service.ZipService;

@Service
public class ZipServiceImpl implements ZipService {

    private final ZipRepository zipRepository;

    public ZipServiceImpl(ZipRepository zipRepository) {
        this.zipRepository = zipRepository;
    }

    @Override
    @Transactional
    public List<Zip> findAll() {
        return zipRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Zip> findById(Long id) {
        return zipRepository.findById(id);
    }

    @Override
    public Optional<Zip> findByCode(String code) {
        return zipRepository.findByCode(code);
    }

    @Override
    @Transactional
    public Zip save(Zip zip) {
        return zipRepository.save(zip);
    }
}
