package com.example.resturant_app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.resturant_app.model.ResturantModel;

@Service
public class ResturantService {
    public static List<ResturantModel> allResturant = new ArrayList<>();
    static {
        allResturant.add(new ResturantModel("1", "5.0", "Resturant-1", "Ahmedabad"));
        allResturant.add(new ResturantModel("2", "4.8", "Resturant-2", "Ahmedabad"));
        allResturant.add(new ResturantModel("3", "4.0", "Resturant-3", "Bengaluru"));
        allResturant.add(new ResturantModel("4", "5.0", "Resturant-4", "Hyderabad"));
        allResturant.add(new ResturantModel("5", "4.3", "Resturant-5", "Chennai"));
        allResturant.add(new ResturantModel("6", "4.4", "Resturant-6", "kochi"));
    }

    public List<ResturantModel> getAllResturant() {
        return allResturant;
    }

    public void addResturant(ResturantModel model) {
        allResturant.add(model);
    }

    public ResturantModel getResturantName(String name) {
        return allResturant.stream().filter(t -> t.getResturantName().equals(name)).findFirst().get();
    }
}
