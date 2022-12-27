package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.*;
import java.util.*;

@Entity
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<FantasyTeam> teams;

    //TODO: Possibly unnecessary, will wait til later to implement
//    @Column
//    @ElementCollection(targetClass=FantasyTeam.class)
//    private List<FantasyTeam> standings;    // Could use <String> to omly store team names, but what if I want record as well, waiver order, etc.

    private String name;

    public League(List<FantasyTeam> teams, String name) {
        this.teams = teams;
        this.name = name;
    }

    public League() { }

    public List<FantasyTeam> getTeams() {
        return teams;
    }

//    public List<FantasyTeam> getStandings() {
//        return standings;
//    }
//
//    public void setStandings(List<FantasyTeam> standings) {
//        this.standings = standings;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
