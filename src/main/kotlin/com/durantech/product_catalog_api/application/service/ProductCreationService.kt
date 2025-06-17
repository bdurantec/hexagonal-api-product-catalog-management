package com.durantech.product_catalog_api.application.service

import com.durantech.product_catalog_api.domain.model.Product
import com.durantech.product_catalog_api.domain.port.ProductRepositoryPort
import com.durantech.product_catalog_api.domain.usecase.ProductCreationUseCase
import org.springframework.stereotype.Component

@Component
class ProductCreationService(
    val productRepositoryPort: ProductRepositoryPort
) : ProductCreationUseCase {
    override fun createProduct(product: Product) {
        productRepositoryPort.create(product)
    }
}