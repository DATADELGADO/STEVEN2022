package condicional_multiple;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día de la semana en número? ");
        int dia = sc.nextInt();
        String cadena = "";
        switch (dia) {
            case 1:
                cadena = "Lunes";
                break;
            case 2:
                cadena = "Martes";
                break;
            case 3:
                cadena = "Miercoles";
                break;
            case 4:
                cadena = "Jueves";
                break;
            case 5:
                cadena = "Viernes";
                break;
            case 6:
                cadena = "Sabado";
                break;
            case 7:
                cadena = "Domingo";
                break;
            default:
                System.out.println("ENTRADA INCORRECTA");
        }
        if (dia >= 1 && dia <= 7) {
            System.out.println("Día: " + cadena);
        }

    }

}
