CREATE DATABASE vente_vehicule;
\c vente_vehicule


CREATE TABLE utilisateur (
    id_utilisateur SERIAL PRIMARY KEY,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    nom_utilisateur VARCHAR(100) UNIQUE,
    mots_de_passe VARCHAR(100),
    est_admin INTEGER
);