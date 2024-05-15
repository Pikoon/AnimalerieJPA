package com.example.animalerie.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "animal")
public class AnimauxEntity {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_naissance")
    private LocalDate dateNaissance;

    @Column(name = "taille")
    private Integer taille;

    @Column(name = "espece")
    private String espece;

    @Column(name = "poids")
    private Integer poids;

    @Column(name = "nom")
    private String nom;

    @Column(name = "sexe", length = 10)
    private String sexe;

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }
}
