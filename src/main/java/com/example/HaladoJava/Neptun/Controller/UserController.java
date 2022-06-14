package com.example.HaladoJava.Neptun.Controller;

import com.example.HaladoJava.Neptun.Service.UserService;
import com.example.HaladoJava.Neptun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("allUser")
    public List getUserList(){
        return userService.listAllUser();
    }

    @GetMapping("getUser")
    public User getUser(@RequestParam("id")int id) {
        return userService.getUser(id);
    }

    @PostMapping("CreateUser")
    public String createUser(@RequestBody User user){
        userService.insertUser(user);
        return "ok";
    }
    @PutMapping("UpdateUser")
    public String UpdateUser( @RequestBody User user) {
        userService.updateUser(user);
        return "ok";
    }
    @DeleteMapping("DeleteUser")
    public String DeleteUser(@RequestParam String id){
        userService.deleteUser(Integer.parseInt(id));
        return "ok";
    }
    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void invalidParameterExceptionHandler() {  }
}
