package com.example.animalerie.repositories;

import com.example.animalerie.entities.VenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVenteRepository extends JpaRepository<VenteEntity, Integer> {
}