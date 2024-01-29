package com.Eric.venteVehicule.repository;

import com.Eric.venteVehicule.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findByNomUtilisateur(String nomUtilisateur);
}
