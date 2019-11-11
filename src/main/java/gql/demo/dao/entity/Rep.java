package gql.demo.dao.entity;

import java.util.List;

import javax.persistence.Entity;
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
    private List<Zip> zipCodes;
    @ManyToMany
    @JoinTable(name="REP_STATE", joinColumns = @JoinColumn(name="rep_id"), inverseJoinColumns = @JoinColumn(name = "state_id"))
    private List<State> states;

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

    public List<Zip> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(List<Zip> zipCodes) {
        this.zipCodes = zipCodes;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
}
