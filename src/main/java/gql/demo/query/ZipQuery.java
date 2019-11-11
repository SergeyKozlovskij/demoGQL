package gql.demo.query;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import gql.demo.dao.entity.Zip;
import gql.demo.service.ZipService;

@Component
public class ZipQuery implements GraphQLQueryResolver {
    private final ZipService zipService;

    public ZipQuery(ZipService zipService) {
        this.zipService = zipService;
    }

    public List<Zip> getZips () {
        return zipService.findAll();
    }

    public Optional<Zip> getZip (Long id) {
        return zipService.findById(id);
    }
}
