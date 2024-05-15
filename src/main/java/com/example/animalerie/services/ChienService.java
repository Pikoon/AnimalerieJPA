package com.example.animalerie.services;

import com.example.animalerie.dtos.InChienDto;
import com.example.animalerie.dtos.OutChienDto;
import com.example.animalerie.entities.AnimauxEntity;
import com.example.animalerie.repositories.IAnimauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ChienService implements IChienService {

    @Autowired
    private IAnimauxRepository repository;

    @Override
    public int calculeAgeChien(LocalDate dateNaiss) {
        return 0;
    }

    @Override
    public int calculeAgeReel(LocalDate dateNaiss) {
        return 0;
    }

    @Override
    public OutChienDto toDto(AnimauxEntity entity) {

        OutChienDto dto = new OutChienDto();

        dto.setNom(entity.getNom());
        dto.setEspece(entity.getEspece());
        dto.setAge_chien(this.calculeAgeChien(entity.getDateNaissance()));
        dto.setAge_reel(this.calculeAgeReel(entity.getDateNaissance()));

        return dto;
    }

    @Override
    public OutChienDto get(Integer id) {
        return toDto(repository.findById(id).get());
    }

    @Override
    public void ajouter(InChienDto dto) {
        AnimauxEntity bestiole = new AnimauxEntity();
        bestiole.setEspece(dto.getEspece());
        bestiole.setDateNaissance(dto.getDate_naissance());
        bestiole.setNom(dto.getNom());
        bestiole.setSexe(dto.getSexe());
        bestiole.setTaille(dto.getTaille());
        bestiole.setPoids(dto.getPoids());
        repository.saveAndFlush(bestiole);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public void modify (Integer id, InChienDto dto){
        //récupère l'animal qui correspond au dto
        AnimauxEntity bestiole = repository.findById(id).get();

        bestiole.setEspece(dto.getEspece());
        bestiole.setDateNaissance(dto.getDate_naissance());
        bestiole.setNom(dto.getNom());
        bestiole.setSexe(dto.getSexe());
        bestiole.setTaille(dto.getTaille());
        bestiole.setPoids(dto.getPoids());

        repository.saveAndFlush(bestiole);
    }

}
