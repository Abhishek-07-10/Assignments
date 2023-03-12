package com.hospital.doctorpatient.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.doctorpatient.model.Doctor;
import com.hospital.doctorpatient.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorControl {
    
    @Autowired
    DoctorService service;

    @PostMapping("/addDoctors")
    public void addDoctor(@RequestBody Doctor doctor){
        service.addDoctors(doctor);
    }

    @GetMapping("/get")
    public List<Doctor> getAllDoctors(){
        return service.getAllDoctors();
    }

    @GetMapping("/getByID/{id}")
    public Doctor getByID(@PathVariable Integer id){
        return service.getByID(id);
    }

    @PutMapping("/update/{id}")
    public void updateDoctor(@PathVariable Integer id, @RequestBody Doctor doctor){
        service.updateDoctor(id, doctor);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDoctor(@PathVariable Integer id){
        String ids = service.deleteDoctor(id);
        return "deleted... doctor having "+ ids +" ID";
    }

}
