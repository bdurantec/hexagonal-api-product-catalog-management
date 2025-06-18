package com.durantech.product_catalog_api.adapter.inbound.controller

import com.durantech.product_catalog_api.adapter.inbound.controller.dto.ProductCreationRequestDTO
import com.durantech.product_catalog_api.adapter.inbound.controller.dto.ProductCreationResponseDTO
import com.durantech.product_catalog_api.adapter.inbound.controller.dto.toDomain
import com.durantech.product_catalog_api.adapter.inbound.controller.dto.toResponseDTO
import com.durantech.product_catalog_api.domain.usecase.ProductManagementUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController()
@RequestMapping("/products")
class ProductController(
    private val productManagementUseCase: ProductManagementUseCase
) {
    @GetMapping("/{productId}")
    fun findProduct(@PathVariable productId: UUID): ResponseEntity<ProductCreationResponseDTO> {
        val product = productManagementUseCase.findProductById(productId)
        return ResponseEntity.status(200).body(product.toResponseDTO())
    }

    @PostMapping
    fun createProduct(
        @RequestBody request: ProductCreationRequestDTO
    ): ResponseEntity<ProductCreationResponseDTO> {
        val product = productManagementUseCase.createProduct(request.toDomain())
        return ResponseEntity.status(201).body(product.toResponseDTO())
    }
}