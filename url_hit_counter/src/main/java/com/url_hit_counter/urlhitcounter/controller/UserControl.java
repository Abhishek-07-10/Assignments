package com.url_hit_counter.urlhitcounter.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.url_hit_counter.urlhitcounter.model.CounterModel;
import com.url_hit_counter.urlhitcounter.service.UserService;

@RestController
@RequestMapping("/api/v1/visitors-count")
public class UserControl {
    
    @Autowired
    UserService service;

    @GetMapping("/username/{username}/count")
    public CounterModel getCount(@PathVariable String username) {
        return service.getUserCount(username);
    }

    @GetMapping("/getAllCount")
    public Map<String,Integer> getParticularCount(){
        return service.allUsers();
    }
}
