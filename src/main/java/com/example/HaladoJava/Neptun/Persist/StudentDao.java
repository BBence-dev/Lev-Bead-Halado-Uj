package com.example.HaladoJava.Neptun.Persist;

import com.example.HaladoJava.Neptun.model.Student;

import java.util.List;

public interface StudentDao {
    Student selectStudent(int id) ;
    boolean idInUse(int id);
    List<Student> getAllStudent();
    void createStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
