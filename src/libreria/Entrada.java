package libreria;

import java.util.Scanner;

public class Entrada {

    public static String entradaCadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String cadena = sc.nextLine();
        return cadena;
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

    public static String entradaNombre(String mensaje) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8);
        String er = "[a-zA-Z\u00F1\u00D1]+";//ñÑ
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
