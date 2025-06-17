package com.durantech.product_catalog_api.adapter.inbound.controller.dto

import java.math.BigDecimal
import java.util.*

data class ProductCreationRequest(
    val name: String,
    val description: String,
    val value: BigDecimal
)

data class ProductCreationResponse(
    val id: UUID?,
    val name: String,
    val description: String,
    val value: BigDecimal
)
