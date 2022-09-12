package condicional_multiple;

import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese día del mes? ");
        int mes = sc.nextInt();
        int numero = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numero = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numero = 30;
                break;
            case 2:
                numero = 28;
                break;
            default:
                System.out.println("ENTRADA INCORRECTA");
                break;
        }
        if (mes >= 1 && mes<= 12) {
            System.out.println("Catidad de días: " + numero);
        }
    }
}


