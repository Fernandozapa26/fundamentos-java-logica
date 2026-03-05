package main.java.com.example;

public class ArreglosBidimensionales {

    // En este método se muestran dos formas de declarar y crear matrices en Java
    public static void declararCrearMatrices() {

        // Se crea una matriz de 3 filas y 2 columnas (como una pequeña tabla)
        int[][] matrizNumeros = new int[3][2];

        // También se puede crear la matriz directamente con valores iniciales
        int[][] matrizInicializada = {
                {1, 2},  // fila 0
                {3, 4},  // fila 1
                {5, 6}   // fila 2
        };

        System.out.println("Matriz creada correctamente.");
    }


    // Este método muestra cómo recorrer una matriz usando bucles for anidados
    public static void recorrerMatriz() {

        int[][] matrizDatos = {
                {10, 20},
                {30, 40}
        };

        // Recorre cada fila de la matriz
        for (int fila = 0; fila < matrizDatos.length; fila++) {

            // Recorre cada columna dentro de la fila actual
            for (int columna = 0; columna < matrizDatos[fila].length; columna++) {

                System.out.println(
                        "Fila " + fila +
                                ", Columna " + columna +
                                " = " + matrizDatos[fila][columna]
                );
            }
        }
    }


    // Ejemplo práctico de uso de matrices: sumar todos los valores almacenados
    public static void ejemploUsosTipicos() {

        // Matriz que podría representar precios o valores organizados en tabla
        int[][] matrizPrecios = {
                {10, 5},
                {20, 10}
        };

        int sumaTotal = 0;

        // Recorremos toda la matriz para sumar cada valor
        for (int fila = 0; fila < matrizPrecios.length; fila++) {
            for (int columna = 0; columna < matrizPrecios[fila].length; columna++) {

                sumaTotal += matrizPrecios[fila][columna];

            }
        }

        System.out.println("La suma total de los valores es: " + sumaTotal);
    }
}