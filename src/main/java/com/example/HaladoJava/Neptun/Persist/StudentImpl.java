package com.example.HaladoJava.Neptun.Persist;

import com.example.HaladoJava.Neptun.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StudentImpl implements StudentDao {
    private Map<Integer, Student> StudentMap;

    public StudentImpl()
    {
        StudentMap =new HashMap<>();
        StudentMap.put(1,new Student(1,"Andi","Valami","W1613"));
    }

    @Override
    public Student selectStudent(int id) {

        return StudentMap.get(id);
    }

    @Override
    public boolean idInUse(int id) {
        return StudentMap.containsKey(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return new ArrayList<Student>(StudentMap.values());
    }

    @Override
    public void createStudent(Student student) {
        StudentMap.put(student.getId(), student);
    }

    @Override
    public void updateStudent(Student student) {
        StudentMap.put(student.getId(), student);
    }

    @Override
    public void deleteStudent(int id) {
        StudentMap.remove(id);
    }
}
