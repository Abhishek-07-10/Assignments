package com.spring.ecommerce.ecommerceAPI.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ecommerce.ecommerceAPI.model.Address;
import com.spring.ecommerce.ecommerceAPI.service.AddressSrvice;

@RestController
@RequestMapping("/address")
public class AddressControl {
    
    @Autowired
    AddressSrvice service;

    @PostMapping("/createAddress")
    public void createAddress(@RequestBody Address p){
        service.createAddress(p);
    }
    
    @GetMapping("/getAllAddress")
    public List<Address> getAllAddress(){
        return service.getAllAddress();
    }

    @GetMapping("/addressId/{id}")
    public Address getAddressById(@PathVariable Integer id){
        return service.getAddressById(id);
    }
    
}
