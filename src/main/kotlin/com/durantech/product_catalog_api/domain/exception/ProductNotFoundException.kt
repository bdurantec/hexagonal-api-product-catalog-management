package com.durantech.product_catalog_api.domain.exception

import java.util.*

class ProductNotFoundException(productId: UUID) :
    RuntimeException("Product $productId was not found in database")