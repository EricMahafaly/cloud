package com.Eric.venteVehicule.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "annonce")
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_annonce")
    int idAnnonce;
    @Column(name = "description_")
    String description;
    double prix;
    @Column(name = "status_")
    int status = 0;
    @Column(name = "date_annonce")
    LocalDateTime dateAnnonce = LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    Utilisateur utilisateur;

    public Annonce() {
    }

    public Annonce(int idAnnonce, String description, double prix, int status, LocalDateTime dateAnnonce, Utilisateur utilisateur) {
        this.idAnnonce = idAnnonce;
        this.description = description;
        this.prix = prix;
        this.status = status;
        this.dateAnnonce = dateAnnonce;
        this.utilisateur = utilisateur;
    }

    public int getIdAnnonce() {
        return idAnnonce;
    }

    public void setIdAnnonce(int idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getDateAnnonce() {
        return dateAnnonce;
    }

    public void setDateAnnonce(LocalDateTime dateAnnonce) {
        this.dateAnnonce = dateAnnonce;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
