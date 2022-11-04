package com.butler.fantasyLeaguePracProj.models;

public class Defender extends Player{

    // inherits id, name, rostered, gamesPlayed, minutesPlayed, teamsRostered

    public Defender() {
        super();
    }

    protected Byte goals;
    protected Byte assists;
    protected Short shots;
    private String club;
    private String name;
    private Boolean rostered;
    private Integer gamesPlayed;
    private double minutesPlayed;

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

    public double getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(double minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }
}
