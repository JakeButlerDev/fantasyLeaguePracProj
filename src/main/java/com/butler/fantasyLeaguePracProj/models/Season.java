package com.butler.fantasyLeaguePracProj.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    @JsonIncludeProperties("id")
    public FantasyTeam fantasyTeam;

    @OneToMany(targetEntity = Player.class)
    public Set<Player> players;

    public String seasonYears;

    public Season() { }

    public Season(FantasyTeam fantasyTeam, Set<Player> players) {
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

    public Set<Player> getPlayer() {
        return players;
    }

    public void setPlayer(Set<Player> players) {
        this.players = players;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public String getSeasonYears() {
        return seasonYears;
    }

    public void setSeasonYears(String seasonYears) {
        this.seasonYears = seasonYears;
    }
}
