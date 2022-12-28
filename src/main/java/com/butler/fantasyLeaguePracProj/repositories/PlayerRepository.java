package com.butler.fantasyLeaguePracProj.repositories;

import com.butler.fantasyLeaguePracProj.models.Forward;
import com.butler.fantasyLeaguePracProj.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Set;

@NoRepositoryBean
public interface PlayerRepository extends JpaRepository<Player, Long> {

//    Set<Player> findAllBySeason_Team_id(Long id);

    Set<Player> findAllByClub(String club);

    Set<Player> findAllByPosition(String position);

    Set<Player> findAllByIsRostered(Boolean isRostered);

    // find by name in future? search only string user has entered in box and return all matches
}
