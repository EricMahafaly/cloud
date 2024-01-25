\c postgres
DROP DATABASE vente_vehicule;

CREATE DATABASE vente_vehicule;
\c vente_vehicule

CREATE TABLE utilisateur (
    id_utilisateur SERIAL PRIMARY KEY,
    nom_utilisateur VARCHAR(255) UNIQUE,
    mots_de_passe VARCHAR(255),
    role_ VARCHAR(255)
);

CREATE TABLE annonce (
    id_annonce SERIAL PRIMARY KEY,
    description_ TEXT,
    prix DOUBLE PRECISION,
    status_ INTEGER,
    date_annonce TIMESTAMP,
    id_utilisateur INTEGER,
    FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id_utilisateur)
);

CREATE TABLE photo_annonce (
    id_photo_annonce SERIAL PRIMARY KEY,
    chemin VARCHAR(255),
    id_annonce INTEGER,
    FOREIGN KEY (id_annonce) REFERENCES annonce(id_annonce)
);