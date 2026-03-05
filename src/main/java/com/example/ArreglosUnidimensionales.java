package main.java.com.example;

public class ArreglosUnidimensionales {

    // Muestra diferentes formas de declarar, crear e inicializar un arreglo
    public static void declararCrearInicializar() {

        // Forma 1: declarar primero y luego crear el arreglo con un tamaño definido
        int[] numeros;
        numeros = new int[3]; // el arreglo tiene espacio para 3 números

        // Forma 2: declarar e inicializar directamente con valores
        int[] notas = {10, 8, 9, 7}; // Java detecta automáticamente el tamaño

        System.out.println("Arreglos creados correctamente.");
    }


    // Usa la propiedad length para conocer el tamaño de un arreglo
    public static void mostrarLongitud() {

        String[] nombres = {"Ana", "Beto", "Carla"};

        int cantidadNombres = nombres.length;

        System.out.println("El arreglo tiene " + cantidadNombres + " posiciones.");
    }


    // Recorre un arreglo usando un bucle for tradicional con índice
    public static void recorrerConForClasico() {

        int[] puntos = {100, 200, 300};

        for (int indice = 0; indice < puntos.length; indice++) {

            System.out.println("Posición " + indice + " contiene: " + puntos[indice]);

        }
    }


    // Recorre un arreglo utilizando el bucle for-each
    public static void recorrerConForEach() {

        String[] videojuegos = {"Zelda", "Mario", "Sonic"};

        // En cada iteración se obtiene un elemento del arreglo
        for (String juego : videojuegos) {

            System.out.println("Juego encontrado: " + juego);

        }
    }


    // Ejemplo de método que recibe un arreglo como parámetro y también retorna uno
    public static void arrayComoParametroYRetorno() {

        int[] datos = {5, 10, 15};

        // Se envía el arreglo al método que lo recibe como parámetro
        recibirArray(datos);

        // Se obtiene un arreglo generado por otro método
        int[] nuevoArray = crearArray();

        System.out.println("El nuevo arreglo tiene " + nuevoArray.length + " elementos.");
    }


    // Método auxiliar que recibe un arreglo
    private static void recibirArray(int[] valores) {

        System.out.println("Se recibió un arreglo con " + valores.length + " elementos.");

    }


    // Método auxiliar que crea y retorna un arreglo
    private static int[] crearArray() {

        int[] arregloCreado = {1, 2, 3};

        return arregloCreado;

    }
}