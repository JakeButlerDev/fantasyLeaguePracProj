package com.butler.fantasyLeaguePracProj.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    @JsonIncludeProperties("id")
    public FantasyTeam fantasyTeam;

    @OneToOne
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    public Player player;

    public Season() { }

    public Season(FantasyTeam fantasyTeam, Player player) {
        this.fantasyTeam = fantasyTeam;
        this.player = player;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
