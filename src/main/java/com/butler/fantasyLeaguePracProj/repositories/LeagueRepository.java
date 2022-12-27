package com.butler.fantasyLeaguePracProj.repositories;


import com.butler.fantasyLeaguePracProj.models.League;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface LeagueRepository extends JpaRepository<League, Long> {
//    Optional<League> findBySeason_Team_id(Long id);
//
//    Set<League> findBySeason_User_id(Long id);


}
