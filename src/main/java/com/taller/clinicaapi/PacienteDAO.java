package com.taller.clinicaapi;

import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    private static List<Paciente> pacientes = new ArrayList<>();

    // Datos de prueba
    static {
        pacientes.add(new Paciente("CC", "100200300", "Andrés", "Ramírez", "Calle 123 #45-67", "3005551234"));
        pacientes.add(new Paciente("CC", "100200301", "Laura", "González", "Carrera 10 #20-30", "3102223344"));
        pacientes.add(new Paciente("CC", "100200302", "Carlos", "Martínez", "Calle 45 #12-34", "3005556789"));
        pacientes.add(new Paciente("CC", "100200303", "Ana", "Gómez", "Carrera 15 #23-45", "3102224455"));
        pacientes.add(new Paciente("CC", "100200304", "Pedro", "López", "Avenida 10 #34-56", "3005559999"));
    }

    // Retorna la lista completa
    public static List<Paciente> listarPacientes() {
        return pacientes;
    }

    // Busca un paciente por número de documento
    public static Paciente buscarPorDocumento(String numeroDocumento) {
        for (Paciente p : pacientes) {
            if (p.getNumeroDocumento().equals(numeroDocumento)) {
                return p;
            }
        }
        return null; // Retorna null si no encuentra
    }
}

