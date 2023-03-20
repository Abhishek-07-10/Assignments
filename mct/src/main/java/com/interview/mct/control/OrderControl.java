package com.interview.mct.control;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.mct.exception.BuiltException;
import com.interview.mct.model.Orders;
import com.interview.mct.service.OrderService;

@RestController
@RequestMapping("test/")
public class OrderControl {

    @Autowired
    OrderService service;

    @PostMapping("/add-orders")
    public ResponseEntity<String> addOrders(@RequestBody Orders order) {
        Orders oD = new Orders();

        oD.setOrderID(order.getOrderID());
        oD.setDate(LocalDate.now());
        oD.setPaymentID(order.getPaymentID());
        oD.setProductID(order.getProductID());
        oD.setUserID(order.getProductID());

        int id = service.saveOrder(oD);
        return new ResponseEntity<>("saved id: " + id, HttpStatus.CREATED);
    }

    @GetMapping("/get-all-arders")
    public List<Orders> getAllOrders() {
        return service.getAllOrder();
    }

    @PutMapping("/update/order/{id}")
    public String updateOrder(@PathVariable Integer id, @RequestBody Orders order) throws BuiltException {
        service.updateOrder(id, order);
        return "updated";
    }

    @DeleteMapping("delete/order/{id}")
    public void deleteOrder(Integer id) throws BuiltException{
        service.deleteOrder(id);
    }

}
