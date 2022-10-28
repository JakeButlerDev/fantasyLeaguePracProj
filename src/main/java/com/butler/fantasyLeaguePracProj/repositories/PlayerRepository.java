package com.butler.fantasyLeaguePracProj.repositories;

import com.butler.fantasyLeaguePracProj.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
