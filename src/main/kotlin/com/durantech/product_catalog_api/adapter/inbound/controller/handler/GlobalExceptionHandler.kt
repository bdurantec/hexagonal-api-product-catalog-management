package com.durantech.product_catalog_api.adapter.inbound.controller.handler

import com.durantech.product_catalog_api.adapter.inbound.controller.dto.ErrorResponseDTO
import com.durantech.product_catalog_api.domain.exception.ProductNotFoundException
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException

@RestControllerAdvice
class GlobalExceptionHandler(
    private val servletRequest: HttpServletRequest
) {

    @ExceptionHandler(MethodArgumentTypeMismatchException::class)
    fun handleMethodArgumentTypeMismatch(ex: MethodArgumentTypeMismatchException): ResponseEntity<ErrorResponseDTO> {
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(
                ErrorResponseDTO(
                    status = HttpStatus.BAD_REQUEST,
                    error = HttpStatus.BAD_REQUEST.name,
                    message = "Invalid value for parameter ${ex.name}: expected type is ${ex.requiredType?.simpleName}",
                    path = servletRequest.requestURI
                )
            )
    }

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun handleInvalidJson(ex: HttpMessageNotReadableException): ResponseEntity<ErrorResponseDTO> {
        val response = ErrorResponseDTO(
            status = HttpStatus.BAD_REQUEST,
            error = "Invalid JSON",
            message = "Malformed request body",
            path = servletRequest.requestURI
        )
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response)
    }

    @ExceptionHandler(ProductNotFoundException::class)
    fun handleNotFound(ex: ProductNotFoundException): ResponseEntity<ErrorResponseDTO> {
        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(
                ErrorResponseDTO(
                    status = HttpStatus.NOT_FOUND,
                    error = HttpStatus.NOT_FOUND.name,
                    message = ex.message ?: "",
                    path = servletRequest.requestURI
                )
            )
    }

    @ExceptionHandler(Exception::class)
    fun handleGeneric(ex: Exception): ResponseEntity<ErrorResponseDTO> {
        return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(
                ErrorResponseDTO(
                    status = HttpStatus.INTERNAL_SERVER_ERROR,
                    error = "Unknown error not mapped",
                    message = ex.message ?: "",
                    path = servletRequest.requestURI
                )
            )
    }
}