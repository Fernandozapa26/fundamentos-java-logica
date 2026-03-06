package main.java.com.example;

import java.util.ArrayList;

public class TiposDeDatosPrimitivos {

    static  void demostrarEnteros(){
        //Ejemplos de rangos

        //------------Ejemplos de byte ------------------
        byte edad = 25;   //Rango 8 bits  -128 a 127
        byte temperatura = -10;

        //------------Ejemplos de short------------------
        short avances = 15000;   //16 bits -32,768 a 32,767

        short total = 20000;

        //---------------Ejemplos de int-------------------
        int bolsas = 500000;    //32 bits -2,147,483,648 a 2,147,483,647
        int zapato ;

        //--------------------Ejemplos de long--------------
        long DistanciaMunicipal = 9223372036854775807L;
        long poblacionMundial = 8000000000L; //64 bits -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

    }
    static void demostrarFlotantes(){

        double porcentaje = 8.12542445; // ejemplo de double (mayor precisión)
        float comision = 4.254f; // ejemplo de float (menor precisión)

        System.out.println("Double: " + porcentaje);
        System.out.println("Float: " + comision);
    }
    //--------------------ejemplos de char--------------------
    static void demostrarCaracteres() {

        char letra = 'A';
        char numero = '5';
        char simbolo = '@';

        System.out.println("Letra: " + letra);
        System.out.println("Número: " + numero);
        System.out.println("Símbolo: " + simbolo);
    }
    //--------------------ejemplos booleanos--------------------
    static void demostrarBooleanos(){
        boolean mayor = false;
        boolean enCasa = true;
        System.out.println("boolean: " + mayor + ".");
    }
    //-----ejemplos de valores por defectos -----------
    //se instancia un array list (clase propia de java)
    public static void demostrarValoresPorDefecto() {
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println(nombres);

    }
}
