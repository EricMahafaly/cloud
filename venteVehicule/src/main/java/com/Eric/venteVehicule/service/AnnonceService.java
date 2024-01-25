package com.Eric.venteVehicule.service;

import com.Eric.venteVehicule.connexionBDD.Request;
import com.Eric.venteVehicule.model.Annonce;
import com.Eric.venteVehicule.model.Utilisateur;
import com.Eric.venteVehicule.repository.AnnonceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceService {
    private AnnonceRepository annonceRepository;
    private Request request = new Request();

    public AnnonceService(AnnonceRepository annonceRepository) {
        this.annonceRepository = annonceRepository;
    }

    public void creeAnnonce(Annonce annonce) {
        this.annonceRepository.save(annonce);
    }

    public List<Annonce> findAll() {
        return this.annonceRepository.findAll();
    }

    public List<Annonce> findByDate(String date) {
        return this.request.findAnnonceByDate(date);
    }

    public List<Annonce> findByPrix(double prix) {
        return this.request.findAnnonceByPrix(prix);
    }

    public List<Annonce> historique(Utilisateur utilisateur) {
        return this.request.findAnnonceByUtilisateur(utilisateur);
    }
}
