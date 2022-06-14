package com.example.HaladoJava.Neptun.Controller;

import com.example.HaladoJava.Neptun.Service.TeacherService;
import com.example.HaladoJava.Neptun.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@RestController
public class TeacherController {

    private TeacherService teacherService;


    @Autowired
    public TeacherController(TeacherService teacherService){
        this.teacherService = teacherService;
    }
    @GetMapping("allOktato")
    public List getOktatoList(){
        return teacherService.listAllTeacher();
    }
    @GetMapping("getOktato")
    public Teacher selectOktato(@RequestParam("id") int id)  {
        return teacherService.getTeacher(id);
    }

    @PostMapping("CreateOktato")
    public String createOktato(@RequestBody Teacher teacher){
        teacherService.insertTeacher(teacher);
        return "ok";
    }
    @PutMapping("UpdateOktato")
    public String UpdateOktato( @RequestBody Teacher teacher) {
        teacherService.updateTeacher(teacher);
        return "ok";
    }
    @DeleteMapping("DeleteOktato")
    public String DeleteOktato(@RequestParam String id){
        teacherService.deleteTeacher(Integer.parseInt(id));
        return "ok";
    }
    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void invalidParameterExceptionHandler() {  }
}
