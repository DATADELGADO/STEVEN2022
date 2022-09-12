package calculo;

import java.util.Scanner;

public class CalculoAreaPerimetroCirculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Perimetro: 2 * Math.PI * r
        //Area     : Math.PI * Math.pow(r,2)
        double r, a, p;
        System.out.print("Ingrese radio? ");
        r = sc.nextDouble();
        a = Math.PI * Math.pow(r, 2); //Area
        p = Math.PI * 2 * r; //Perimetro
        System.out.println("Area     : " + ((int) (a * 100)) / (double) 100 + " cm2");
        System.out.println("Perimetro: " + ((int) (p * 100)) / (double) 100 + " cm");
    }
}
