package com.butler.fantasyLeaguePracProj.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO: Double check JoinColumn and JsonInclude properties
    @OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    @JsonIncludeProperties("id")
    public FantasyTeam fantasyTeam;

    @OneToMany
    public List<Player> players;

    public String seasonYears;

    public Season() { }

    public Season(FantasyTeam fantasyTeam, List<Player> players) {
        this.fantasyTeam = fantasyTeam;
        this.players = players;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FantasyTeam getFantasyTeam() {
        return fantasyTeam;
    }

    public void setFantasyTeam(FantasyTeam fantasyTeam) {
        this.fantasyTeam = fantasyTeam;
    }

    public List<Player> getPlayer() {
        return players;
    }

    public void setPlayer(List<Player> players) {
        this.players = players;
    }
}
