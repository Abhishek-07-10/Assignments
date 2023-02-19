package com.spring.ecommerce.ecommerceAPI.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ecommerce.ecommerceAPI.model.User;
import com.spring.ecommerce.ecommerceAPI.service.UserService;

@RestController
@RequestMapping("/user")
public class UserControl {
    
    @Autowired
    UserService service;

    @PostMapping("/createUser")
    public void createUser(@RequestBody User u){
        service.createUser(u);
    } 

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return service.getAllUser();
    }

    @GetMapping("/userId/{id}")
    public User getUserById(@PathVariable Integer id){
        return service.getUserById(id);
    }
}
