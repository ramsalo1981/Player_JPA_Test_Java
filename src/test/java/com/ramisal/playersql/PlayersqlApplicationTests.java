package com.ramisal.playersql;

import com.ramisal.playersql.model.Player;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.ramisal.playersql.repo.PlayerRepository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class PlayersqlApplicationTests {

	@Autowired
	private PlayerRepository repository;
	@Test
	public void contextLoads() {
		// Create and save a new player
		Player player = new Player();
		player.setName("Rami");
		player.setScore(2);

		// Save the player to the repository
		Player savedPlayer = repository.save(player);

		// Fetch the player by ID
		Player fetchedPlayer = repository.findById(savedPlayer.getId()).orElse(null);

		// Assert that the fetched player is not null
		assertNotNull(fetchedPlayer);
		// Additional assertions can be made here
	}

}
