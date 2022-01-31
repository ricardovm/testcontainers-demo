package dev.ricardovm.testcontainers_demo.cars

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CarRepository : CrudRepository<Car, Long>