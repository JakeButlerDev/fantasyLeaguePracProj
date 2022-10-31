package com.butler.fantasyLeaguePracProj.controllers;

import com.butler.fantasyLeaguePracProj.models.League;
import com.butler.fantasyLeaguePracProj.repositories.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.GracefulShutdownResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping ("/api/leagues")
public class LeagueController {

    @Autowired
    private LeagueRepository leagueRepository;

    @PostMapping
    public ResponseEntity<?> createOneLeague(@RequestBody League newLeague) {
        try {
            League createdLeague = leagueRepository.save(newLeague);
            return new ResponseEntity<>(newLeague, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping ("/")
    public ResponseEntity<?> getAllLeagues() {
        List<League> allLeagues = leagueRepository.findAll();
        return new ResponseEntity<>(allLeagues, HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<?> getLeagueById(@PathVariable Long id) {
        League foundLeague = leagueRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        return new ResponseEntity<>(foundLeague, HttpStatus.OK);
    }

    @PostMapping ("/{id}")
    public ResponseEntity<?> postLeagueById(@PathVariable Long id, @RequestBody League updatedLeagueData) {
        League updatedLeague = leagueRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        if (updatedLeagueData.getName() != null && !updatedLeagueData.getName().equals("")) {
            updatedLeague.setName(updatedLeagueData.getName());
        }

        return new ResponseEntity<>(updatedLeague, HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteLeagueById(@PathVariable Long id) {
        League deletedLeague = leagueRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        leagueRepository.deleteById(id);
        return new ResponseEntity<>(deletedLeague, HttpStatus.OK);
    }
}
