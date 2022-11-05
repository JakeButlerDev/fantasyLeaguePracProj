package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "rosteredTeams", joinColumns =@JoinColumn(name = "team_id"), inverseJoinColumns = @JoinColumn(name = "player_id"))
    private List<FantasyTeam> teamsRostered;

    private String club;
    private String name;
    private Boolean rostered;
    private Integer gamesPlayed;
    private Double minutesPlayed;
    private Byte goals;
    private Byte assists;
    private Short shots;
    protected Byte cleanSheets;
    protected Short saves;


    public Player() { }

    public Player(Byte goals, Byte assists, Short shots, String club, String name, Boolean rostered, Integer gamesPlayed, Double minutesPlayed, Byte cleanSheets, Short saves) {
        this.goals = goals;
        this.assists = assists;
        this.shots = shots;
        this.club = club;
        this.name = name;
        this.rostered = rostered;
        this.gamesPlayed = gamesPlayed;
        this.minutesPlayed = minutesPlayed;
        this.cleanSheets = cleanSheets;
        this.saves = saves;
    }

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

    public String getClub() {
        return club;
    }

    public String getName() {
        return name;
    }

    public Boolean getRostered() {
        return rostered;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRostered(Boolean rostered) {
        this.rostered = rostered;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Double getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Double minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }
    public Byte getGoals() {
        return goals;
    }

    public Byte getAssists() {
        return assists;
    }

    public Short getShots() {
        return shots;
    }

    public void setGoals(Byte goals) {
        this.goals = goals;
    }

    public void setAssists(Byte assists) {
        this.assists = assists;
    }

    public void setShots(Short shots) {
        this.shots = shots;
    }
    public Byte getCleanSheets() {
        return cleanSheets;
    }

    public Short getSaves() {
        return saves;
    }

    public void setCleanSheets(Byte cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public void setSaves(Short saves) {
        this.saves = saves;
    }

    //TODO: How to get which position class player belongs to?
}
