package com.example;

public class EstructurasDeRepeticion {

    public void ejemploWhile() {
        int vueltas = 1;
        while (vueltas <= 3) {
            System.out.println("Vuelta número: " + vueltas);
            vueltas++; // evita bucle infinito
        }
    }

    public void ejemploDoWhile() {
        int intentos = 0;
        do {
            System.out.println("Intentando conectar...");
            intentos++;
        } while (intentos < 1);
    }

    public void ejemploForClasico() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Contando: " + i);
        }
    }

    public void ejemploForAnidado() {
        for (int hora = 1; hora <= 2; hora++) {
            for (int minuto = 1; minuto <= 3; minuto++) {
                System.out.println("Hora: " + hora + " Min: " + minuto);
            }
        }
    }

    public void ejemploBreakContinue() {
        for (int i = 1; i <= 5; i++) {

            if (i == 2) {
                continue; // salta el 2
            }

            if (i == 4) {
                break; // termina el ciclo
            }

            System.out.println("Número: " + i);
        }
    }

    public void ejemploEtiquetas() {

        bucleExterno:
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (i == 1) {
                    break bucleExterno;
                }

                System.out.println("i=" + i + " j=" + j);
            }
        }
    }

    public static void main(String[] args) {

        EstructurasDeRepeticion obj = new EstructurasDeRepeticion();

        obj.ejemploWhile();
        obj.ejemploDoWhile();
        obj.ejemploForClasico();
        obj.ejemploForAnidado();
        obj.ejemploBreakContinue();
        obj.ejemploEtiquetas();
    }
}