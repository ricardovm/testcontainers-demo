package dev.ricardovm.testcontainers_demo.cars

import dev.ricardovm.testcontainers_demo.BaseITTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
internal class CarRepositoryTest : BaseITTest() {

    @Autowired
    lateinit var carRepository: CarRepository

    @Test
    @Transactional
    fun `should save`() {
        val car = Car(model = "McQueen")

        carRepository.save(car)

        assertNotNull(car.id)
    }
}