package expresion_regular;

import java.util.Scanner;

public class ExpresionRegular4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8);
        String s;
        String er = "[\u00F1]+";
        do {
            System.out.print("Ingrese cadena? ");
            s = sc.next();
            if (s.matches(er)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } while (true);
    }

}
