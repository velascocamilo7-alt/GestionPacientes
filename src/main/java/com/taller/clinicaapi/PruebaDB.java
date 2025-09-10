package com.taller.clinicaapi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PruebaDB {
    public static void main(String[] args) {
        try (Connection conn = Database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT nombres, apellidos FROM paciente")) {

            while (rs.next()) {
                System.out.println(rs.getString("nombres") + " " + rs.getString("apellidos"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

