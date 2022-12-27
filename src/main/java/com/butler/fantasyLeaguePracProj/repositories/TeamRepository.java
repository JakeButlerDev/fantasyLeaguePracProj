package com.butler.fantasyLeaguePracProj.repositories;

import com.butler.fantasyLeaguePracProj.models.FantasyTeam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TeamRepository extends JpaRepository<FantasyTeam, Long> {

    Set<FantasyTeam> findAllByLeague_id(Long leagueId);

    // find by name just like in PlayerRepository
}
