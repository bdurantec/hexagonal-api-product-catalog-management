package com.durantech.product_catalog_api.domain.port

import com.durantech.product_catalog_api.domain.model.Product
import java.util.*

interface ProductRepositoryPort {
    fun findById(id: UUID): Optional<Product>
    fun create(product: Product): Product
}