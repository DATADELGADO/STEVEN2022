package vector;

import java.util.Scanner;

public class Vector2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        //CREAR UN VECTOR DE N ENTEROS PERO DEFINIDO POR TECLADO
        System.out.print("Ingrese el tamaño del vector"); n = sc.nextInt();
        int[] v = new int[n], x = new int[n];
        
        int[] x1; //Array 1 dimensión = vector
        int[][] x2; //Array 2 dimensiones = matriz
     
        //LLENAR EL VECTOR
        for (int i = 0; i < v.length; i++) {
            v[i] = i+1;
        }
        //MOSTRAR EL VECTOR
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

}
