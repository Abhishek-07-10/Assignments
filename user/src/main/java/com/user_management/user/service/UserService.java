package com.user_management.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.user_management.user.model.UserModel;

@Service
public class UserService {

    public static List<UserModel> userList = new ArrayList<>();
    static {
        userList.add(new UserModel(0, "Abhi", "Abhishek", "Location-1", "1233456789"));
    }

    public void addNewUser(UserModel model) {
        userList.add(model);
    }

    public UserModel getTheUser(int id) {
        return userList.stream().filter(t -> t.getUserId() == id).findFirst().get();
    }

    public List<UserModel> getTheAllUser() {
        return userList;
    }

    public void updateTheUser(int id, UserModel model) {
        UserModel userModel = getTheUser(id);
        
        userModel.setName(model.getName());
        userModel.setUserName(model.getUserName());
        userModel.setUserAddress(model.getUserAddress());
        userModel.setUserPhoneNo(model.getUserPhoneNo());
    }

    public void deleteTheUser(int id) {
        Predicate<? super UserModel> predicate = model -> model.getUserId() == id;
        userList.removeIf(predicate);
    }
}
