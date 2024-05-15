package com.example.animalerie.services;

import com.example.animalerie.dtos.OutChienDto;
import com.example.animalerie.entities.AnimauxEntity;

import java.time.LocalDate;

public interface IChienService {
    int calculeAgeChien (LocalDate dateNaiss);
    int calculeAgeReel (LocalDate dateNaiss);

    OutChienDto toDto (AnimauxEntity entity);

    OutChienDto get(Integer id);
}
