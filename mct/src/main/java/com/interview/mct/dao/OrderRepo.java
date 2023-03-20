package com.interview.mct.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interview.mct.model.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders,Integer> {
    
}
