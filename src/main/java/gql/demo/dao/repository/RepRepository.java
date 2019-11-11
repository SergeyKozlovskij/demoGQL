package gql.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gql.demo.dao.entity.Rep;

public interface RepRepository extends JpaRepository<Rep, Long> {
}
