package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "playerId")
public class Forward extends Player{

    public Forward () {
        super();
    }

    public Forward(Byte goals, Byte assists, Short shots, String club, String name, Boolean isRostered, Integer gamesPlayed, Double minutesPlayed, Byte cleanSheets, Short saves, PositionType position) {
        super(goals, assists, shots, club, name, isRostered, gamesPlayed, minutesPlayed, cleanSheets, saves, position);
    }

    public Double calculateFantasyPoints() {
        return (double) (getGoals() * 9 + getAssists() * 6 + getShots() * 2);
    }

}

/* Scoring
    key passes = 2
    goals = 9
    assists = 6
    tackles = 0
    shots on target = 2
    crosses = 1
    clearances = 0
    goals against = 0
    saves = 0
    dispossessions = -0.5
    clean sheets = 0
    aerials won = 0.5
    dribbles = 1
    "fantasy" assists = 6
    penalty kick missed = -6
    yellow card = -3
    red card = -7
    interceptions = 1
 */