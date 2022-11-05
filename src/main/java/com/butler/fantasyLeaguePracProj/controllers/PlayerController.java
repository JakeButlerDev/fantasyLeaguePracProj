package com.butler.fantasyLeaguePracProj.controllers;

import com.butler.fantasyLeaguePracProj.models.Player;
import com.butler.fantasyLeaguePracProj.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//@CrossOrigin
@RestController
@RequestMapping ("/api/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @PostMapping
    public ResponseEntity<?> createOnePlayer(@RequestBody Player newPlayer) {
        try {
            Player addedPlayer = playerRepository.save(newPlayer);
            return new ResponseEntity<>(addedPlayer, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

    @GetMapping ("/")
    public ResponseEntity<?> getAllPlayers() {
        List<Player> allPlayers = playerRepository.findAll();
        return new ResponseEntity<>(allPlayers, HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<?> getPlayerById(@PathVariable Long id) {
        Player foundPlayer = playerRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new ResponseEntity<>(foundPlayer, HttpStatus.OK);
    }

    @PostMapping ("/{id}")
    public ResponseEntity<?> postPlayerById(@PathVariable Long id, @RequestBody Player updatedPlayerData) {
        Player updatedPlayer =playerRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (updatedPlayerData.getClub() != null && !updatedPlayerData.getClub().equals("")) {
            updatedPlayer.setClub(updatedPlayerData.getClub());
        }
        if (!updatedPlayerData.getName().equals("")) {
            updatedPlayer.setName(updatedPlayerData.getName());
        }
        //TODO: Below is throwing error due to using subclasses so getRostered is now in Position classes. Look into more tomorrow
        if (updatedPlayerData.getRostered() != null) {
            updatedPlayer.setRostered(updatedPlayerData.getRostered());
        }

        return new ResponseEntity<>(updatedPlayer, HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deletePlayerById(@PathVariable Long id) {
        //TODO: Not sure I want the below throw error, if id is not found we want SQL to silently ignore - look up additional info

        Player deletedPlayer = playerRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        playerRepository.deleteById(id);
        return new ResponseEntity<>(deletedPlayer, HttpStatus.OK);
    }
}
