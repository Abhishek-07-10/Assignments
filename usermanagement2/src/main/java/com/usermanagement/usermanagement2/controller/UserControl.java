package com.usermanagement.usermanagement2.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.usermanagement2.model.UserModel;
import com.usermanagement.usermanagement2.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usermanagement")
public class UserControl {

    @Autowired
    UserService service;

    @PostMapping("/addUser")
    public ResponseEntity<UserModel> addUser(@Valid @RequestBody UserModel requestModel) {
        requestModel.setDate(LocalDate.now());
        requestModel.setTime(LocalTime.now());
        service.addUser(requestModel);
        return new ResponseEntity<UserModel>(requestModel, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<UserModel> getAll() {
        return service.getAll();
    }

    @GetMapping("/getUser/{userId}")
    public UserModel getUserById(@PathVariable int userId) {
        return service.getUserById(userId);
    }

    @PutMapping("/updateUser/{userId}")
    public void updateUser(@PathVariable int userId, @RequestBody UserModel model) {
        service.updateUser(userId, model);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable int userId) {
        service.deleteUser(userId);
    }

}
