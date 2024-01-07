package com.Eric.venteVehicule.controller;

import com.Eric.venteVehicule.dto.AuthentificationDTO;
import com.Eric.venteVehicule.model.Utilisateur;
import com.Eric.venteVehicule.service.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(consumes = APPLICATION_JSON_VALUE)
public class UtilisateurController {
    private AuthenticationManager authenticationManager;
    private UtilisateurService utilisateurService;

    public UtilisateurController(AuthenticationManager authenticationManager, UtilisateurService utilisateurService) {
        this.authenticationManager = authenticationManager;
        this.utilisateurService = utilisateurService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "inscription")
    public void inscription(@RequestBody Utilisateur utilisateur) {
        this.utilisateurService.inscription(utilisateur);
    }

    @PostMapping(path = "connexion")
    public Map<String, String> connexion(@RequestBody AuthentificationDTO authentificationDTO) {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authentificationDTO.nomUtilisateur(), authentificationDTO.motsDePasse())
        );
        System.out.println(authenticate.isAuthenticated());
        return null;
    }
}
