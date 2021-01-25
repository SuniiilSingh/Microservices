package com.sun.product.repository;

import com.sun.product.Entity.ProductEntiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntiry,Integer> {
}
