package com.durantech.product_catalog_api.adapter.inbound.controller

import com.durantech.product_catalog_api.adapter.inbound.controller.dto.ProductCreationResponse
import com.durantech.product_catalog_api.domain.model.Product

fun Product.toResponseDTO(): ProductCreationResponse {
    return ProductCreationResponse(
        id = this.id,
        name = this.name,
        description = this.description,
        value = this.value
    )
}