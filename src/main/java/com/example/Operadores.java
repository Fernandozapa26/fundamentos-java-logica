package main.java.com.example;

public class Operadores {

    // Ejemplos de operadores matemáticos básicos
    public static void demostrarAritmeticos() {

        int numero1 = 10;
        int numero2 = 3;

        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));
        System.out.println("División: " + (numero1 / numero2));
        System.out.println("Módulo: " + (numero1 % numero2));
        System.out.println();
    }

    // Cómo funcionan los incrementos y decrementos
    public static void demostrarIncrementoDecremento() {

        int valor = 5;

        System.out.println("=== Incremento y Decremento ===");
        System.out.println("Valor inicial: " + valor);

        System.out.println("Postfijo valor++: " + (valor++));
        System.out.println("Después de valor++: " + valor);

        System.out.println("Prefijo ++valor: " + (++valor));

        System.out.println("Postfijo valor--: " + (valor--));
        System.out.println("Después de valor--: " + valor);

        System.out.println("Prefijo --valor: " + (--valor));
        System.out.println();
    }

    // Comparaciones entre valores
    public static void demostrarRelacionales() {

        int numeroA = 8;
        int numeroB = 5;

        System.out.println("=== Operadores Relacionales ===");
        System.out.println("numeroA > numeroB: " + (numeroA > numeroB));
        System.out.println("numeroA >= numeroB: " + (numeroA >= numeroB));
        System.out.println("numeroA < numeroB: " + (numeroA < numeroB));
        System.out.println("numeroA <= numeroB: " + (numeroA <= numeroB));
        System.out.println("numeroA == numeroB: " + (numeroA == numeroB));
        System.out.println("numeroA != numeroB: " + (numeroA != numeroB));
        System.out.println();
    }

    // Operadores lógicos usados con valores booleanos
    public static void demostrarLogicos() {

        boolean condicion1 = true;
        boolean condicion2 = false;

        System.out.println("=== Operadores Lógicos ===");
        System.out.println("condicion1 && condicion2: " + (condicion1 && condicion2));
        System.out.println("condicion1 || condicion2: " + (condicion1 || condicion2));
        System.out.println("!condicion1: " + (!condicion1));
        System.out.println();
    }

    // Operadores que modifican directamente el valor de una variable
    public static void demostrarAsignacionCompuesta() {

        int valor = 10;

        System.out.println("=== Asignación Compuesta ===");

        valor += 5;
        System.out.println("valor += 5: " + valor);

        valor -= 3;
        System.out.println("valor -= 3: " + valor);

        valor *= 2;
        System.out.println("valor *= 2: " + valor);

        valor /= 4;
        System.out.println("valor /= 4: " + valor);

        valor %= 3;
        System.out.println("valor %= 3: " + valor);
        System.out.println();
    }

    // Forma corta de escribir una condición if-else
    public static void demostrarOperadorTernario() {

        int edad = 18;

        System.out.println("=== Operador Ternario ===");

        String resultado = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";

        System.out.println(resultado);
    }

    // Punto de entrada para ejecutar todos los ejemplos
    public static void main(String[] args) {

        demostrarAritmeticos();
        demostrarIncrementoDecremento();
        demostrarRelacionales();
        demostrarLogicos();
        demostrarAsignacionCompuesta();
        demostrarOperadorTernario();
    }
}