package com.hospital.doctorpatient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.doctorpatient.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {
    
}
