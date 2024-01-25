package com.Eric.venteVehicule.repository;

import com.Eric.venteVehicule.model.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceRepository extends JpaRepository<Annonce, Integer> {
}
