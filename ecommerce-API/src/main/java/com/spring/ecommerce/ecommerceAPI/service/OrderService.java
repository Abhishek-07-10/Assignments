package com.spring.ecommerce.ecommerceAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ecommerce.ecommerceAPI.dao.OrderRepo;
import com.spring.ecommerce.ecommerceAPI.model.Orders;

@Service
public class OrderService {
    
    @Autowired
    OrderRepo repo;

    public void createOrder(Orders o) {
        repo.save(o);
    }

    public Orders getOrderById(Integer id) {
        return repo.findById(id).get();
    }
    
}
