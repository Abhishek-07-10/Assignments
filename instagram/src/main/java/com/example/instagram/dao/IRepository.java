package com.example.instagram.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.instagram.model.User;

// @Repository
public interface IRepository extends JpaRepository<User,Integer>{
    
}
