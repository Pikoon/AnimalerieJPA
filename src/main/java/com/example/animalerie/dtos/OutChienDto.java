package com.example.animalerie.dtos;

import java.time.LocalDate;

public class OutChienDto {

    private String nom, espece;

    private int age_reel, age_chien;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public int getAge_reel() {
        return age_reel;
    }

    public void setAge_reel(int age_reel) {
        this.age_reel = age_reel;
    }

    public int getAge_chien() {
        return age_chien;
    }

    public void setAge_chien(int age_chien) {
        this.age_chien = age_chien;
    }
}
