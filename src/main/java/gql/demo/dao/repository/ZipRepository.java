package gql.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gql.demo.dao.entity.Zip;

public interface ZipRepository extends JpaRepository<Zip, Long> {
}
