package com.butler.fantasyLeaguePracProj.controllers;


import com.butler.fantasyLeaguePracProj.models.FantasyTeam;
import com.butler.fantasyLeaguePracProj.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//@CrossOrigin
@RestController
@RequestMapping("/api/fantasyTeam")
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @PostMapping
    public ResponseEntity<?> createOneTeam(@RequestBody FantasyTeam newTeam) {
        try {
            FantasyTeam createdTeam = teamRepository.save(newTeam);
            return new ResponseEntity<>(createdTeam, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllTeams() {
        List<FantasyTeam> allTeams = teamRepository.findAll();
        return new ResponseEntity<>(allTeams, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTeamById(@PathVariable Long id) {
        FantasyTeam foundTeam = teamRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new ResponseEntity<>(foundTeam, HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> postTeamById(@PathVariable Long id, @RequestBody FantasyTeam updatedTeamData) {
        FantasyTeam updatedTeam = teamRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (updatedTeamData.getName() != null && !updatedTeamData.getName().equals("")) {
            updatedTeam.setName(updatedTeamData.getName());
        }

        return new ResponseEntity<>(updatedTeam, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTeamById(@PathVariable Long id) {
        FantasyTeam deletedTeam = teamRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        teamRepository.deleteById(id);
        return new ResponseEntity<>(deletedTeam, HttpStatus.OK);
    }
}
