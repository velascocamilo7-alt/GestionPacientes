package com.taller.clinicaapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc:mysql://localhost:3306/clinica";
    private static final String USER = "root"; // tu usuario MySQL
    private static final String PASSWORD = "9610"; // tu contraseña

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

