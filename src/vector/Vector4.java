package vector;

import java.util.Scanner;

public class Vector4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese tamaño del vector? "); n = sc.nextInt();
        int[] x = new int[n]; //0 1 2 3 .. n
        System.out.println("Longitud: " + x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Ingrese un valor? ");
            x[i] = sc.nextInt();
            System.out.println(x[i]);
        }
    }

}
