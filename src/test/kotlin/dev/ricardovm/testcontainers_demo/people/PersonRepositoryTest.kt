package dev.ricardovm.testcontainers_demo.people

import dev.ricardovm.testcontainers_demo.BaseITTest
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
internal class PersonRepositoryTest : BaseITTest() {

    @Autowired
    lateinit var personRepository: PersonRepository

    @Test
    @Transactional
    fun `should save`() {
        val person = Person(name = "Ricardo", age = 40)

        personRepository.save(person)

        assertNotNull(person.id)
    }
}