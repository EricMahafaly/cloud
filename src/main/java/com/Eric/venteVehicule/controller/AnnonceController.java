package com.Eric.venteVehicule.controller;

import com.Eric.venteVehicule.model.Annonce;
import com.Eric.venteVehicule.model.Utilisateur;
import com.Eric.venteVehicule.service.AnnonceService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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

    @GetMapping(path = "recherche/date")
    public List<Annonce> rechercheAvanceDate(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return this.annonceService.findByDate(date.toString());
    }

    @GetMapping(path = "recherche/prix", produces = APPLICATION_JSON_VALUE)
    public List<Annonce> rechercheAvancePrix(@RequestParam("prix") double prix) {
        return this.annonceService.findByPrix(prix);
    }

    @GetMapping(path = "historique", produces = APPLICATION_JSON_VALUE)
    public List<Annonce> historique(@RequestBody Utilisateur utilisateur) {
        return this.annonceService.historique(utilisateur);
    }

    @PostMapping(path = "favoris/{idAnnonce}")
    public void ajoutFavoris(@PathVariable int idAnnonce, @RequestBody Utilisateur utilisateur) {
        System.out.println(idAnnonce);
    }
}