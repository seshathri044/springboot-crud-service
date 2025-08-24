# SpringBoot-CRUD-Service

A **Spring Boot CRUD REST API** for managing students, authentication, and greeting endpoints.  
This project demonstrates how to build a basic backend service with **CRUD operations**, **REST best practices**, and **clean code structure** using Spring Boot.

---


## 🚀 Features
### Full CRUD support:
- Create student (POST)
- Get all students (GET)
- Get student by ID (GET)
- Update student (PUT)
- Delete student (DELETE)

---

## 🛠️ Tech Stack
- **Java 21+**  
- **Spring Boot 3.x**  
- **Maven** (Build Tool)  

---

## 📌 API Endpoints
<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/65e2c1c4-26c5-4089-b7f8-9966aaafcca5" />
<img width="1920" height="1020" alt="SB1 2" src="https://github.com/user-attachments/assets/f8c5bac4-3338-4655-ad0e-2e6cc38353eb" />
<img width="1920" height="1020" alt="SB1 3" src="https://github.com/user-attachments/assets/1480b6f0-23aa-442a-8ed6-d9ec4cab2bf3" />


### Get All Students


## ▶️ How to Run
### 1. Clone the repository:
```bash
   git clone https://github.com/your-username/SpringBoot-CRUD-Service.git
   cd SpringBoot-CRUD-Service
```
### Build and run the project:
```bash
mvn spring-boot:run
```

Open browser/Postman and test endpoints:
```bash
http://localhost:8080/students
```

---

## 📂 Project Structure
```bash
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com.example.studentCRUD
│ │ │ ├── StudentCrudApplication.java # Main Spring Boot application class
│ │ │ ├── controller
│ │ │ │ └── studentController.java # REST Controller layer
│ │ │ ├── model
│ │ │ │ └── Student.java # Student model/entity
│ │ │ └── service
│ │ │ └── StudentService.java # Service layer (business logic)
│ │ └── resources
│ │ └── application.properties # Configuration file (empty for now)
│ └── test # Unit/Integration tests (not yet added)
├── pom.xml # Maven dependencies
```
## 📱 Future Scope
- Connect backend to a database (MySQL/PostgreSQL).
- Create a Flutter frontend and connect it to this backend.
- Add authentication (JWT/Spring Security).
- Deploy backend on AWS/Heroku/Render.

## 👨‍💻 Author
- Seshathri M
- Aspiring Software Developer | Learning Java, Spring Boot, Flutter
