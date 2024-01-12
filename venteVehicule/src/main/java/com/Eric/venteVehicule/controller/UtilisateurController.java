package com.Eric.venteVehicule.controller;

import com.Eric.venteVehicule.model.Utilisateur;
import com.Eric.venteVehicule.service.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("utilisateur")
public class UtilisateurController {
    private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "inscription", consumes = APPLICATION_JSON_VALUE)
    public void inscription(@RequestBody Utilisateur utilisateur) {
        this.utilisateurService.inscription(utilisateur);
    }

    @GetMapping("/admin")
    public String admin() {
        return "page admin";
    }

    @GetMapping("/user")
    public String user() {
        return "page user";
    }
}
