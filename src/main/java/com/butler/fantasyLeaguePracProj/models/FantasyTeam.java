package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}
