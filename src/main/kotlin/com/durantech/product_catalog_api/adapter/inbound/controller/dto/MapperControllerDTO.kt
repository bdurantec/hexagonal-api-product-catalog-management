package com.durantech.product_catalog_api.adapter.inbound.controller.dto

import com.durantech.product_catalog_api.domain.model.Product

fun Product.toResponseDTO(): ProductCreationResponseDTO {
    return ProductCreationResponseDTO(
        id = this.id,
        name = this.name,
        description = this.description,
        value = this.value
    )
}

fun ProductCreationRequestDTO.toDomain(): Product {
    return Product(
        name = this.name,
        description = this.description,
        value = this.value
    )
}