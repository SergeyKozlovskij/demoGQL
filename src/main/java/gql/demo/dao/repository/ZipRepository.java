package gql.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gql.demo.dao.entity.Zip;

@Repository
public interface ZipRepository extends JpaRepository<Zip, Long> {
}
