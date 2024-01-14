package com.Eric.venteVehicule.service;

import com.Eric.venteVehicule.model.Annonce;
import com.Eric.venteVehicule.model.Utilisateur;
import com.Eric.venteVehicule.repository.AnnonceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceService {
    private AnnonceRepository annonceRepository;

    public AnnonceService(AnnonceRepository annonceRepository) {
        this.annonceRepository = annonceRepository;
    }

    public void creeAnnonce(Annonce annonce) {
        this.annonceRepository.save(annonce);
    }

    public List<Annonce> findAll() {
        return this.annonceRepository.findAll();
    }
}
