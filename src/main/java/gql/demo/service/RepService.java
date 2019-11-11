package gql.demo.service;

import java.util.List;

import gql.demo.dao.entity.Rep;

public interface RepService {
    List<Rep> findAll();

    Rep findById(Long id);

    Rep save(Rep rep);
}
