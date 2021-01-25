package com.sun.product.controller;

import com.sun.product.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface ProductController {
    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto);
    @RequestMapping(value ="/getProductById/{productId}",method = RequestMethod.GET)
    public ResponseEntity<ProductDto> getProductById(@PathVariable Integer productId);
    @RequestMapping(value = "/getAllProduct",method = RequestMethod.GET)
    public ResponseEntity<List<ProductDto>> getAllProduct();
    @RequestMapping(value = "/updateProductById/{productId}",method = RequestMethod.PUT)
    public ResponseEntity<ProductDto> updateProduct(@RequestBody ProductDto productDto, @PathVariable Integer productId);
}
