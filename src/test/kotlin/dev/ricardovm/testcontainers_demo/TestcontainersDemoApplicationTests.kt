package dev.ricardovm.testcontainers_demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest
@Testcontainers
class TestcontainersDemoApplicationTests : BaseITTest() {

	@Test
	fun contextLoads() {
	}

}
