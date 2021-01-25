package com.sun.product.service;


import com.sun.product.Entity.ProductEntiry;
import com.sun.product.dto.ProductDto;
import com.sun.product.repository.ProductRepository;
import com.sun.product.utility.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductUtil  productUtil;
    @Override
    public ResponseEntity<ProductDto> addProduct(ProductDto productDto) {
        ProductEntiry productEntiry=productRepository.save(productUtil.convertDtoToEntity(productDto));
        ProductDto productDto1=productUtil.convertEntityToDto(productEntiry);
        return new ResponseEntity<>(productDto1, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ProductDto> getProductById(Integer productId) {
        ProductEntiry productEntiry=productRepository.findById(productId).get();
        ProductDto productDto=productUtil.convertEntityToDto(productEntiry);


        return new ResponseEntity<>(productDto,HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<List<ProductDto>> getAllProduct() {
        List<ProductEntiry> productEntiries =productRepository.findAll();
        List<ProductDto> productDtoList =productUtil.convertEntityToDtoList(productEntiries);
        return new ResponseEntity<>(productDtoList,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductDto> updateProductById(ProductDto productDto, Integer productId) {
        if(productRepository.existsById(productId)){
            productDto.setProductId(productId);
            ProductEntiry productEntiry=productRepository.save(productUtil.convertDtoToEntity(productDto));
            ProductDto productDto1=productUtil.convertEntityToDto(productEntiry);
            return new ResponseEntity<>(productDto1, HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>(new ProductDto(), HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
