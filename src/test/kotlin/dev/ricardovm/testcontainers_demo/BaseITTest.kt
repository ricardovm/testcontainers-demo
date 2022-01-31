package dev.ricardovm.testcontainers_demo

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@DirtiesContext
@Testcontainers
@ActiveProfiles("integration-tests")
@SpringBootTest
class BaseITTest {

    companion object {

        @JvmStatic
        @field:Container
        val postgreSQLContainer: PostgreSQLContainer<*> = PostgreSQLContainer("postgres:13")

        @JvmStatic
        @DynamicPropertySource
        fun properties(registry: DynamicPropertyRegistry) {
            registry.add("spring.cloud.gcp.sql.enabled", { false })
            registry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl)
            registry.add("spring.datasource.username", postgreSQLContainer::getUsername)
            registry.add("spring.datasource.password", postgreSQLContainer::getPassword)
        }
    }
}