package com.hospital.doctorpatient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.doctorpatient.model.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
    
}
