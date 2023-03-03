package com.example.instagram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.instagram.dao.PostRepo;
import com.example.instagram.model.Post;

@Service
public class PostService {

    @Autowired
    PostRepo repo;

    public void savePost(Post post) {
        repo.save(post);
    }

    public List<Post> findallpost(Post post) {
        return repo.findAll();
    }
    public Post findByIdPost(int id) {
        return repo.findById(id).get();
    }
    public void deleteById(int id) {
        Post p = repo.findById(id).get();
        repo.delete(p);
    }
    
}
