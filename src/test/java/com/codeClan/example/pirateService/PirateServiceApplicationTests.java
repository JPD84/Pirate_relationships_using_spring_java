package com.codeClan.example.pirateService;

import com.codeClan.example.pirateService.Models.Pirate;
import com.codeClan.example.pirateService.Models.Raid;
import com.codeClan.example.pirateService.Models.Ship;
import com.codeClan.example.pirateService.Repositories.PirateRepository;
import com.codeClan.example.pirateService.Repositories.RaidRepository;
import com.codeClan.example.pirateService.Repositories.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPirateAndShip(){
		Ship ship = new Ship("Marie Celeste");
		shipRepository.save(ship);
		Pirate pirate = new Pirate("Captain", "Morgan", 45, ship);
		pirateRepository.save(pirate);
		Raid raid = new Raid("Ransack Aldis");
		raidRepository.save(raid);
		pirate.addRaid(raid);
		pirateRepository.save(pirate);
	}

}
