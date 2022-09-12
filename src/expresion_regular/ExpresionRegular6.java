package expresion_regular;

import java.util.Scanner;

public class ExpresionRegular6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8
        String scadena;
        String erl = "[a-zA-Z\u00F1\u00D1]|[áéíóúÁÉÍÓÚ]";
        String erv = "[aeiouAEIOUáéíóúÁÉÍÓÚ]";
        int cvocal = 0;
        int cconsonante = 0;
        int cotro = 0;
        System.out.print("Ingrese cadena? ");
        scadena = sc.nextLine().trim();
        for (int i = 0; i < scadena.length(); i++) {
            String caracter = scadena.charAt(i) + "";
            if (caracter.matches(erl)) {
                if (caracter.matches(erv)) {
                    cvocal++;
                } else {
                    cconsonante++;
                }
            } else {
                cotro++;
            }
        }
        System.out.println("Cantidad de vocales     : " + cvocal);
        System.out.println("Cantidad de consonantes : " + cconsonante);
        System.out.println("Cantidad de otros       : " + cotro);
    }
}
