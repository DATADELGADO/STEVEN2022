package libreria;

import java.util.Scanner;

public class MisMetodos {

    public static double entrada() {
        Scanner sc = new Scanner(System.in);
        String er = "([0-9]+\\.[0-9]+)||[0-9]+";
        String scenti;
        double dcenti;
        boolean correcto;
        do {
            System.out.print("Ingrese grados centigrados? ");
            scenti = sc.next();
            correcto = scenti.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        dcenti = Double.parseDouble(scenti);
        return dcenti;
    }

    public static double convertirCF(double c) {
        double f = 0;
        f = (c * 1.8) + 32;
        return f;
    }

    public static int retornaGradoCentigradoAleatorio1_100() { //[1,100]  
        return (int) (Math.random() * 100 + 1);
    }

    public static double[] retornaVectorF(int[] vectorC) {
        double[] vectorF = new double[vectorC.length];
        for (int i = 0; i < vectorC.length; i++) {
            vectorF[i] = convertirCF(vectorC[i]);
        }
        return vectorF;
    }

    public static double[][] retornaMatrizF(int[][] matrizC) {
        double[][] matrizF = new double[matrizC.length][matrizC[0].length];
        for (int f = 0; f < matrizC.length; f++) {
            for (int c = 0; c < matrizC[0].length; c++) {
                matrizF[f][c] = convertirCF(matrizC[f][c]);
            }
        }
        return matrizF;
    }

    public static double sumar3(double a, double b) {
        return a + b;
    }

    public static void sumar21(double n1, double n2) {
        System.out.println("Suma: " + (n1 + n2));
    }
}
