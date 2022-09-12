package expresion_regular;

import java.util.Scanner;

public class ER1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sn1, sn2;
        double n1, n2, r;
        String er = "[0-9]+\\.[0-9]+";//       "\\d+\\.\\d+"
        boolean correcto;
        do {
            System.out.print("Ingrese número real 1?");
            sn1 = sc.next();// 
            correcto = sn1.matches(er);//   "2.72"
            if (correcto == false) {//TRUE
                System.out.println("Número no valido");
            }
        } while (correcto == false);//false= sale, true = repite      TRUE
        do {
            System.out.print("Ingrese número real 2?");
            sn2 = sc.next();//234.34, 1.47, 0.45
            correcto = sn2.matches(er);//FALSE
            if (correcto==false) {//TRUE
                System.out.println("Número no valido");
            }
        } while (correcto==false);//false= sale, true = repite      TRUE 
        n1 = Double.parseDouble(sn1); //   "2.72"  2.72
        n2 = Double.parseDouble(sn2);
        r = n1 + n2;
        System.out.println("Suma: " + r);
    }

}
