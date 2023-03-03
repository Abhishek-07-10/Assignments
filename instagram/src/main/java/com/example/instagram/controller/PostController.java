package com.example.instagram.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.instagram.dao.IRepository;
import com.example.instagram.model.Post;
import com.example.instagram.model.User;
import com.example.instagram.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
    
    @Autowired
    IRepository userrepo;

    @Autowired
    private PostService service;

    @PostMapping("/add-post")
    public ResponseEntity<String> savePost(@RequestBody String postRequest) {
        Post post = setPost(postRequest);
        service.savePost(post);
        return new ResponseEntity<>("Post saved", HttpStatus.OK);
    }

    private Post setPost(String postRequest) {
        JSONObject obj = new JSONObject(postRequest);
        Post newPost = new Post();
        String id = obj.getString("userId");
        User u = userrepo.findById(Integer.parseInt(id)).get();

        newPost.setUser(u);

        return newPost;
    }

    @GetMapping("/findallpost")
    public List<Post> postfindall(@RequestBody Post post){
       return  service.findallpost(post);
    }
    @GetMapping("/findpostbyid/{id}")
    public Post findpostbyid(@PathVariable int id){
        return service.findByIdPost(id);
    }
    @DeleteMapping("/deletebyid/{id}")
    public String deletepost(@PathVariable int id){
        service.deleteById(id);
        return"Deleted-post";
    }
}
