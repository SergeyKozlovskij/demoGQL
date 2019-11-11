package gql.demo.query;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import gql.demo.dao.entity.Rep;
import gql.demo.service.RepService;

@Component
public class RepQuery implements GraphQLQueryResolver {
    private final RepService repService;

    public RepQuery(RepService repService) {
        this.repService = repService;
    }

    public Optional<Rep> getRep(Long id) {
        return repService.findById(id);
    }

    public List<Rep> getReps() {
        return repService.findAll();
    }
}
