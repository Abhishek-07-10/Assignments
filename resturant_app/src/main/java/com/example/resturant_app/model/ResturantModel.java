package com.example.resturant_app.model;

public class ResturantModel {
    private String resturantId;
    private String ratings;
    private String resturantName;
    private String restutantAddress;
    
   
    public ResturantModel(String resturantId, String ratings, String resturantName, String restutantAddress) {
        this.resturantId = resturantId;
        this.ratings = ratings;
        this.resturantName = resturantName;
        this.restutantAddress = restutantAddress;
    }
    public String getRatings() {
        return ratings;
    }
    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
    public String getResturantName() {
        return resturantName;
    }
    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }
    public String getRestutantAddress() {
        return restutantAddress;
    }
    public void setRestutantAddress(String restutantAddress) {
        this.restutantAddress = restutantAddress;
    }
    public String getResturantId() {
        return resturantId;
    }
    public void setResturantId(String resturantId) {
        this.resturantId = resturantId;
    }

}
