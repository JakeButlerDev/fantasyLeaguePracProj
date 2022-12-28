package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "playerId")
public class Keeper extends Player{

    public Keeper() {
    }

    public Keeper(Byte goals, Byte assists, Short shots, String club, String name, Boolean isRostered, Integer gamesPlayed, Double minutesPlayed, Byte cleanSheets, Short saves, PositionType position) {
        super(goals, assists, shots, club, name, isRostered, gamesPlayed, minutesPlayed, cleanSheets, saves, position);
    }
}
