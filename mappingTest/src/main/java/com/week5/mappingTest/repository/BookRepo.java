package com.week5.mappingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.week5.mappingTest.model.Book;

public interface BookRepo extends JpaRepository<Book, String>{
    
}
