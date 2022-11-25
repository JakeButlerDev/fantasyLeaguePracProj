package com.butler.fantasyLeaguePracProj.controllers;


import com.butler.fantasyLeaguePracProj.models.Season;
import com.butler.fantasyLeaguePracProj.repositories.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public ResponseEntity<?> createOneSeason(@RequestBody Season newSeasonData) {
        try {
            Season newSeason = seasonRepository.save(newSeasonData);
            return new ResponseEntity<>(newSeason, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
