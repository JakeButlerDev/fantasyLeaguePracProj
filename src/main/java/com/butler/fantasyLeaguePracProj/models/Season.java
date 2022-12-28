package com.butler.fantasyLeaguePracProj.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seasonId;

    @OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "teamId")
    @JsonIncludeProperties("teamId")
    public FantasyTeam fantasyTeam;

    @OneToMany(mappedBy = "season")
    public Set<Player> players;

    public String seasonYears;

    public Season() { }

    public Season(FantasyTeam fantasyTeam, Set<Player> players) {
        this.fantasyTeam = fantasyTeam;
        this.players = players;
    }

    public Long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
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
