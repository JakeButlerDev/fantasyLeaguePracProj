package com.butler.fantasyLeaguePracProj.controllers;


import com.butler.fantasyLeaguePracProj.models.Season;
import com.butler.fantasyLeaguePracProj.repositories.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/seasons")
public class SeasonController {

    @Autowired
    private SeasonRepository seasonRepository;

    @GetMapping("/")
    public ResponseEntity<?> getAllSeasons() {
        List<Season> allSeasons = seasonRepository.findAll();   // Think later about Set > List?
        return new ResponseEntity<>(allSeasons, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSeasonById(@PathVariable Long id) {
        Season foundSeason = seasonRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        return new ResponseEntity<>(foundSeason, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> createOneSeason(@RequestBody Season newSeasonData) {
        try {
            Season newSeason = seasonRepository.save(newSeasonData);
            return new ResponseEntity<>(newSeason, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

//    @PostMapping("/{id}")
//    public ResponseEntity<?> updateOneSeason(@PathVariable Long id, @RequestBody Season updatedSeasonData) {
//        Season seasonToUpdate = seasonRepository.findById(id).orElseThrow(
//                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
//        );
//        if (updatedSeasonData.)
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOneSeason(@PathVariable Long id) {
        Season deletedSeason = seasonRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        seasonRepository.deleteById(id);
        return new ResponseEntity<>(deletedSeason, HttpStatus.OK);
    }

}
