package com.durantech.product_catalog_api.adapter.inbound.controller

import com.durantech.product_catalog_api.adapter.inbound.controller.dto.ProductCreationRequest
import com.durantech.product_catalog_api.application.mapper.toDomain
import com.durantech.product_catalog_api.domain.usecase.ProductCreationUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/products")
class ProductController(
    private val productCreationUseCase: ProductCreationUseCase
) {
    @GetMapping()
    fun listProducts(): ResponseEntity<List<String>> {
        return ResponseEntity.status(200).body(listOf())
    }

    @PostMapping()
    fun createProduct(
        @RequestBody request: ProductCreationRequest
    ): ResponseEntity<String> {
        val product = productCreationUseCase.createProduct(request.toDomain())
        return ResponseEntity.status(201).body("")
    }

}