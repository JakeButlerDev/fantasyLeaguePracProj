package com.butler.fantasyLeaguePracProj.repositories;

import com.butler.fantasyLeaguePracProj.models.FantasyTeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<FantasyTeam, Long> {
}
