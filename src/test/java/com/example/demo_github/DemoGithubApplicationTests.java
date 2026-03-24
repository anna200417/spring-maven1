package com.example.demo_github;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoGithubApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(false, "Erreur volontaire"); // Cette ligne fera planter le test
	}

}
