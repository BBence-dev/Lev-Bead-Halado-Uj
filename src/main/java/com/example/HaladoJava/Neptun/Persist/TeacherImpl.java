package com.example.HaladoJava.Neptun.Persist;

import com.example.HaladoJava.Neptun.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TeacherImpl implements TeacherDao {
    private Map<Integer, Teacher> TeacherMap;

    public TeacherImpl()
    {
        TeacherMap =new HashMap<>();
        TeacherMap.put(1,new Teacher(1,"Andi","Valami",1));
    }

    @Override
    public Teacher selectTeacher(int id) {

        return TeacherMap.get(id);
    }

    @Override
    public boolean idInUse(int id) {
        return TeacherMap.containsKey(id);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return new ArrayList<Teacher>(TeacherMap.values());
    }

    @Override
    public void createTeacher(Teacher teacher) {
        TeacherMap.put(teacher.getId(), teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        TeacherMap.put(teacher.getId(), teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        TeacherMap.remove(id);
    }
}
