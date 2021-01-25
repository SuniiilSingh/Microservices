package com.sun.product.utility;


import com.sun.product.Entity.ProductEntiry;
import com.sun.product.dto.ProductDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductUtil {
    @Autowired
    private ModelMapper modelMapper;

    public ProductEntiry convertDtoToEntity(ProductDto productDto) {

        return modelMapper.map(productDto, ProductEntiry.class);
    }


    public ProductDto convertEntityToDto(ProductEntiry productEntiry) {

        return modelMapper.map(productEntiry, ProductDto.class);
    }

    public List<ProductDto> convertEntityToDtoList(List<ProductEntiry> productEntiries) {
        return (List<ProductDto>) modelMapper.map(productEntiries, new TypeToken<List<ProductDto>>(){}.getType());
    }
}
