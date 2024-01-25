package com.Eric.venteVehicule.service;

import com.Eric.venteVehicule.model.Utilisateur;
import com.Eric.venteVehicule.repository.UtilisateurRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    private UtilisateurRepository utilisateurRepository;
    private BCryptPasswordEncoder passwordEncoder;

    public UtilisateurService(UtilisateurRepository utilisateurRepository, BCryptPasswordEncoder passwordEncoder) {
        this.utilisateurRepository = utilisateurRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void inscription(Utilisateur utilisateur) {
        String mdpCrypte = this.passwordEncoder.encode(utilisateur.getMotsDePasse());
        utilisateur.setMotsDePasse(mdpCrypte);
        this.utilisateurRepository.save(utilisateur);
    }

    public Utilisateur find(String nomUtilisateur) {
        return this.utilisateurRepository.findByNomUtilisateur(nomUtilisateur);
    }
}
