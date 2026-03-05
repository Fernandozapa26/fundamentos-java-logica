package main.java.com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    // Método que muestra cómo leer diferentes tipos de datos desde la consola
    public static void leerVariosTipos(Scanner scanner) {

        System.out.println("=== Lectura de diferentes tipos de datos ===");

        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();

        // Limpiar el salto de línea que queda pendiente
        scanner.nextLine();

        System.out.print("Ingrese una línea completa: ");
        String lineaCompleta = scanner.nextLine();

        System.out.println("\nResultados ingresados:");
        System.out.println("Entero: " + numeroEntero);
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Palabra: " + palabra);
        System.out.println("Línea completa: " + lineaCompleta);
    }


    // Ejemplo del problema común del salto de línea cuando se usa nextInt() y nextLine()
    public static void manejarSaltoDeLineaPendiente(Scanner scanner) {

        System.out.println("\n=== Manejo del salto de línea pendiente ===");

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); // nextInt deja un salto de línea pendiente

        scanner.nextLine(); // se consume el salto pendiente

        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombreCompleto);
    }
}