package com.example.animalerie.services;

import com.example.animalerie.dtos.InClientDto;
import com.example.animalerie.entities.ClientEntity;
import com.example.animalerie.repositories.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    IClientRepository repository;

    public void addClient (InClientDto dto){
        ClientEntity client = new ClientEntity();
        client.setNom(dto.getNom());
        client.setPrenom(dto.getPrenom());
        client.setCodePostal(dto.getCode_postal());
        client.setVille(dto.getVille());
        repository.saveAndFlush(client);
    }

}
