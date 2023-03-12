# Doctor Patient Project<br><br>
## FrameWorks and Language used
- SpringBoot
- Java<br><br>
## Controller
- DoctorController
- DoctorController<br><br>
## Repository (Dao)
- DoctorRepo
- PatientRepo<br><br>
## Model
- DoctorModel
- PatientModel<br><br>
## Service
- DoctorService
- PatientService<br><br>
## DataBase Used
- SQL DataBase<br><br>
## Project Summary
- In this project we are saving the Patient details and assiging the Doctor Id to patient
   and performing the CRUD operation.<br><br>
### Doctor<br><br>
- PostMapping -> http://localhost:8080/doctor/addDoctor
![Add doctor](add%20doctor.png)<br><br>
- GetMapping  -> http://localhost:8080/doctor/get
![get doctor](get%20all%20doctors.png)<br><br>

- GetMapping  -> http://localhost:8080/doctor/getByID/{id}
- PutMapping  -> http://localhost:8080/doctor/update/{id}
- DeleteMapping -> http://localhost:8080/doctor/delete/{id}
![delete doctor by id](delete%20doctor%20by%20id.png)<br><br>

### Patient<br><br>
- PostMapping -> http://localhost:8080/patient/addPatient
![Add patient](add%20patient.png)<br><br>

- GetMapping  -> http://localhost:8080/patient/get
![get patient](get%20patients.png)<br><br>

- GetMapping  -> http://localhost:8080/patient/getByID/{id}
- PutMapping  -> http://localhost:8080/patient/update/{id}
- DeleteMapping -> http://localhost:8080/patient/delete/{id}