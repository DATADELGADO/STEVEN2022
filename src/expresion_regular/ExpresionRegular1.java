package expresion_regular;

import java.util.Scanner;

public class ExpresionRegular1 {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String sdigito;
        String er = "[0-9]";
        do {
            System.out.print("Ingrese cadena? ");
            sdigito = sc.next().trim();
            if (sdigito.matches(er)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } while (true);
    }
}
