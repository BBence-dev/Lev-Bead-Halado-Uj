package com.example.HaladoJava.Neptun.Service;

import com.example.HaladoJava.Neptun.Persist.StudentDao;
import com.example.HaladoJava.Neptun.model.Student;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List listAllStudent() {
        return studentDao.getAllStudent();
    }

    @Override
    public void insertStudent(Student student) {
        if(student.getId()<1){
            throw new InvalidParameterException("id cannot less then one");
        }
        if (studentDao.idInUse(student.getId())){
            throw new InvalidParameterException("id is in use");
        }
        studentDao.createStudent(student);
    }

    @Override
    public Student getStudent(int id) throws InvalidParameterException{
        if (id<1){
            throw new InvalidParameterException("id cannot be less than one");
        }
        return studentDao.selectStudent(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        if (id<1){
            throw new InvalidParameterException("id cannot be less than one");
        }
        studentDao.deleteStudent(id);
    }
}
