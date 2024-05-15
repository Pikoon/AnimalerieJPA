package com.example.animalerie.controllers;

import com.example.animalerie.dtos.InVenteDto;
import com.example.animalerie.services.VenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sales")
public class VenteRessource {

    @Autowired
    VenteService service;

    @PostMapping("add")
    public ResponseEntity add (@RequestBody InVenteDto dto){
        service.addVente(dto);
        return new ResponseEntity("Vente ajoutée", HttpStatusCode.valueOf(200));
    }
}
