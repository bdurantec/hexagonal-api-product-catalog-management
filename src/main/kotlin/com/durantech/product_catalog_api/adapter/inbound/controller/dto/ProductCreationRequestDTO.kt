package com.durantech.product_catalog_api.adapter.inbound.controller.dto

import java.math.BigDecimal

data class ProductCreationRequestDTO(
    val name: String,
    val description: String,
    val value: BigDecimal
)