package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private List<FantasyTeam> teams;
    private List<FantasyTeam> standings;
    private String name;

    public League(List<FantasyTeam> teams, String name) {
        this.teams = teams;
        this.name = name;
    }

    public League() { }

    public List<FantasyTeam> getTeams() {
        return teams;
    }

    public List<FantasyTeam> getStandings() {
        return standings;
    }

    public void setStandings(List<FantasyTeam> standings) {
        this.standings = standings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
