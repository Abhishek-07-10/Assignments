package com.spring.ecommerce.ecommerceAPI.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ecommerce.ecommerceAPI.model.Orders;
import com.spring.ecommerce.ecommerceAPI.service.OrderService;

@RestController
@RequestMapping("/order")
public class Ordercontrol {
    
    @Autowired
    OrderService service;

    @PostMapping("/createorder")
    public void createUser(@RequestBody Orders o){
        service.createOrder(o);

    }

    @GetMapping("/orderid/{id}")
    public Orders getOrderById(@PathVariable Integer id){
        return service.getOrderById(id);
    }

}
