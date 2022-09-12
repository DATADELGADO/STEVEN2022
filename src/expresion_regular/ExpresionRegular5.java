package expresion_regular;

import java.util.Scanner;

public class ExpresionRegular5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8
        String scadena;
        String erl = "[a-zA-Z\u00F1\u00D1]";
        String erd = "[0-9]";
        int cletra = 0;
        int cdigito = 0;
        int cotro = 0;
        System.out.print("Ingrese cadena? ");
        scadena = sc.nextLine().trim();
        for (int i = 0; i < scadena.length(); i++) {
            String caracter = scadena.charAt(i) + "";
            if (caracter.matches(erl)) {
                cletra++;
            } else {
                if (caracter.matches(erd)) {
                    cdigito++;
                } else {
                    cotro++;
                }
            }
        }
        System.out.println("Cantidad de letras : " + cletra);
        System.out.println("Cantidad de digitos: " + cdigito);
        System.out.println("Cantidad de otros  : " + cotro);
    }
}
