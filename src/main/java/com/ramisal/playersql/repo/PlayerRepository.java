package com.ramisal.playersql.repo;

import com.ramisal.playersql.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {
}
