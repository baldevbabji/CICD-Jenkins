package com.sonata.springcicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCicdApplicationTests {
	private static final Logger log = LoggerFactory.getLogger(SpringCicdApplicationTests.class);
	@Test
	void contextLoads() {
		log.info(String.format("TestCases: Successful"));
	}
}
