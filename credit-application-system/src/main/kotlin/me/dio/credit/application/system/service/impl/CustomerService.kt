package me.dio.credit.application.system.service.impl

import me.dio.credit.application.system.dto.CustomerUpdateDto
import me.dio.credit.application.system.dto.CustomerView
import me.dio.credit.application.system.entity.Customer
import me.dio.credit.application.system.exception.BusinessException
import me.dio.credit.application.system.repository.CustomerRepository
import me.dio.credit.application.system.service.ICustomerService
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

@Service
class CustomerService(
    private val customerRepository: CustomerRepository,
) : ICustomerService {
    override fun save(customer: Customer): Customer =
        this.customerRepository.save(customer)


    override fun findById(id: Long): Customer =
        this.customerRepository.findById(id).orElseThrow {
            throw BusinessException("Id $id not found")
        }

    override fun delete(id: Long) {
        val customer: Customer = this.findById(id)
        this.customerRepository.delete(customer)
        //this.customerRepository.deleteById(id)
    }

}
