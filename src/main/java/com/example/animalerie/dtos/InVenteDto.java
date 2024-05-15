package com.example.animalerie.dtos;

import java.time.LocalDate;

public class InVenteDto {

    private LocalDate date;

    private int id_client;

    public LocalDate getDate() {
        return date;
    }

    public int getId_client() {
        return id_client;
    }

}
