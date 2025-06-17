package com.durantech.product_catalog_api.domain.model

import java.math.BigDecimal
import java.util.*

data class Product(
    var id: UUID? = null,
    val name: String,
    val description: String,
    val value: BigDecimal
)
