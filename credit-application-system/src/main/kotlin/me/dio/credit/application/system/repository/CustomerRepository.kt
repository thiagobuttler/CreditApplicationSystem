package me.dio.credit.application.system.repository

import me.dio.credit.application.system.entity.Custumer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Custumer, Long>{
}