package com.example.animalerie.controllers;

import com.example.animalerie.dtos.InChienDto;
import com.example.animalerie.services.ChienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("animaux")
public class AnimauxRessource {

    private final ChienService chienService;

    @Autowired
    private ChienService service;

    public AnimauxRessource(ChienService chienService) {
        this.chienService = chienService;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity get (@PathVariable String id) {
        Integer idInt = null;
        try {
            idInt = Integer.parseInt(id);
        }catch (Exception e) {
            return new ResponseEntity("l'id n'est pas bon", HttpStatusCode.valueOf(500));
        }
        return new ResponseEntity(chienService.get(idInt), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody InChienDto inDto){
        service.ajouter(inDto);
        return new ResponseEntity("Clébard  ajouté", HttpStatusCode.valueOf(200));
    }

}
