package calculo;

import java.util.Scanner; //Libreria

public class CalculoSuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, s;
        System.out.print("Ingresar el número 1?");
        n1 = sc.nextDouble();
        System.out.print("Ingresar el número 2?");
        n2 = sc.nextDouble();
        s = n1 + n2;
        System.out.println("El resultado es: " + s);
    }
}

/*
Algoritmo Ejemplo53
	Escribir Sin Saltar "Ingresar el número 1? "; Leer n1
	Escribir Sin Saltar "Ingresar el número 2? "; Leer n2
	s <- n1 + n2
	Escribir "El resultado es: ", s
FinAlgoritmo


 */
