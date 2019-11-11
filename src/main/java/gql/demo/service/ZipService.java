package gql.demo.service;

import java.util.List;
import java.util.Optional;

import gql.demo.dao.entity.Zip;

public interface ZipService {
    List<Zip> findAll();

    Optional<Zip> findById(Long id);

    Optional<Zip> findByCode(String code);

    Zip save(Zip zip);
}
