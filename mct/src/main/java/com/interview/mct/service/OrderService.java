package com.interview.mct.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.mct.dao.OrderRepo;
import com.interview.mct.exception.BuiltException;
import com.interview.mct.model.Orders;

@Service
public class OrderService {

    @Autowired
    OrderRepo repo;

    public int saveOrder(Orders order) {
        repo.save(order);
        return order.getOrderID();
    }

    public List<Orders> getAllOrder() {
        return repo.findAll();
    }

    public void updateOrder(Integer id, Orders order) throws BuiltException {
        if(repo.findById(id).isPresent()){
            Orders newOrder = repo.findById(id).get();
            newOrder.setDate(LocalDate.now());
            newOrder.setPaymentID(order.getPaymentID());
            newOrder.setProductID(order.getProductID());
            newOrder.setUserID(order.getProductID());
            repo.save(newOrder);
        }
        else {
            throw new BuiltException("Order id not found");
        }
    }

    public void deleteOrder(Integer id) throws BuiltException {
        if(repo.findById(id).isPresent()){
            Orders o = repo.findById(id).get();
            repo.delete(o);
        }
        else{
            throw new BuiltException("id not found");
        }
    }
    
}
