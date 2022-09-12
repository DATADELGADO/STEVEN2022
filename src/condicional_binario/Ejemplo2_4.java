package condicional_binario;

import java.util.Scanner;

public class Ejemplo2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo;
        System.out.println("Ingrese sueldo? ");
        sueldo = sc.nextDouble();
        if(sueldo < 1000) {
           sueldo = sueldo * 1.17;
        }else {
           sueldo = sueldo * 1.12; 
        }
        System.out.println("Sueldo: " + Math.round(sueldo*100.0)/100.0);
    }

}
