package com.butler.fantasyLeaguePracProj.repositories;

import com.butler.fantasyLeaguePracProj.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PlayerRepository extends JpaRepository<Player, Long> {

//    Set<Player> findAllBySeason_Team_id(Long id);

    Set<Player> findAllByClub(String club);

    Set<Player> findAllByPosition(String position);

    Set<Player> findAllByIsRostered(Boolean isRostered);    // This can return rostered and not rostered

    // find by name in future? search only string user has entered in box and return all matches
}
