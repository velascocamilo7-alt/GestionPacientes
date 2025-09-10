package com.taller.clinicaapi;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/pacientes")
public class PacienteResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Paciente> getPacientes() {
        return PacienteDAO.listarPacientes();
    }

    @GET
    @Path("/{numeroDocumento}")
    @Produces(MediaType.APPLICATION_JSON)
    public Paciente getPaciente(@PathParam("numeroDocumento") String numeroDocumento) {
        return PacienteDAO.buscarPorDocumento(numeroDocumento);
    }
}


