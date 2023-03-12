package com.hospital.doctorpatient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.doctorpatient.model.Doctor;
import com.hospital.doctorpatient.repository.DoctorRepo;

@Service
public class DoctorService {
    
    @Autowired
    DoctorRepo repo;
    
    public void addDoctors(Doctor doctor){
        repo.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return repo.findAll();
    }

    public Doctor getByID(Integer id) {
        return repo.findById(id).get();
    }

    public void updateDoctor(Integer id, Doctor doctor) {
        Doctor d = getByID(id);
        d.setDoctorExp(doctor.getDoctorExp());
        d.setDoctorName(doctor.getDoctorName());
        d.setDoctorSpecs(doctor.getDoctorSpecs());
        repo.save(d);
    }

    public String deleteDoctor(Integer id){
        Doctor d = getByID(id);
        repo.delete(d);
        return ""+id;
    }
}
