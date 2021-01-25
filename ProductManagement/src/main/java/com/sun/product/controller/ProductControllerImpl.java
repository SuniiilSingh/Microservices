package com.sun.product.controller;

import com.sun.product.dto.ProductDto;
import com.sun.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllerImpl implements ProductController {
    @Autowired
    private ProductService productService;
    @Override
    public ResponseEntity<ProductDto> addProduct(ProductDto productDto) {
        return productService.addProduct(productDto);
    }

    @Override
    public ResponseEntity<ProductDto> getProductById(Integer productId) {
        return productService.getProductById(productId);
    }

    @Override
    public ResponseEntity<List<ProductDto>> getAllProduct() {
        return productService.getAllProduct();
    }

    @Override
    public ResponseEntity<ProductDto> updateProduct(ProductDto productDto, Integer productId) {
        return productService.updateProductById(productDto,productId);
    }
}
