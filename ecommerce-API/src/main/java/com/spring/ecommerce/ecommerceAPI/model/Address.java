package com.spring.ecommerce.ecommerceAPI.model;

import jakarta.persistence.Column;
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
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_ID")
    private Integer addressId;

    private String name;
    private String landmark;
    private String phoneNO;
    private String zipCode;
    private String state;
    
    @JoinColumn(name = "user_Id")
    @ManyToOne
    private User user;
}
