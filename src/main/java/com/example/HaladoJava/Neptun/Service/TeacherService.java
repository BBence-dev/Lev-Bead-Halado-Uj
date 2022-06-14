package com.example.HaladoJava.Neptun.Service;

import com.example.HaladoJava.Neptun.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher getTeacher(int id) ;
    List listAllTeacher();
    void insertTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(int id);
}
