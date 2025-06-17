package com.durantech.product_catalog_api.adapter.inbound.controller

import com.durantech.product_catalog_api.adapter.inbound.controller.dto.ProductCreationRequest
import com.durantech.product_catalog_api.adapter.inbound.controller.dto.ProductCreationResponse
import com.durantech.product_catalog_api.application.mapper.toDomain
import com.durantech.product_catalog_api.domain.usecase.ProductManagementUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController()
@RequestMapping("/products")
class ProductController(
    private val productManagementUseCase: ProductManagementUseCase
) {
    @GetMapping()
    fun listProducts(): ResponseEntity<List<String>> {
        return ResponseEntity.status(200).body(listOf())
    }

    @GetMapping("/{id}")
    fun findProduct(@PathVariable id: UUID): ResponseEntity<ProductCreationResponse> {
        val product = productManagementUseCase.findProductById(id)
        return ResponseEntity.status(200).body(product.toResponseDTO())
    }

    @PostMapping()
    fun createProduct(
        @RequestBody request: ProductCreationRequest
    ): ResponseEntity<ProductCreationResponse> {
        val product = productManagementUseCase.createProduct(request.toDomain())
        return ResponseEntity.status(200).body(product.toResponseDTO())
    }
}