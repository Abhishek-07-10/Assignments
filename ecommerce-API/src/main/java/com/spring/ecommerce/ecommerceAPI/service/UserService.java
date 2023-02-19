package com.spring.ecommerce.ecommerceAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ecommerce.ecommerceAPI.dao.UserRepo;
import com.spring.ecommerce.ecommerceAPI.model.User;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public void createUser(User u) {
        repo.save(u);
    }

    public List<User> getAllUser() {
        return repo.findAll();
    }

    public User getUserById(Integer id){
        return repo.findById(id).get();
    }
    
}
