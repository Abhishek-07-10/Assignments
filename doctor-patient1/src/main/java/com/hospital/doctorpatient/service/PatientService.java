package com.hospital.doctorpatient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.doctorpatient.model.Patient;
import com.hospital.doctorpatient.repository.DoctorRepo;
import com.hospital.doctorpatient.repository.PatientRepo;

@Service
public class PatientService {
    

    @Autowired
    PatientRepo repo;

    @Autowired
    DoctorRepo dRepo;

    public void addPatients(Patient patient){
        repo.save(patient);
    }

    public List<Patient> getAllPatient(){
        return repo.findAll();
    }

    public Patient getPatientByID(Integer id){
        return repo.findById(id).get();
    }

    public void updatePatient(Patient patient, Integer id){
        if(repo.findById(id).isPresent()){
            repo.save(patient);
        }
    }

    public String deletePatient(Integer id){
        Patient d = getPatientByID(id);
        repo.delete(d);
        return ""+id;
    }
}
