package com.butler.fantasyLeaguePracProj.repositories;

import com.butler.fantasyLeaguePracProj.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
