package com.spring.ecommerce.ecommerceAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommerce.ecommerceAPI.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}
