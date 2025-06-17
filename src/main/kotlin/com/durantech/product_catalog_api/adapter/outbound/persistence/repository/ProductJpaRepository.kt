package com.durantech.product_catalog_api.adapter.outbound.persistence.repository

import com.durantech.product_catalog_api.adapter.outbound.persistence.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProductJpaRepository : JpaRepository<ProductEntity, UUID> {
}