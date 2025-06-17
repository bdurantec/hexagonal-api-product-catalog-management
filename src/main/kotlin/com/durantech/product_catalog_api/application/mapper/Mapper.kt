package com.durantech.product_catalog_api.application.mapper

import com.durantech.product_catalog_api.adapter.inbound.controller.dto.ProductCreationRequest
import com.durantech.product_catalog_api.domain.model.Product

fun ProductCreationRequest.toDomain(): Product {
    return Product(
        name = this.name,
        description = this.description,
        value = this.value
    )
}