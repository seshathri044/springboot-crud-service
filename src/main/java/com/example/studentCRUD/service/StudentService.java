package com.example.studentCRUD.service;

import com.example.studentCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Seshathri","Java"),
                    new Student(2, "annanth","python")
            )
    );
    public List<Student> getStudents() {
        return students;
    }

    public Student getStdByRno(int roll) {
        int index=0;
        boolean found = false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==roll) {
                index = i;
                found = true;
                break;
            }
        }
        if(found)return students.get(index);
        return new Student(0,"","");
    }

    public void addStudent(Student student) {
         students.add(student);

    }

    public String updateStudent(Student student) {
        int index =0;
        boolean found = false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==student.getRno()){
                index=i;
                found =true;
                break;
            }
        }
        if(!found)return "No such student exist";
        else{
            students.set(index,student);
            return "Updation is done";
        }
    }

    public String deleteStudent(int roll) {
        int index=0;
        boolean found =false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==roll) {
                index = i;
                found = true;
                break;
            }
        }
        if(found){
            students.remove(index);
            return "Deleted Successfully..";
        }
        else{
            return "No such student exists..";
        }

    }
}
