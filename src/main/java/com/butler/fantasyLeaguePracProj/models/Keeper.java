package com.butler.fantasyLeaguePracProj.models;

public class Keeper extends Player{

    // inherits id, name, rostered, gamesPlayed, minutesPlayed, teamsRostered

    public Keeper() {
        super();
    }

    protected Byte cleanSheets;
    protected Short saves;
    private String club;
    private String name;
    private Boolean rostered;
    private Integer gamesPlayed;
    private double minutesPlayed;

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
