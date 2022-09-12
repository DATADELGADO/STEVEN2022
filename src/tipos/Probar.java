package tipos;

import java.util.Scanner;

public class Probar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        String sER = "[0-9]+";
        do {
            System.out.print("Introduzca su edad? ");
            s = sc.next();
        } while (!(s.matches(sER) && Integer.parseInt(s) > 0 && Integer.parseInt(s) <= 150));
        if (Integer.parseInt(s) >= 18) {
            System.out.print("Mayor de edad");
        } else {
            System.out.print("Menor de edad");
        }
        sc.close();
    }
}
