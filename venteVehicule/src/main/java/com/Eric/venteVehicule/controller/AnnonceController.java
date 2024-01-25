package com.Eric.venteVehicule.controller;

import com.Eric.venteVehicule.model.Annonce;
import com.Eric.venteVehicule.service.AnnonceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "annonce")
public class AnnonceController {
    private AnnonceService annonceService;

    public AnnonceController(AnnonceService annonceService) {
        this.annonceService = annonceService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void creeAnnonce(@RequestBody Annonce annonce) {
        this.annonceService.creeAnnonce(annonce);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Annonce> findAll() {
        return this.annonceService.findAll();
    }

    @PostMapping(path = "validation", consumes = APPLICATION_JSON_VALUE)
    public void validationAnnonce(@RequestBody Annonce annonce) {

    }
}