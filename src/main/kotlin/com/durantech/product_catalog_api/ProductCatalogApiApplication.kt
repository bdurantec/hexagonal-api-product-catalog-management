package com.durantech.product_catalog_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductCatalogApiApplication

fun main(args: Array<String>) {
	runApplication<ProductCatalogApiApplication>(*args)
}
