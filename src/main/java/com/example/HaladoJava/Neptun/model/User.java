package com.example.HaladoJava.Neptun.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class User {
    @NotNull
    public int id;
    @NotBlank
    public  String Name;
    @NotBlank
    protected String Password;

    public User() {
    }

    public User(int id, String name, String password) {
        this.id = id;
        Name = name;
        Password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Felhasznalok{" +
                "id=" + id +
                ", Nev='" + Name + '\'' +
                ", Jelszo='" + Password + '\'' +
                '}';
    }
}
