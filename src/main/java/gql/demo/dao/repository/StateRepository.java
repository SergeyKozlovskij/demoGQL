package gql.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gql.demo.dao.entity.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
