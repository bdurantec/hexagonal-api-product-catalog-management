package com.durantech.product_catalog_api.adapter.outbound

import com.durantech.product_catalog_api.adapter.outbound.persistence.mapper.toDomain
import com.durantech.product_catalog_api.adapter.outbound.persistence.mapper.toEntity
import com.durantech.product_catalog_api.adapter.outbound.persistence.repository.ProductJpaRepository
import com.durantech.product_catalog_api.domain.model.Product
import com.durantech.product_catalog_api.domain.port.ProductRepositoryPort
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProductRepositoryImpl(
    private val productJpaRepository: ProductJpaRepository
) : ProductRepositoryPort {

    override fun findById(id: UUID): Optional<Product> {
        return productJpaRepository.findById(id)
            .map { entity -> entity.toDomain() }
    }

    override fun create(product: Product): Product {
        val entity = product.toEntity()
        val saved = productJpaRepository.save(entity)
        return saved.toDomain()
    }
}