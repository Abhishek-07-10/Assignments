package com.example.instagram.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.instagram.model.User;
import com.example.instagram.service.Userservice;

import io.micrometer.common.lang.Nullable;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Userservice service;

    // private IRepository repository;
    @PostMapping("/add-user")
    public ResponseEntity<String> savepost(@RequestBody String userrequest) {
        User user = setUser(userrequest);
        service.saveuser(user);
        return new ResponseEntity<>("usersaved", HttpStatus.OK);

    }

    public User setUser(String userrequest) {
        JSONObject obj = new JSONObject(userrequest);
        User u = new User();
        // u.setUserid(obj.getInt("userid"));
        u.setAge(obj.getInt("age"));
        u.setFname(obj.getString("fname"));
        u.setLname(obj.getString("lname"));
        u.setMail(obj.getString("mail"));
        u.setPhoneno(obj.getString("phoneno"));
        return u;
    }

    @GetMapping("/getuser")
    public ResponseEntity<String> getuser(@Nullable @RequestParam String userid) {
        JSONArray obj = service.getUser(userid);
        return new ResponseEntity<String>(obj.toString(), HttpStatus.OK);
    }
}
