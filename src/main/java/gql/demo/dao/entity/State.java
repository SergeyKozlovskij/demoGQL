package gql.demo.dao.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String abbrev;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Zip> zips = new ArrayList<>();

    public State() {
    }

    public State(String name, String abbrev, List<Zip> zips) {
        this.name = name;
        this.abbrev = abbrev;
        this.zips = zips;
    }

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

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public List<Zip> getZips() {
        return zips;
    }

    public void setZips(List<Zip> zips) {
        this.zips = zips;
    }
}
