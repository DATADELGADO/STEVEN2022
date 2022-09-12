package ejercicios_archivo_texto;

import java.util.Scanner;

public class Probando {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sn1, sn2;
        double n1, n2, r;
        String er = "\\s*";//* 0 a mas espacios
        boolean correcto;
        do {
            System.out.print("Ingrese cadena ?");
            sn1 = sc.nextLine();
            correcto = sn1.matches(er);
            if (correcto == false) {
                System.out.println("Cadena no valido");
            }
        } while (correcto == false);
        System.out.println("Cdena valida");
    }

}
