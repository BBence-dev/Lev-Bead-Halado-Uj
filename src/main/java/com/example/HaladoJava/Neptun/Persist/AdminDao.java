package com.example.HaladoJava.Neptun.Persist;

import com.example.HaladoJava.Neptun.model.Admin;

import java.util.List;

public interface AdminDao {
    Admin selectAdmin(int id);

    List<Admin> getAllAdmin();
    boolean idInUse(int id);
    void createAdmin(Admin admin);
    void updateAdmin(Admin admin);
    void deleteAdmin(int id);
}
