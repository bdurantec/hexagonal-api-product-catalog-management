package com.durantech.product_catalog_api.adapter.outbound.persistence.mapper

import com.durantech.product_catalog_api.adapter.outbound.persistence.entity.ProductEntity
import com.durantech.product_catalog_api.domain.model.Product

fun Product.toEntity(): ProductEntity {
    return ProductEntity(
        name = this.name,
        description = this.description,
        productValue = this.value
    )
}

fun ProductEntity.toDomain(): Product {
    return Product(
        id = this.id,
        name = this.name,
        description = this.description,
        value = this.productValue
    )
}