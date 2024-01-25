package com.Eric.venteVehicule.connexionBDD;

import com.Eric.venteVehicule.model.Annonce;
import com.Eric.venteVehicule.model.Utilisateur;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Request {
    private ConnexPostgres connexPostgres = new ConnexPostgres();

    public List<Annonce> findAnnonceByDate(String date) {
        List<Annonce> allAnnonce = new ArrayList<>();
        Connection connection = this.connexPostgres.getConnex();
        try {
            String sql = "SELECT * FROM v_annonce WHERE date_annonce >= '" + date + " 00:00:00' AND date_annonce <= '" + date + " 23:59:59'";
            System.out.println(sql);
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery(sql);
            while(res.next()) {
                Annonce annonce = new Annonce();
                annonce.setIdAnnonce(res.getInt("id_annonce"));
                annonce.setDescription(res.getString("description_"));
                annonce.setPrix(res.getDouble("prix"));
                annonce.setStatus(res.getInt("status_"));
                annonce.setDateAnnonce(res.getTimestamp("date_annonce").toLocalDateTime());
                annonce.setUtilisateur(
                    new Utilisateur(res.getInt("id_utilisateur"),
                        res.getString("nom_utilisateur"),
                        res.getString("mots_de_passe"),
                        res.getString("role_")
                    )
                );
                allAnnonce.add(annonce);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return allAnnonce;
    }

    public List<Annonce> findAnnonceByPrix(double prix) {
        List<Annonce> allAnnonce = new ArrayList<>();
        Connection connection = this.connexPostgres.getConnex();
        try {
            String sql = "SELECT * FROM v_annonce WHERE prix <= " + prix;
            System.out.println(sql);
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery(sql);
            while(res.next()) {
                Annonce annonce = new Annonce();
                annonce.setIdAnnonce(res.getInt("id_annonce"));
                annonce.setDescription(res.getString("description_"));
                annonce.setPrix(res.getDouble("prix"));
                annonce.setStatus(res.getInt("status_"));
                annonce.setDateAnnonce(res.getTimestamp("date_annonce").toLocalDateTime());
                annonce.setUtilisateur(
                        new Utilisateur(res.getInt("id_utilisateur"),
                                res.getString("nom_utilisateur"),
                                res.getString("mots_de_passe"),
                                res.getString("role_")
                        )
                );
                allAnnonce.add(annonce);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return allAnnonce;
    }

    public List<Annonce> findAnnonceByUtilisateur(Utilisateur utilisateur) {
        List<Annonce> allAnnonce = new ArrayList<>();
        Connection connection = this.connexPostgres.getConnex();
        try {
            String sql = "SELECT * FROM v_annonce WHERE id_utilisateur = " + utilisateur.getIdUtilisateur();
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery(sql);
            while(res.next()) {
                Annonce annonce = new Annonce();
                annonce.setIdAnnonce(res.getInt("id_annonce"));
                annonce.setDescription(res.getString("description_"));
                annonce.setPrix(res.getDouble("prix"));
                annonce.setStatus(res.getInt("status_"));
                annonce.setDateAnnonce(res.getTimestamp("date_annonce").toLocalDateTime());
                annonce.setUtilisateur(
                        new Utilisateur(res.getInt("id_utilisateur"),
                                res.getString("nom_utilisateur"),
                                res.getString("mots_de_passe"),
                                res.getString("role_")
                        )
                );
                allAnnonce.add(annonce);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return allAnnonce;
    }
}
