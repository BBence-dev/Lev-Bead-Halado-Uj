package com.example.HaladoJava.Neptun.Service;

import com.example.HaladoJava.Neptun.Persist.TeacherDao;

import com.example.HaladoJava.Neptun.model.Teacher;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherDao teacherDao;

    public TeacherServiceImpl(TeacherDao teacherDao){
        this.teacherDao = teacherDao;
    }

    @Override
    public List listAllTeacher() {
        return teacherDao.getAllTeacher();
    }

    @Override
    public void insertTeacher(Teacher teacher) {
        if(teacher.getId()<1){
            throw new InvalidParameterException("id cannot less then one");
        }
        if (teacherDao.idInUse(teacher.getId())){
            throw new InvalidParameterException("id is in use");
        }
        teacherDao.createTeacher(teacher);
    }

    @Override
    public Teacher getTeacher(int id) throws InvalidParameterException {
        if (id<1){
            throw new InvalidParameterException("id cannot be less than one");
        }
        return teacherDao.selectTeacher(id);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherDao.updateTeacher(teacher);
    }

    @Override
    public void deleteTeacher(int id) {

        if (id<1){
            throw new InvalidParameterException("id cannot be less than one");
        }
        teacherDao.deleteTeacher(id);
    }
}
