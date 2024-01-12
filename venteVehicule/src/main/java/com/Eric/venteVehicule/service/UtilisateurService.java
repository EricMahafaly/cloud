package com.Eric.venteVehicule.service;

import com.Eric.venteVehicule.model.Utilisateur;
import com.Eric.venteVehicule.repository.UtilisateurRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    private UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public void inscription(Utilisateur utilisateur) {
        this.utilisateurRepository.save(utilisateur);
    }
}
