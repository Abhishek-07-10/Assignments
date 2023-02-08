package com.url_hit_counter.urlhitcounter.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.url_hit_counter.urlhitcounter.model.CounterModel;

@Service
public class UserService {

    static Map<String,Integer> map = new HashMap<>();
    
    public CounterModel getUserCount(String username) {
        int count = map.getOrDefault(username,0)+1;
        map.put(username, count);

        CounterModel counter = new CounterModel(username, count);
        return counter;
    } 

    public Map<String,Integer> allUsers(){
        return map;
    }
}
