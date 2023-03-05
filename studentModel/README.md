# Student model API

## Model
- StudentModel class
<br><br>

## Controller
- StudentControl class
<br><br>

## Repository
- StudentRepository Interface 
- Queries
- 1. @Query(value = "select * from student where age = :age", nativeQuery = true)
- 2. @Query(value = "select * from student where first_name = :firstName", nativeQuery = true)
- 3. @Query(value = "select * from student where last_name = :lastName", nativeQuery = true)
- 4. @Query(value = "select * from student where active = :active", nativeQuery = true)
<br><br>

## Service
- StudentService class
<br><br>

## Database
- MySQL
<br><br>

## Project Summary
- In this project we are performing the operation using native Query and retriving the data from DataBase..
<br><br>

- PostMapping -> http://localhost:8080/Student/add-Students
![add student](add%20student.png)<br><br>

- GetMapping - > http://localhost:8080/Student/get-Students-byActive/true (By active)
![Active](get%20active%20student.png) <br><br>

- GetMapping - > http://localhost:8080/Student/get-students-byFirstName/Abhishek (By firstName)
![First Name](get%20by%20firstNAme.png) <br><br>

- GetMapping - > http://localhost:8080/Student/get-students-byLastName/tengli (By lastName)
![Last Name](get%20by%20lastName.png) <br><br>

- GetMapping - > http://localhost:8080/Student/get-students-byAge/21 (By Age)
![Age ](get%20by%20age.png) <br><br>

