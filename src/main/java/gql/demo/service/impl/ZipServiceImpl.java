package gql.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

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
    public List<Zip> findAll() {
        return zipRepository.findAll();
    }

    @Override
    public Zip findById(Long id) {
        return zipRepository.getOne(id);
    }

    @Override
    public Zip save(Zip zip) {
        return zipRepository.save(zip);
    }
}
