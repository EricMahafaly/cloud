package com.Eric.venteVehicule.model;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    private int idUtilisateur;
    private String nom;
    private String prenom;
    @Column(name = "nom_utilisateur")
    private String nomUtilisateur;
    @Column(name = "mots_de_passe")
    private String motsDePasse;
    @Column(name = "est_admin")
    private int estAdmin;

    public Utilisateur() {
    }

    public Utilisateur(int idUtilisateur, String nom, String prenom, String nomUtilisateur, String motsDePasse, int estAdmin) {
        this.idUtilisateur = idUtilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.nomUtilisateur = nomUtilisateur;
        this.motsDePasse = motsDePasse;
        this.estAdmin = estAdmin;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotsDePasse() {
        return motsDePasse;
    }

    public void setMotsDePasse(String motsDePasse) {
        this.motsDePasse = motsDePasse;
    }

    public int getEstAdmin() {
        return estAdmin;
    }

    public void setEstAdmin(int estAdmin) {
        this.estAdmin = estAdmin;
    }
}
