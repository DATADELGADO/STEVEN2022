package wisl;

import java.util.Scanner;

public class Entrada {
       public static String cadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String cadena = sc.nextLine();
        return cadena;
    } 
}
