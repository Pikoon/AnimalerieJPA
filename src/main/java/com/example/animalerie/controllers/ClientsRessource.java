package com.example.animalerie.controllers;


import com.example.animalerie.dtos.InClientDto;
import com.example.animalerie.services.ClientService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clients")
public class ClientsRessource {

    @Autowired
    ClientService service;

    @PostMapping("add")
    public ResponseEntity add(@RequestBody InClientDto dto){
        service.addClient(dto);
        return new ResponseEntity("Client ajouté", HttpStatusCode.valueOf(200));
    }

}
