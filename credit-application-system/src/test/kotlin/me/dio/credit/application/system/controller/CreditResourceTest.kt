/*package me.dio.credit.application.system.controller

import com.fasterxml.jackson.databind.ObjectMapper
import me.dio.credit.application.system.repository.CreditRepository
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
@ContextConfiguration
class CreditResourceTest {
    private lateinit var creditRepository: CreditRepository
    private lateinit var mockMvc: MockMvc
    private lateinit var objectMapper: ObjectMapper

    companion object {
        const val URL = "/api/credits"
    }

    @BeforeEach fun setup() = creditRepository.deleteAll()
    @AfterEach fun tearDown() = creditRepository.deleteAll()

    @Test
    fun `should create a credit and return 201 status`() {

    }
}
*/