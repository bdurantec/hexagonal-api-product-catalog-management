package com.durantech.product_catalog_api.application.service

import com.durantech.product_catalog_api.domain.model.Product
import com.durantech.product_catalog_api.domain.port.ProductRepositoryPort
import com.durantech.product_catalog_api.domain.usecase.ProductManagementUseCase
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProductManagementService(
    val productRepositoryPort: ProductRepositoryPort
) : ProductManagementUseCase {
    override fun createProduct(product: Product): Product {
        return productRepositoryPort.create(product)
    }

    override fun findProductById(id: UUID): Product {
        return productRepositoryPort.findById(id) ?: throw Exception("product $id not found")
    }
}