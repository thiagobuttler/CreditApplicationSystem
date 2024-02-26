package me.dio.credit.application.system.entity

import jakarta.persistence.*
import me.dio.credit.application.system.enummeration.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

@Entity
@Table(name = "Credit")
data class Credit(
    @Column(nullable = false, unique = true) var creditCode: UUID = UUID.randomUUID(),
    @Column(nullable = false) val creditValue: BigDecimal = BigDecimal.ZERO,
    @Column(nullable = false) val dayFirstOfInstallment: LocalDate,
    @Column(nullable = false) val numberOfInstallments: Int = 0,
    @Enumerated val status: Status = Status.IN_PROGRESS,
    /*@Enumerated(value = EnumType.STRING) val status: Status = Status.IN_PROGESS, para salvar o satus como texto no BD. Importante
    alterar tipo de dado na clonuda do BD nas migrations*/
    @ManyToOne var customer: Customer? = null,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)
