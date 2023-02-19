package com.spring.ecommerce.ecommerceAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ecommerce.ecommerceAPI.dao.ProductRepo;
import com.spring.ecommerce.ecommerceAPI.model.Product;

@Service
public class ProductService {
    
    @Autowired
    ProductRepo repo;

    public void createProduct(Product p) {
        repo.save(p);
    }

    public List<Product> getAllProduct() {
        return repo.findAll();
    }

    public Product getProductById(Integer id) {
        return repo.findById(id).get();
    }

    public void deleteProduct(Integer id) {
        repo.deleteById(id);
    }
}
