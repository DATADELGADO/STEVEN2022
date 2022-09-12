package ejercicios_array;

import ejercicios.Entrada;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[f][c] = Entrada.entradaNumeroEntero("Ingrese número entero? ");
            }
        }
        for (int[] x : matriz) {
            for (int n : x) {
                System.out.print(n + "   ");
            }
            System.out.println();
        }
    }

}
