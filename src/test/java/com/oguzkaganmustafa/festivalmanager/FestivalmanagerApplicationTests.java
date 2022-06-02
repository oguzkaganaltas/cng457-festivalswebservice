package com.oguzkaganmustafa.festivalmanager;

import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FestivalManagerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FestivalmanagerApplicationTests{
	@Autowired
	TestRestTemplate restTemplate;

	@LocalServerPort
	int port;

	@Test
	public void testConcertsByDescription()
	{
		assertTrue(this.restTemplate
				.getForObject("http://localhost:" + port + "/concertsbydescription?key=Man", Concert.class)
				.getDescription().contains("Man"));
	}
}
