package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Season season;

    private String club;
    private String name;
    private Boolean isRostered;
    private Integer gamesPlayed;
    private Double minutesPlayed;
    private Byte goals;
    private Byte assists;
    private Short shots;
    private Byte cleanSheets;
    private Short saves;
    private double fantasyPointsScored;
    private String position;


    public Player() { }

    public Player(Byte goals, Byte assists, Short shots, String club, String name, Boolean isRostered, Integer gamesPlayed, Double minutesPlayed, Byte cleanSheets, Short saves, String position) {
        this.goals = goals;
        this.assists = assists;
        this.shots = shots;
        this.club = club;
        this.name = name;
        this.isRostered = isRostered;
        this.gamesPlayed = gamesPlayed;
        this.minutesPlayed = minutesPlayed;
        this.cleanSheets = cleanSheets;
        this.saves = saves;
        this.position = position;
    }

    public void setId(Long id) {
        this.id = id;
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
        return isRostered;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRostered(Boolean isRostered) {
        this.isRostered = isRostered;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public double getFantasyPointsScored() {
        return fantasyPointsScored;
    }

    public void setFantasyPointsScored(double fantasyPointsScored) {
        this.fantasyPointsScored = fantasyPointsScored;
    }

    //TODO: public Double calculatePlayerPoints() {

//    }

    // TODO: public Double calculatePointsPerGame() {

//    }
}
