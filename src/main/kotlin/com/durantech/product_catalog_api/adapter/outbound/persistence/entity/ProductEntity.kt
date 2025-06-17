package com.durantech.product_catalog_api.adapter.outbound.persistence.entity

import jakarta.persistence.*
import java.math.BigDecimal
import java.util.*

@Entity
@Table(name = "product_entity")
data class ProductEntity(
    @Id
    @GeneratedValue
    var id: UUID? = null,
    @Column(name = "product_name")
    val name: String = "",
    @Column(name = "product_description")
    val description: String = "",
    @Column(name = "product_value")
    val productValue: BigDecimal = BigDecimal.ZERO
)