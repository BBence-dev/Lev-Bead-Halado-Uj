package com.example.HaladoJava.Neptun.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class Student extends User {
    @NotBlank
    protected String StudentId;

    public Student() {
    }

    public Student(String diakiszam) {
        this.StudentId = diakiszam;
    }

    public Student(int id, String nev, String jelszo, String diakiszam) {
        super(id, nev, jelszo);
        this.StudentId = diakiszam;
    }

    public String getDiakiszam() {
        return StudentId;
    }

    public void setDiakiszam(String diakiszam) {
        this.StudentId = diakiszam;
    }

    @Override
    public String toString() {
        return "Hallgato{" +
                "id=" + id +
                ", Nev='" + Name + '\'' +
                ", Jelszo='" + Password + '\'' +
                ", Diakiszam='" + StudentId + '\'' +
                '}';
    }
}
