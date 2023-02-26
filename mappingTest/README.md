# User
## Framework And language used
- SpringBoot
- Java
## Data Flow
### Model
- 1) Student 
- 2) Laptop
- 3) Address
- 4) Book
- 5) Course
### Controller
- 1) StudentController
- 2) LaptopController
- 3) CourseController
- 4) BookController
# # Service
- 1) StudentService
- 2) LaptopService
- 3) CourseService
- 4) BookService
### Repository
- JpaRepository
### Database Design
- Here we are using the MYSQL DataBase and it is in a Tabular Form
## Data Structure used
- ArrayList
## Project Summary
In this Project we are performing the CRUD operations by hitting the API and here we have the links :
1) Book
- PostMapping -> http://localhost:8080/book/addBook
![add book](add%20book.png)
- GetMapping  -> http://localhost:8080/book/getbooks
- GetMapping (by Id) -> http://localhost:8080/book/getbooks/{id}
- PutMapping -> http://localhost:8080/book/update/book/{id}
- DeleteMapping -> http://localhost:8080/book/update/book/{id}

2) Laptop
- PostMapping -> http://localhost:8080/laptop/addLaptop
![add laptop](add%20laptop.png)
- GetMapping - > http://localhost:8080/laptop/getLaptop
- GetMapping (by Id) -> http://localhost:8080/laptop/getLaptop/{id}
- PutMapping -> http://localhost:8080/laptop/update/laptop/{id}
- DeleteMapping -> http://localhost:8080/laptop/update/laptop/{id}

3) Course
- PostMapping -> http://localhost:8080/course/addCourse
![add course](add%20course.png)
- Getmapping -> http://localhost:8080/course/getCourse
- GetMapping (by Id) -> http://localhost:8080/course/getCourse/{id}
- PutMapping -> http://localhost:8080/course/update/course/{id}
- DeleteMapping -> http://localhost:8080/course/update/course/{id}
![delete](delete%20course.png)

4) Student
- PostMapping -> http://localhost:8080/student/addStudent
![add student](add%20student.png)
- GetMapping -> http://localhost:8080/student/getStudent
- GetMapping (by id) -> http://localhost:8080/student/getStudent/{id}
- PutMapping -> http://localhost:8080/student/update/student/{id}
![update](update%20student.png)
- DeleteMapping -> http://localhost:8080/student/delete/student/{id}