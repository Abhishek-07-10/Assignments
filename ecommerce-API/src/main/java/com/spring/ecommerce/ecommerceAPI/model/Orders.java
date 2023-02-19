package com.spring.ecommerce.ecommerceAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer productQuantity;

    @JoinColumn(name = "user_Id")
    @ManyToOne
    private User user;

    @JoinColumn(name = "product_ID")
    @ManyToOne
    private Product product;

    @JoinColumn(name = "address_ID")
    @ManyToOne
    private Address address;

    // private Integer userId;
    // private Integer productId;
    // private Integer addressId;
    // private Integer productQuantity;
}
