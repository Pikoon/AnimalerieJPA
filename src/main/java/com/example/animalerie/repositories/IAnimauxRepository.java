package com.example.animalerie.repositories;

import com.example.animalerie.entities.AnimauxEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnimauxRepository extends JpaRepository<AnimauxEntity, Integer> {

}
