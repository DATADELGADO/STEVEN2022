package condicional_binario;

import java.util.Scanner;

public class ValidarNota {

    public static void main(String[] args) {
        double nota;
        Scanner sc = new Scanner(System.in);//Entrada Teclado
        System.out.print("Ingrese nota?");
        nota = sc.nextDouble();
        if (nota >= 0 && nota < 5) {
            System.out.println("Desaprobado");
        } else if (nota >= 5 && nota <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Nota no valida");
        }
    }
    /*
        if (nota >= 0 && nota < 5) {
            System.out.println("Desaprobado");
        } else {
            if (nota >= 5 && nota <= 10) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Nota no valida");
            }
        }
     */
}

/*
0 Desaprobado 5 Aprobado 10

Si no esta en el rango "Nota no valida"
*/
