package expresion_regular;

import java.util.Scanner;

public class Probando1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"ISO-8859-1");//UTF-8
        String sdigito;
        String er = "java[\\s]*[8]";
        do {
            System.out.print("Ingrese cadena? ");
            sdigito = sc.nextLine().trim();
            if (sdigito.matches(er)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } while (true);
    }

}
