package com.usermanagement.usermanagement2.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="table_1")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @NotBlank(message = "User name must be of more than 4 characters")
    private String userName;
    
    @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$", message = "Date of birth must be in the format DD-MM-YYYY")
    private String dateOfBirth;

    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid email address.")
    @NotBlank(message = "email should not be blank")
    private String mail;

    @NotBlank(message = "number should be of 12 digits")
    @Pattern(regexp = "^\\d{2}\\d{10}$", message = "Phone number must be 12 digits long and start with a two-digit country code.")
    private String phoneNumber;

    private LocalDate date;
    private LocalTime time; 
}
