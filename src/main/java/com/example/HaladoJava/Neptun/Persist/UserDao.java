package com.example.HaladoJava.Neptun.Persist;

import com.example.HaladoJava.Neptun.model.User;

import java.util.List;

public interface UserDao {
    User selectUser(int id);
    boolean idInUse(int id);
    List<User> getAllUser();
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
