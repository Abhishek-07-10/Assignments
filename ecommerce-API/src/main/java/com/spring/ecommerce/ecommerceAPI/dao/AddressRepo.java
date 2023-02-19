package com.spring.ecommerce.ecommerceAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommerce.ecommerceAPI.model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {
    
}
