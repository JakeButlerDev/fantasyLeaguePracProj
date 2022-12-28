package com.butler.fantasyLeaguePracProj.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;
import java.util.*;

@Entity
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // LAZY is bad practice but need to experiment before trying to implement EAGER
    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY)
    @JsonIncludeProperties({"id", "name"})
    private Set<FantasyTeam> teams;

    private String name;

    public League(Set<FantasyTeam> teams, String name) {
        this.teams = teams;
        this.name = name;
    }

    public League() { }

    public Set<FantasyTeam> getTeams() {
        return teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
