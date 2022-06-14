package com.example.HaladoJava.Neptun.model;


import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class Admin extends User {

    @NotBlank
    protected String smspassword;

    public Admin() {
    }

    public Admin(String smspassword) {
        this.smspassword = smspassword;
    }

    public Admin(int id, String nev, String jelszo, String smspassword) {
        super(id, nev, jelszo);
        this.smspassword = smspassword;
    }

    public String getSmspassword() {
        return smspassword;
    }

    public void setSmspassword(String smspassword) {
        this.smspassword = smspassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "smsjelszo='" + smspassword + '\'' +
                ", id=" + id +
                ", Nev='" + Name + '\'' +
                ", Jelszo='" + Password + '\'' +
                '}';
    }
}
