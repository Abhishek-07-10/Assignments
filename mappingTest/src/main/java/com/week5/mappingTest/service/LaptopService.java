package com.week5.mappingTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.week5.mappingTest.model.Laptop;
import com.week5.mappingTest.repository.LaptopRepo;

@Service
public class LaptopService {

    @Autowired
    LaptopRepo repo;

    @Autowired
    StudentService service;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public String deleteLaptopById(String id) {
        repo.deleteById(id);
        return "Deleted Laptop having ID: "+id;
    }

    public List<Laptop> getAllLaptop() {
        return repo.findAll();
    }

    public Laptop getLaptopById(String id) {
        return repo.findById(id).get();
    }

    public String updateLaptop(Laptop laptop, String id){
        if(repo.findById(id).isPresent()){
            Laptop newLap = repo.findById(id).get();
            newLap.setBrand(laptop.getBrand());
            newLap.setName(laptop.getName());
            newLap.setPrice(laptop.getPrice());
            newLap.setStudent(laptop.getStudent());
            repo.save(newLap);
            return "Updated Successfully";
        }
        return "ID not found in databse";
    }
    
}
