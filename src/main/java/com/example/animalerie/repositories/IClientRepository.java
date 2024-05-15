package com.example.animalerie.repositories;

import com.example.animalerie.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<ClientEntity, Integer> {
}
