package gql.demo.dao.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Rep {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(name="REP_ZIP", joinColumns = @JoinColumn(name="rep_id"), inverseJoinColumns = @JoinColumn(name = "zip_id"))
    private List<Zip> zipCodes = new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="REP_STATE", joinColumns = @JoinColumn(name="rep_id"), inverseJoinColumns = @JoinColumn(name = "state_id"))
    private List<State> states = new ArrayList<>();

    public Rep() {
    }

    public Rep(String name, List<State> states) {
        this.name = name;
        this.states = states;
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

    public List<Zip> getZips() {
        return zipCodes;
    }

    public void setZips(List<Zip> zipCodes) {
        this.zipCodes = zipCodes;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
}
