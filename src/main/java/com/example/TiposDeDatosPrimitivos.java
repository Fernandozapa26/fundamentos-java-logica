package main.java.com.example;

public class TiposDeDatosPrimitivos {

    public void demostrarEnteros() {
        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 10000000000L;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
    }

    public void demostrarFlotantes() {
        float f = 1.0332f;
        double d = 1.0452345634;

        System.out.println(f);
        System.out.println(d);
    }

    public void demostrarCaracteres() {
        char c = 'A';
        System.out.println(c);
    }

    public void demostrarBooleanos() {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);
    }

    public void demostrarValoresPorDefecto() {
        // Las variables locales deben inicializarse antes de usarse
        // Los atributos de clase sí tienen valores por defecto
    }

    public static void main(String[] args) {
        TiposDeDatosPrimitivos t = new TiposDeDatosPrimitivos();

        t.demostrarEnteros();
        t.demostrarFlotantes();
        t.demostrarCaracteres();
        t.demostrarBooleanos();
    }
}
