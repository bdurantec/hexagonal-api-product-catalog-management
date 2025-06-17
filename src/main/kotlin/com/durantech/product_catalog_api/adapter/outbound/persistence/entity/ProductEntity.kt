package com.durantech.product_catalog_api.adapter.outbound.persistence.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table
data class ProductEntity(
    @Id
    var id: UUID? = null,
    val name: String
)