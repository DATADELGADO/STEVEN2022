package bucle_for;

import java.util.Scanner;

public class SacarLetrasCadenaOraciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Ingrese cadena? ");
        cadena = sc.nextLine(); //Oraciones
        System.out.println("Tamaño: " + cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i));
        }
    }

}
