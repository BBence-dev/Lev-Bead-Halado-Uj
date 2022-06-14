package com.example.HaladoJava.Neptun.Service;

import com.example.HaladoJava.Neptun.model.Student;

import java.util.List;

public interface StudentService {
    Student getStudent(int id) ;
    List listAllStudent();
    void insertStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
