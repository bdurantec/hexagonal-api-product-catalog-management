package com.durantech.product_catalog_api.adapter.inbound.controller.dto

import org.springframework.http.HttpStatus

data class ErrorResponseDTO(
    val status: HttpStatus,
    val error: String,
    val message: String,
    val path: String
)
