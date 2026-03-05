package main.java.com.example;

public class ConversionDeTipos {

    // Ejemplo de conversión implícita (widening)
    // Java convierte automáticamente un tipo más pequeño a uno más grande
    public static void demostrarCastingImplicito() {

        int numeroEntero = 100;

        // El entero se convierte automáticamente a double
        double numeroDecimal = numeroEntero;

        System.out.println("Valor entero: " + numeroEntero);
        System.out.println("Convertido a double: " + numeroDecimal);
    }


    // Ejemplo de conversión explícita (narrowing)
    // Aquí debemos indicar el tipo manualmente
    public static void demostrarCastingExplicito() {

        double numeroDecimal = 9.78;

        // Se convierte a int usando casting
        int numeroEntero = (int) numeroDecimal;

        System.out.println("Valor original (double): " + numeroDecimal);
        System.out.println("Convertido a int: " + numeroEntero);
    }


    // Ejemplo donde el casting puede generar pérdida de precisión
    public static void demostrarProblemasDePrecision() {

        double valorGrande = 12345.6789;

        // Al convertir a int se pierde la parte decimal
        int valorConvertido = (int) valorGrande;

        System.out.println("Valor original: " + valorGrande);
        System.out.println("Valor después del casting: " + valorConvertido);
    }
}