package com.example.HaladoJava.Neptun.Service;

import com.example.HaladoJava.Neptun.model.Admin;

import java.util.List;

public interface AdminService {
    Admin getAdmin(int id) ;

    List listAllAdmin();
    void insertAdmin(Admin admin);
    void updateAdmin(Admin admin);
    void deleteAdmin(int id);
}
