package condicional_binario;

import java.util.Scanner;

public class ConvertirCentigradosFarenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        double c, f;
        System.out.print("Qué conversión desea realizar 1-CF, 2-FC?");
        r = sc.nextInt();
        
        /*
        if (r == 1) {
            System.out.println("Convertir CF");
            System.out.println("Ingrese C? ");
            c = sc.nextDouble();
            f = (9/5.0) * c + 32;
            System.out.println("F: " + Math.round(f*100.0)/100.0);
        }
*/
        if (r == 2) {
            System.out.println("Converitr FC");
            System.out.println("Ingrese F? ");
            f = sc.nextDouble();
            c = (f-32) / 1.8;
            System.out.println("C: " + Math.round(c*100.0)/100.0);
        }
    }

}

/*
Algoritmo Ejemplo64
	//C = Grados Centrigados
	//F = Grados Farenheit
	Escribir Sin Saltar "Qué conversion desea realizar 1-CF, 2-FC";Leer r
	Si r = 1 Entonces
		Escribir Sin Saltar "Ingrese C? "; Leer c
		f <- (9/5) * c + 32
		Escribir "C a F: ",f
	FinSi
	
	Si r = 2 Entonces
		Escribir Sin Saltar "Ingrese F? "; Leer f
		c <- (f-32) / 1.8
		Escribir "F a C: ",c
	FinSi
FinAlgoritmo 
 */
