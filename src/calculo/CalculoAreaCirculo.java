package calculo;

import java.util.Scanner;

public class CalculoAreaCirculo {

    public static void main(String[] args) {
        //Calcular el área de un circulo
        Scanner sc = new Scanner(System.in);
        double a, r;
        System.out.print("Ingresar el radio?");
        r = sc.nextDouble();
        a = Math.PI * Math.pow(r, 2);//r*r
        System.out.println("Area del circulo: " + a);
        System.out.println("Area del circulo: " + ((int)(a*100))/(double)100);
    }
}

/*
Algoritmo Ejemplo72
	//Calcular el area de un circulo
	Escribir Sin Saltar "Ingrese radio? "; Leer r
	a <- PI * r^2
	Escribir "Area del circulo: ", a
	Escribir "Area circulo: ", TRUNC(a*100)/100
	Escribir "Area circulo: ", TRUNC(a*1000)/1000
FinAlgoritmo
 */
