package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class FantasyTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int maxPlayers;
    private int currentPlayers;
    private float pointsScored;
    private int waiverOrder;
    private double remainingFaab;

    @ManyToMany(mappedBy = "teamsRostered")
    private List<Player> playersRostered;

    // Team statistics
    private Integer wins;
    private Integer losses;
    private Integer draws;
    private Integer points;     // This is the total points for team in league standings, win = 3, draw = 1, loss = 0
    private Double fantasyPointsScored;     // Do I want this and pointsAllowed? Could just return sum of all gameweek points to date
    private Double fantasyPointsAllowed;

    public FantasyTeam(String name, int currentPlayers){
        this.name = name;
        this.currentPlayers = currentPlayers;
    }

    public FantasyTeam() { }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public void setCurrentPlayers(int currentPlayers) {
        this.currentPlayers = currentPlayers;
    }

    public void setPointsScored(float pointsScored) {
        this.pointsScored = pointsScored;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public int getCurrentPlayers() {
        return currentPlayers;
    }

    public float getPointsScored() {
        return pointsScored;
    }

    public int getWaiverOrder() {
        return waiverOrder;
    }

    public void setWaiverOrder(int waiverOrder) {
        this.waiverOrder = waiverOrder;
    }

    public double getRemainingFaab() {
        return remainingFaab;
    }

    public void setRemainingFaab(double remainingFaab) {
        this.remainingFaab = remainingFaab;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Player> getPlayersRostered() {
        return playersRostered;
    }

    public void setPlayersRostered(List<Player> playersRostered) {
        this.playersRostered = playersRostered;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Double getFantasyPointsScored() {
        return fantasyPointsScored;
    }

    public void setFantasyPointsScored(Double fantasyPointsScored) {
        this.fantasyPointsScored = fantasyPointsScored;
    }

    public Double getFantasyPointsAllowed() {
        return fantasyPointsAllowed;
    }

    public void setFantasyPointsAllowed(Double fantasyPointsAllowed) {
        this.fantasyPointsAllowed = fantasyPointsAllowed;
    }
}
