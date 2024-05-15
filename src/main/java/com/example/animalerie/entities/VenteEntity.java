package com.example.animalerie.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "vente")
public class VenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vente;

    @Column(name = "date_vente", nullable = false)
    private LocalDate dateVente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_client", nullable = false)
    private ClientEntity idClient;

    public ClientEntity getIdClient() {
        return idClient;
    }

    public void setIdClient(ClientEntity idClient) {
        this.idClient = idClient;
    }

    public LocalDate getDateVente() {
        return dateVente;
    }

    public void setDateVente(LocalDate dateVente) {
        this.dateVente = dateVente;
    }

    public int getId_vente() {
        return id_vente;
    }

    public void setId_vente(int id_vente) {
        this.id_vente = id_vente;
    }
}
