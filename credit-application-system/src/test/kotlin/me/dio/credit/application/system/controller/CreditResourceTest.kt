package me.dio.credit.application.system.controller

import com.fasterxml.jackson.databind.ObjectMapper
import me.dio.credit.application.system.dto.CreditDto
import me.dio.credit.application.system.dto.CustomerDto
import me.dio.credit.application.system.repository.CreditRepository
import me.dio.credit.application.system.repository.CustomerRepository
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import java.math.BigDecimal
import java.time.LocalDate

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
@ContextConfiguration
class CreditResourceTest {
    @Autowired private lateinit var creditRepository: CreditRepository
    @Autowired private lateinit var customerRepository: CustomerRepository
    @Autowired private lateinit var mockMvc: MockMvc
    @Autowired private lateinit var objectMapper: ObjectMapper

    companion object {
        const val URL = "/api/credits"
    }

    @BeforeEach fun setup() {
        creditRepository.deleteAll()
        builderCustomerDto()?.let { customerRepository.save(it.toEntity()) }
    }
    @AfterEach fun tearDown() {
        creditRepository.deleteAll()
        customerRepository.deleteAll()
    }


    @Test
    fun `should create a credit and return 201 status`() {
        // given
        val creditDto: CreditDto = builderCreditDto()
        val valueAsString: String = objectMapper.writeValueAsString(creditDto)
        // when
        // then
        mockMvc.perform(MockMvcRequestBuilders.post(URL).contentType(MediaType.APPLICATION_JSON).content(valueAsString))
            .andExpect(MockMvcResultMatchers.status().isCreated)
    }

    private fun builderCreditDto(
        creditValue: BigDecimal = BigDecimal("10000.0"),
        dayFirstOfInstallment: LocalDate = LocalDate.of(2024, 3, 10),
        numberOfInstallments: Int = 2,
        customerId: Long = 1
    ) = CreditDto (
        creditvalue = creditValue,
        dayFirstOfInstallment = dayFirstOfInstallment,
        numberOfInstallments = numberOfInstallments,
        customerId = customerId
    )
    private fun builderCustomerDto(
        firstName: String = "Taylor",
        lastName: String = "Swift",
        cpf: String = "914.491.250-18",
        email: String = "taylorswift@outlook.com",
        income: BigDecimal = BigDecimal.valueOf(1100000000.0),
        password: String = "131313",
        zipCode: String = "131313",
        street: String = "Cornelia Street, 13"
    ) = CustomerDto (
        firstName = firstName,
        lastName = lastName,
        cpf = cpf,
        email = email,
        income = income,
        password = password,
        zipCode = zipCode,
        street = street
    )
}
