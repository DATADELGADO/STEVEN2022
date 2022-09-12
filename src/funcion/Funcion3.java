package funcion;

import libreria.MisMetodos;

public class Funcion3 {

    public static void main(String[] args) {

        int[][] matrizC = new int[3][4];

        //MATRIZ C
        for (int f = 0; f < matrizC.length; f++) {
            for (int c = 0; c < matrizC[0].length; c++) {
                matrizC[f][c] = MisMetodos.retornaGradoCentigradoAleatorio1_100();
                System.out.printf("%5d  ", matrizC[f][c]);
            }
            System.out.println();
        }

        System.out.println("MATRIZ F");
        //MATRIZ F
        double[][] matrizF = MisMetodos.retornaMatrizF(matrizC);

        for (int f = 0; f < matrizC.length; f++) {
            for (int c = 0; c < matrizC[0].length; c++) {
                System.out.printf("%10.2f    ",matrizF[f][c]);
            }
            System.out.println();
        }

    }

}
