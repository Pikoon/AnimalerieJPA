package com.example.animalerie.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeRessource {

    @GetMapping("test")
    public String test() {
        System.out.println("page test");
        return "c'est OK";
    }
}
