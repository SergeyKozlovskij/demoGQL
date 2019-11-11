package gql.demo.service;

import java.util.List;

import gql.demo.dao.entity.Zip;

public interface ZipService {
    List<Zip> findAll();

    Zip findById(Long id);

    Zip save(Zip zip);
}
