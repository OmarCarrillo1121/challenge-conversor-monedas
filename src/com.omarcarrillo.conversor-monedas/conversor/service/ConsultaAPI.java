package com.omarcarrillo.conversor-monedas.service;

import com.omarcarrillo.conversor-monedas.model.ConversorMonedas;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {

    public double obtenerTasa(String monedaBase, String monedaDestino) {

        String apiKey = "351c5a36c74a185940f80ceb";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            ConversorMonedas miData = new Gson().fromJson(response.body(), ConversorMonedas.class);

            return miData.conversion_rates().get(monedaDestino);

        } catch (Exception e) {
            throw new RuntimeException("Error al conectar con la API: " + e.getMessage());
        }
    }
}