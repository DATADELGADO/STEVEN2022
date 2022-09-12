package sql_alumno3;

import java.util.Scanner;

public class Entrada {

    public static String entradaCadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String er = "[a-zA-Z0-9]+";
        String sCadena;
        boolean correcto;
        do {
            System.out.print(mensaje);
            sCadena = sc.next();
            correcto = sCadena.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        return sCadena;
    }

    public static String entradaRutaNombreArchivo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String sCadena;
        System.out.print(mensaje);
        sCadena = sc.nextLine();
        return sCadena;
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
