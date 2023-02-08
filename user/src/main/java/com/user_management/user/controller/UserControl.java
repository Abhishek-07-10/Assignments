package com.user_management.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user_management.user.model.UserModel;
import com.user_management.user.service.UserService;

@RestController
@RequestMapping("/usermanagement")
public class UserControl {
    
    @Autowired
    UserService service;

    @PostMapping("/add")                        // Create user
    public void addUser(@RequestBody UserModel model){
        service.addNewUser(model);
    }

    @GetMapping("/getuser/id/{id}")             // Read user by id
    public UserModel getUser(@PathVariable int id){
        return service.getTheUser(id);
    }

    @GetMapping("/getuser")                     // Read all user
    public List<UserModel> getAllUser(){
        try {
            return service.getTheAllUser();
        } catch (Exception e) {
            System.out.println(e);
             return null;
        }
    }

    @PutMapping("/update/id/{id}")              // Update user by id
    public void updateUser(@PathVariable int id, @RequestBody UserModel model){
        service.updateTheUser(id, model);
    }

    @DeleteMapping("/delete/id/{id}")           // Delete user
    public void deleteUser(@PathVariable int id){
        service.deleteTheUser(id);
    }
}
