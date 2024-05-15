package com.example.animalerie.dtos;

import java.time.LocalDate;

public class InChienDto {

    private String nom, espece, sexe;

    private int taille, poids;

    private LocalDate date_naissance;

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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

    public int getPoids() {
        return poids;
    }

    public int getTaille() {
        return taille;
    }
}