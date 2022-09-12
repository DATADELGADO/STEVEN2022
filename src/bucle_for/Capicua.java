package bucle_for;

import java.util.Scanner;

public class Capicua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ca, s = "";
        System.out.println("ingrese la cadena de texto");
        ca = sc.nextLine(); //HOLA    ALOH

        for (int i = ca.length() - 1; i >= 0; i--) {
            s = s + ca.charAt(i);
        }
        if (ca.equals(s)) {
            System.out.println("es capicua");
        } else {
            System.out.println("no es capicua");
        }
        System.out.println(s + "    " + ca);
    }
}
