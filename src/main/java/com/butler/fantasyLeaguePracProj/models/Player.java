package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.*;

@Entity
public class Player {
    //TODO: Possibility in future to make an Outfielder Class & Keeper Class that extend Player and keep only respectable stats for position

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String club;
    private String name;
    private Boolean rostered;

    // Individual statistics
    private Byte goals;
    private Byte assists;
    private Short shots;
    private Byte cleanSheets;
    private Short saves;

    public Player(String club, String name) {
        this.club = club;
        this.name = name;
    }

    public Player() { }

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

    public Byte getGoals() {
        return goals;
    }

    public Byte getAssists() {
        return assists;
    }

    public Short getShots() {
        return shots;
    }

    public Byte getCleanSheets() {
        return cleanSheets;
    }

    public Short getSaves() {
        return saves;
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

    public void setGoals(Byte goals) {
        this.goals = goals;
    }

    public void setAssists(Byte assists) {
        this.assists = assists;
    }

    public void setShots(Short shots) {
        this.shots = shots;
    }

    public void setCleanSheets(Byte cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public void setSaves(Short saves) {
        this.saves = saves;
    }
}
