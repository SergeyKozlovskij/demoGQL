package gql.demo.dao.entity;

import java.util.List;

public class Rep {
    private Long id;
    private String name;
    private List<Long> zipCodes;
    private List<Long> states;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(List<Long> zipCodes) {
        this.zipCodes = zipCodes;
    }

    public List<Long> getStates() {
        return states;
    }

    public void setStates(List<Long> states) {
        this.states = states;
    }
}
