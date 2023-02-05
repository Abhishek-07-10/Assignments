package com.example.resturant_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.resturant_app.model.ResturantModel;
import com.example.resturant_app.service.ResturantService;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/resturant")
public class ResturantContoller {

    @Autowired
    ResturantService service;

    @GetMapping("/show")
    public List<ResturantModel> getResturant(){
        return service.getAllResturant();
    }

    @PostMapping("/show")
    public void addResturant(@RequestBody ResturantModel model){
        service.addResturant(model);
    }
    
    @GetMapping("/resturantName/{name}")
    public ResturantModel getResturantByName(@PathVariable String name){
        return service.getResturantName(name);
    }

    

}
