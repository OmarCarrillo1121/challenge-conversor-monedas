package com.conversor.main;

import com.conversor.service.ConsultaAPI;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("""
                ***************************************************
                Bienvenidos al conversor de monedas
                
                1) Peso Mexicano [MXN] =>> Dólar [USD]
                2) Peso Mexicano [MXN] =>> Peso Argentino [ARS]
                3) Dólar [USD] =>> Peso Mexicano [MXN]
                4) Dólar [USD] =>> Peso Argentino [ARS]
                5) Peso Argentino [ARS] =>> Dólar [USD]
                6) Peso Argentino [ARS] =>> Peso Mexicano [MXN]
                7) Salir
                Elija una opción:
                ***************************************************
                """);

            try {
                opcion = Integer.parseInt(teclado.nextLine());

                if (opcion == 7) break;
                if (opcion < 1 || opcion > 7) {
                    System.out.println("Opción incorrecta, elija una opción válida.");
                    continue;
                }

                System.out.println("Ingrese el valor que desea convertir:");
                double valor = Double.parseDouble(teclado.nextLine());

                procesarConversion(opcion, valor, consulta);

            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese solo números.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
        System.out.println("Gracias por usar nuestro conversor de monedas. Hasta pronto.");
    }

    private static void procesarConversion(int opcion, double valor, ConsultaAPI consulta) {
        String base = "", destino = "";

        switch (opcion) {
            case 1 -> { base = "MXN"; destino = "USD"; }
            case 2 -> { base = "MXN"; destino = "ARS"; }
            case 3 -> { base = "USD"; destino = "MXN"; }
            case 4 -> { base = "USD"; destino = "ARS"; }
            case 5 -> { base = "ARS"; destino = "USD"; }
            case 6 -> { base = "ARS"; destino = "MXN"; }
        }

        double tasa = consulta.obtenerTasa(base, destino);
        double resultado = valor * tasa;

        System.out.printf("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]%n%n",
                valor, base, resultado, destino);
    }
}