package ejercicios;

import java.util.Scanner;

public class Entrada {

    public static int entradaCantidadPersonas() {
        Scanner sc = new Scanner(System.in);
        String er = "[0-9]+";
        String scantidadPersonas;
        int icantidadPersonas;
        boolean correcto;
        do {
            System.out.print("Ingrese cantidad personas? ");
            scantidadPersonas = sc.next();
            correcto = scantidadPersonas.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        icantidadPersonas = Integer.parseInt(scantidadPersonas);
        return icantidadPersonas;
    }

    public static double entradaPrecioxkilo(String cadena) {
        Scanner sc = new Scanner(System.in);
        String er = "([0-9]+\\.[0-9]+)||[0-9]+";
        String sprecioxkilo;
        double dprecioxkilo;
        boolean correcto;
        do {
            System.out.print("Ingrese precio x kilo de " + cadena + "? ");
            sprecioxkilo = sc.next();
            correcto = sprecioxkilo.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        dprecioxkilo = Double.parseDouble(sprecioxkilo);
        return dprecioxkilo;
    }

    public static double entradaPrecio(String cadena) {
        Scanner sc = new Scanner(System.in);
        String er = "([0-9]+\\.[0-9]+)||[0-9]+";
        String sprecioxkilo;
        double dprecioxkilo;
        boolean correcto;
        do {
            System.out.print("Ingrese precio " + cadena + "? ");
            sprecioxkilo = sc.next();
            correcto = sprecioxkilo.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        dprecioxkilo = Double.parseDouble(sprecioxkilo);
        return dprecioxkilo;
    }

    public static int entradaNumeroEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String er = "[0-9]+";
        String sNumeroEntero;
        int iNumeroEntero;
        boolean correcto;
        do {
            System.out.print(mensaje);
            sNumeroEntero = sc.next();
            correcto = sNumeroEntero.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        iNumeroEntero = Integer.parseInt(sNumeroEntero);
        return iNumeroEntero;
    }

    public static double entradaNumeroReal(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String er = "([0-9]+\\.[0-9]+)||[0-9]+";
        String sNumeroReal;
        double dNumeroReal;
        boolean correcto;
        do {
            System.out.print(mensaje);
            sNumeroReal = sc.next();
            correcto = sNumeroReal.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        dNumeroReal = Double.parseDouble(sNumeroReal);
        return dNumeroReal;
    }
}
