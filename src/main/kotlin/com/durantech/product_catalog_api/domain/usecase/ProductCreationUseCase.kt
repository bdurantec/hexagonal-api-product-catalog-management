package com.durantech.product_catalog_api.domain.usecase

import com.durantech.product_catalog_api.domain.model.Product

interface ProductCreationUseCase {
    fun createProduct(product: Product)
}