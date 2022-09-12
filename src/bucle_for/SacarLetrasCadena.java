package bucle_for;

import java.util.Scanner;

public class SacarLetrasCadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Ingrese cadena? ");
        cadena = sc.nextLine(); //HOLA  0123   3210     4-1
        System.out.println("Tamaño: " + cadena.length());
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }

    }

}
