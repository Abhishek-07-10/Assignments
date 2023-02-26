package com.week5.mappingTest.control;

import java.util.List;
import java.util.UUID;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.week5.mappingTest.model.Laptop;
import com.week5.mappingTest.repository.StudentRepo;
import com.week5.mappingTest.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopControl {

    @Autowired
    LaptopService service;

    @Autowired
    StudentRepo sRepo;
    @PostMapping("/addLaptop")
    public String addLaptop(@RequestBody String laptop) {
        Laptop lap = setLaptop(laptop);
        service.addLaptop(lap);
        return "saved Successfully";
    }

    private Laptop setLaptop(String laptop) {
        JSONObject json = new JSONObject(laptop);
        Laptop newLaptop = new Laptop();
        newLaptop.setBrand(json.getString("brand"));
        String Id = UUID.randomUUID().toString();
        newLaptop.setID(Id);
        newLaptop.setName(json.getString("name"));
        newLaptop.setPrice(json.getInt("price"));
        String stuid = json.getString("studentid");
        newLaptop.setStudent(sRepo.findById(stuid).get());
        return newLaptop;
    }

    @DeleteMapping("/delete/laptop/{id}")
    public String deleteLaptopById(@PathVariable String id) {
        return service.deleteLaptopById(id);
    }

    @GetMapping("/getLaptop")
    public List<Laptop> getAllLaptop() {
        return service.getAllLaptop();
    }

    @GetMapping("/getLaptop/{id}")
    public Laptop getLaptopById(@PathVariable String id) {
        return service.getLaptopById(id);
    }

    @PutMapping("/update/laptop/{id}")
    public String updateLaptop(@RequestBody Laptop laptop, @PathVariable String id){
        return service.updateLaptop(laptop, id);
    }
}
