package com.durantech.product_catalog_api.domain.port

import com.durantech.product_catalog_api.domain.model.Product
import java.util.UUID

interface ProductRepositoryPort {
    fun findById(id: UUID): Product?
    fun create(product: Product): Product
}