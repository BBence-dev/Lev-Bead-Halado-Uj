package com.example.HaladoJava.Neptun.Service;

import com.example.HaladoJava.Neptun.model.User;

import java.util.List;

public interface UserService {
    User getUser(int id) ;
    List listAllUser();
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
