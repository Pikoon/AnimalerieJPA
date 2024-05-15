package com.example.animalerie.controllers;

import com.example.animalerie.services.ChienService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("animaux")
public class AnimauxRessource {

    private final ChienService chienService;

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

}
