package com.example;

public class EstructurasCondicionales {

    // Ejemplo simple de if
    public static void ejemploIf() {

        int edad = 20;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }

    // Ejemplo de if - else
    public static void ejemploIfElse() {

        int numero = 5;

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    // Ejemplo de if - else if
    public static void ejemploIfElseIf() {

        int nota = 85;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    // Ejemplo de switch tradicional
    public static void ejemploSwitch() {

        int dia = 3;

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            default:
                System.out.println("Día no válido");
        }
    }

    // Ejemplo equivalente al switch moderno pero compatible con Java 8
    public static void ejemploSwitchExpression() {

        String tipoClima = "Lluvia";
        String accion;

        switch (tipoClima) {

            case "Sol":
                accion = "Usar gafas de sol";
                break;

            case "Lluvia":
                accion = "Usar paraguas";
                break;

            default:
                accion = "Quedarse en casa";
                break;
        }

        System.out.println("Acción recomendada: " + accion);
    }
}