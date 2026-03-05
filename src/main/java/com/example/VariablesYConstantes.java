package main.java.com.example;

public class VariablesYConstantes {

    public void demostrarDeclaracionAsignacion() {

        // Declaración e inicialización de variables
        int edad = 18;
        double altura = 1.62;
        char inicial = 'J';
        boolean esEstudiante = true;
        String nombre = "Juan";

        // Imprimir valores
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante?: " + esEstudiante);
        System.out.println("Nombre: " + nombre);
    }

    public void demostrarConstantes() {

        // Declaración de constantes
        final double PI = 3.1416;
        final int DIAS_SEMANA = 7;

        System.out.println("Valor de PI: " + PI);
        System.out.println("Días de la semana: " + DIAS_SEMANA);
    }

    public static void main(String[] args) {

        // Crear objeto para llamar métodos
        VariablesYConstantes obj = new VariablesYConstantes();

        obj.demostrarDeclaracionAsignacion();
        obj.demostrarConstantes();
    }
}