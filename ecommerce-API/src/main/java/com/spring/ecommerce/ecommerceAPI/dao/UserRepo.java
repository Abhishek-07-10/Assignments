package com.spring.ecommerce.ecommerceAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommerce.ecommerceAPI.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
    
}
