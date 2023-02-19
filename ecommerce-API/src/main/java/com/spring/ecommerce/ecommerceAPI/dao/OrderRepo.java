package com.spring.ecommerce.ecommerceAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommerce.ecommerceAPI.model.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer> {
    
}
