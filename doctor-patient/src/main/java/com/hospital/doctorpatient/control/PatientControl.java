package com.hospital.doctorpatient.control;

import java.util.List;

import org.json.JSONObject;
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
import com.hospital.doctorpatient.model.Patient;
import com.hospital.doctorpatient.repository.DoctorRepo;
import com.hospital.doctorpatient.service.PatientService;

import jakarta.annotation.Nullable;

@RestController
@RequestMapping("/patient")
public class PatientControl {
    
    @Autowired
    PatientService service;

    @Autowired
    DoctorRepo dRepo;

    @PostMapping("/addPatient")
    public void addPatient(@RequestBody String patient){
        Patient p = setPatient(patient);
        service.addPatients(p);
    }

    private Patient setPatient(String patient){
        JSONObject obj = new JSONObject(patient);
        Patient p = new Patient();
        // p.setPatientId(obj.getInt("patientId"));
        p.setPatientConcern(obj.getString("patientConcern"));
        p.setPatientName(obj.getString("patientName"));
        p.setPatientNo(obj.getString("patientNo"));
        String docId = obj.getString("docId");
        Doctor d = dRepo.findById(Integer.valueOf(docId)).get();
        p.setDoctor(d);
        return p;
    }

    @GetMapping("/get")
    public List<Patient> getAllPatient(){
        return service.getAllPatient();
    }

    @GetMapping("/getByID/{id}")
    public Patient getByID(@PathVariable Integer id){
        return service.getPatientByID(id);
    }

    @PutMapping("/update/{id}")
    public void updatePatient(@Nullable @PathVariable Integer id, @RequestBody String patient){
        Patient p = setPatient(patient);
        service.updatePatient(p, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePatient(@PathVariable Integer id){
        String ids = service.deletePatient(id);
        return "deleted... doctor having "+ ids +" ID";
    }
}