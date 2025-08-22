package com.example.studentCRUD.controller;

import com.example.studentCRUD.model.Student;
import com.example.studentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {
    @Autowired
    StudentService studentservice;
    @GetMapping("students")
    public List<Student> getStudents(){
        return studentservice.getStudents();
    }
    @GetMapping("students/{rno}")
    public Student getStudentrno(@PathVariable("rno") int roll){
        return studentservice.getStdByRno(roll);
    }
    @PostMapping("students")
    public String addStudent(@RequestBody Student student){
        studentservice.addStudent(student);
        return "Success";
    }
    @PutMapping("students")
    public String updateStudent(@RequestBody Student student){
        return studentservice.updateStudent(student);
    }
    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable("rno") int roll){
        return studentservice.deleteStudent(roll);

    }
}
