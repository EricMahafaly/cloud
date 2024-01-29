package com.Eric.venteVehicule.connexionBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexPostgres {
    public Connection getConnex() {
        String url = "jdbc:postgresql://roundhouse.proxy.rlwy.net:47730/railway";
        String username = "postgres";
        String password = "3AgFaC-fFCDGgag-6-FFd*FC4D1Ceg*g";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}