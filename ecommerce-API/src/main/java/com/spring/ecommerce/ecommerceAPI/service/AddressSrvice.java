package com.spring.ecommerce.ecommerceAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ecommerce.ecommerceAPI.dao.AddressRepo;
import com.spring.ecommerce.ecommerceAPI.model.Address;

@Service
public class AddressSrvice {
 
    @Autowired 
    AddressRepo repo;

    public void createAddress(Address a) {
        repo.save(a);
    }

    public List<Address> getAllAddress() {
        return repo.findAll();
    }

    public Address getAddressById(Integer id) {
        return repo.findById(id).get();
    }
}
