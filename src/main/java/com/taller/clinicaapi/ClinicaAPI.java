package com.taller.clinicaapi;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class ClinicaAPI {
    public static final String BASE_URI = "http://localhost:8083/api/";

    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig().packages("com.taller.clinicaapi");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();
        System.out.println("Servidor iniciado en " + BASE_URI);
        System.out.println("Presiona ENTER para detenerlo...");
        System.in.read();
        server.shutdownNow();
    }
}
