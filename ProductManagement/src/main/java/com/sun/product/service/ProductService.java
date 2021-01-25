package com.sun.product.service;

import com.sun.product.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ResponseEntity<ProductDto> addProduct(ProductDto productDto);

    ResponseEntity<ProductDto> getProductById(Integer productId);

    ResponseEntity<List<ProductDto>> getAllProduct();

    ResponseEntity<ProductDto> updateProductById(ProductDto productDto, Integer productId);
}
