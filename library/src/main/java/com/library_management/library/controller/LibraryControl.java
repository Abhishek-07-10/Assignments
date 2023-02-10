package com.library_management.library.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library_management.library.model.LibraryModel;
import com.library_management.library.service.LibraryService;

@RestController
@RequestMapping("/api/libraray")
public class LibraryControl {

    @Autowired
    LibraryService service;

    @PutMapping("/update/name/{name}")
    public void updateLibrary(@PathVariable String name, @RequestBody LibraryModel model){
        service.updateLibrary(name, model);
    }
    

    @GetMapping("/get")
    public ArrayList<LibraryModel> getAll(){
        return service.getLibrary();
    }

    @GetMapping("/get/name/{name}")
    public LibraryModel getByName(@PathVariable String name){
        return service.getAllByName(name);
    }
    
    @PostMapping("/add")
    public void addLibrary(@RequestBody LibraryModel model){
        service.addLibrary(model);
    }

    @DeleteMapping("/delete/name/{name}")
    public void deleteLibrary(@PathVariable String name){
        service.delete(name);
    }
}
