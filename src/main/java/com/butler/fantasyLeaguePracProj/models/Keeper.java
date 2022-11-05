package com.butler.fantasyLeaguePracProj.models;

public class Keeper extends Player{

    // inherits id, name, rostered, gamesPlayed, minutesPlayed, teamsRostered, all individual statistics. Will need to create a calculatePoints() method in each subclass of Player

    public Keeper(Byte goals, Byte assists, Short shots, String club, String name, Boolean rostered, Integer gamesPlayed, Double minutesPlayed, Byte cleanSheets, Short saves) {
        super(goals, assists, shots, club, name, rostered, gamesPlayed, minutesPlayed, cleanSheets, saves);
    }

//    TODO: public Double calculatePlayerPoints() {
//
//    }
//
//    public Double calculatePointsPerGame() {
//
//    }

    @Override
    public String getClub() {
        return super.getClub();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Boolean getRostered() {
        return super.getRostered();
    }

    @Override
    public void setClub(String club) {
        super.setClub(club);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setRostered(Boolean rostered) {
        super.setRostered(rostered);
    }

    @Override
    public Integer getGamesPlayed() {
        return super.getGamesPlayed();
    }

    @Override
    public void setGamesPlayed(Integer gamesPlayed) {
        super.setGamesPlayed(gamesPlayed);
    }

    @Override
    public Double getMinutesPlayed() {
        return super.getMinutesPlayed();
    }

    @Override
    public void setMinutesPlayed(Double minutesPlayed) {
        super.setMinutesPlayed(minutesPlayed);
    }
    @Override
    public Byte getGoals() {
        return super.getGoals();
    }

    @Override
    public Byte getAssists() {
        return super.getAssists();
    }

    @Override
    public Short getShots() {
        return super.getShots();
    }

    @Override
    public void setGoals(Byte goals) {
        super.setGoals(goals);
    }

    @Override
    public void setAssists(Byte assists) {
        super.setAssists(assists);
    }

    @Override
    public void setShots(Short shots) {
        super.setShots(shots);
    }
    @Override
    public Byte getCleanSheets() {
        return super.getCleanSheets();
    }

    @Override
    public Short getSaves() {
        return super.getSaves();
    }

    @Override
    public void setCleanSheets(Byte cleanSheets) {
        super.setCleanSheets(cleanSheets);
    }

    @Override
    public void setSaves(Short saves) {
        super.setSaves(saves);
    }
}
