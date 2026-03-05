package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {
        // 'void' significa que no devuelve nada
        System.out.println("¡Hola! Soy un método estático.");
    }

    public static void ejemploPasoParametros(String nombre, int edad) {
        // Recibe un texto y un número
        System.out.println(nombre + " tiene " + edad + " años.");
    }

    public static int ejemploRetornoValores(int a, int b) {
        // Devuelve un número
        return a + b;
    }

    public static void ejemploSobrecarga() {
        System.out.println("Método sin nada.");
    }

    public static void ejemploSobrecarga(String mensaje) {
        // Sobrecarga del método
        System.out.println("Método con mensaje: " + mensaje);
    }

    public static void main(String[] args) {

        ejemploDeclaracionLlamada();

        ejemploPasoParametros("Juan", 25);

        int resultado = ejemploRetornoValores(10, 5);
        System.out.println("La suma es: " + resultado);

        ejemploSobrecarga();
        ejemploSobrecarga("Probando sobrecarga");
    }
}