package com.url_hit_counter.urlhitcounter.model;

public class CounterModel {
    private String userName;
    private int count;
    
    public CounterModel(String userName, int count) {
        this.userName = userName;
        this.count = count;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    
}
