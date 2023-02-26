package com.week5.mappingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.week5.mappingTest.model.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, String> {
    
}
