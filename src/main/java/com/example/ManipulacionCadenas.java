package com.example;

public class ManipulacionCadenas {

    public void demostrarConcatenacion() {
        String hola = "Hola";
        String mundo = " Mundo";

        // Concatenación con +
        System.out.println(hola + mundo);

        // Concatenación con concat()
        System.out.println(hola.concat(mundo));
    }

    public void demostrarMetodosUtiles() {
        String texto = "  Hola Java  ";

        System.out.println("Largo: " + texto.length());
        System.out.println("Letra en 2: " + texto.charAt(2));
        System.out.println("Recorte: " + texto.substring(2, 6));
        System.out.println("Grito: " + texto.toUpperCase());
        System.out.println("Limpio: " + texto.trim());

        // Comparaciones
        System.out.println("¿Es igual?: " + "Java".equals("java"));
        System.out.println("¿Igual sin importar mayúsculas?: " + "Java".equalsIgnoreCase("java"));

        // Búsquedas
        System.out.println("¿Contiene 'Hola'?: " + texto.contains("Hola"));
        System.out.println("¿Empieza con 'H'?: " + texto.trim().startsWith("H"));
    }

    public void demostrarInmutabilidad() {
        String s = "Hola";
        s.concat(" Mundo");

        System.out.println("¿Cambió s?: " + s);

        // Para que cambie:
        // s = s.concat(" Mundo");
    }

    public void usarStringBuilder() {
        StringBuilder constructor = new StringBuilder();

        constructor.append("Hola");
        constructor.append(" ");
        constructor.append("Java eficiente");

        System.out.println(constructor.toString());
    }

    public static void main(String[] args) {

        ManipulacionCadenas obj = new ManipulacionCadenas();

        obj.demostrarConcatenacion();
        obj.demostrarMetodosUtiles();
        obj.demostrarInmutabilidad();
        obj.usarStringBuilder();
    }
}