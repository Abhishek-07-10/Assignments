package com.usermanagement.usermanagement2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagement.usermanagement2.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer>{
    
}
