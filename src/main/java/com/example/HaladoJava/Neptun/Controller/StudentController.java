package com.example.HaladoJava.Neptun.Controller;

import com.example.HaladoJava.Neptun.Service.StudentService;
import com.example.HaladoJava.Neptun.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("allStudent")
    public List getStudentList(){
        return studentService.listAllStudent();
    }
    @GetMapping("getStudent")
    public Student selectStudent(@RequestParam("id") int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("CreateStudent")
    public String createStudent(@RequestBody Student student){
        studentService.insertStudent(student);
        return "ok";
    }
    @PutMapping("UpdateStudent")
    public String UpdateStudent( @RequestBody Student student) {
        studentService.updateStudent(student);
        return "ok";
    }
    @DeleteMapping("DeleteStudent")
    public String DeleteStudent (@RequestParam String id){
        studentService.deleteStudent(Integer.parseInt(id));
        return "ok";
    }
    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void invalidParameterExceptionHandler() {  }
}
