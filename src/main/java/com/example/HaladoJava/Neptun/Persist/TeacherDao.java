package com.example.HaladoJava.Neptun.Persist;


import com.example.HaladoJava.Neptun.model.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher selectTeacher(int id) ;
    boolean idInUse(int id);
    List<Teacher> getAllTeacher();
    void createTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(int id);
}
