package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Player {
    //TODO: Possibility in future to make an Outfielder Class & Keeper Class that extend Player and keep only respectable stats for position

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "rosteredTeams", joinColumns =@JoinColumn(name = "team_id"), inverseJoinColumns = @JoinColumn(name = "player_id"))
    private List<FantasyTeam> teamsRostered;

    public Player() { }

    public void setId(Long id) {
        this.id = id;
    }

    public List<FantasyTeam> getTeamsRostered() {
        return teamsRostered;
    }

    public void setTeamsRostered(List<FantasyTeam> fantasyTeamsOwnedBy) {
        this.teamsRostered = fantasyTeamsOwnedBy;
    }

    public Long getId() {
        return id;
    }
}
