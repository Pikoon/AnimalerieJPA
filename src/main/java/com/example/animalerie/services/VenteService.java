package com.example.animalerie.services;

import com.example.animalerie.dtos.InVenteDto;
import com.example.animalerie.entities.ClientEntity;
import com.example.animalerie.entities.VenteEntity;
import com.example.animalerie.repositories.IClientRepository;
import com.example.animalerie.repositories.IVenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VenteService {

    @Autowired
    IVenteRepository repository;
    @Autowired
    IClientRepository clientRepository;

    public void addVente(InVenteDto dto){
        VenteEntity vente = new VenteEntity();
        vente.setDateVente(dto.getDate());
        ClientEntity client = clientRepository.findById(dto.getId_client()).get();
        if (client.getId() != null) {
            vente.setIdClient(client);
        }
        repository.save(vente);
    }
}
