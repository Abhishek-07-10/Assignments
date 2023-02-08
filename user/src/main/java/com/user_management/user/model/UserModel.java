package com.user_management.user.model;

public class UserModel {
    private int userId;
    private String name;
    private String UserName;
    private String userAddress;
    private String userPhoneNo;
    String errorMsg;
    
    public UserModel(int userId, String name, String userName, String userAddress, String userPhoneNo) {
        this.userId = userId;
        this.name = name;
        UserName = userName;
        this.userAddress = userAddress;
        this.userPhoneNo = userPhoneNo;
    }

    public UserModel(String string) {
        this.errorMsg = string;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public String getUserPhoneNo() {
        return userPhoneNo;
    }
    public void setUserPhoneNo(String userPhoneNo) {
        this.userPhoneNo = userPhoneNo;
    }    
}
