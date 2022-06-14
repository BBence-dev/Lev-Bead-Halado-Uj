package com.example.HaladoJava.Neptun.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class Teacher extends User {
    @NotNull
   protected int office;

    public Teacher(int office) {
        this.office = office;
    }

    public Teacher(int id, String nev, String jelszo, int office) {
        super(id, nev, jelszo);
        this.office = office;
    }

    @Override
    public String toString() {
        return "Oktato{" +
                "id=" + id +
                ", Nev='" + Name + '\'' +
                ", Jelszo='" + Password + '\'' +
                '}';
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }
}
