package gql.demo.service;

import java.util.List;
import java.util.Optional;

import gql.demo.dao.entity.Rep;

public interface RepService {
    List<Rep> findAll();

    Optional<Rep> findById(Long id);

    Rep save(Rep rep);
}
