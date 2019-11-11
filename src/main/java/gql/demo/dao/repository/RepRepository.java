package gql.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gql.demo.dao.entity.Rep;

@Repository
public interface RepRepository extends JpaRepository<Rep, Long> {
}
