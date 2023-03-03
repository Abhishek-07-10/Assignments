package com.example.instagram.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.instagram.model.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {
    
}
