package com.durantech.product_catalog_api.adapter.outbound.persistence.mapper

import com.durantech.product_catalog_api.adapter.outbound.persistence.entity.ProductEntity
import com.durantech.product_catalog_api.domain.model.Product

fun Product.toEntity(): ProductEntity {
    return ProductEntity(
        name = this.name
    )
}

fun ProductEntity.toDomain(): Product {
    return Product(
        name = this.name
    )
}