package com.durantech.product_catalog_api.domain.usecase

import com.durantech.product_catalog_api.domain.model.Product
import java.util.*

interface ProductManagementUseCase {
    fun createProduct(product: Product): Product
    fun findProductById(id: UUID): Product
}