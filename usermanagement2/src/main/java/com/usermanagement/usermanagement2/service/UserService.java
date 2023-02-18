package com.usermanagement.usermanagement2.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.usermanagement.usermanagement2.model.UserModel;
import com.usermanagement.usermanagement2.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo repository;

    public void addUser(UserModel model) {
        repository.save(model);
    }

    public List<UserModel> getAll() {
        return repository.findAll();
    }

    public UserModel getUserById(int userId) {
        return repository.findById(userId).get();
    }

    public void updateUser(int userId, UserModel model) {
        UserModel newUser = getUserById(userId);
        newUser.setMail(model.getMail());
        newUser.setPhoneNumber(model.getPhoneNumber());
        newUser.setUserName(model.getUserName());
        // newUser.setDate(model.getDate());
        // newUser.setTime(model.getTime());
        newUser.setDateOfBirth(model.getDateOfBirth());
        addUser(newUser);
    }

    public void deleteUser(int userId) {
        UserModel model = getUserById(userId);
        repository.delete(model);
    }
}
