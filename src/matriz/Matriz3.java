package matriz;

import java.io.IOException;

public class Matriz3 {

    public static void main(String[] args) {
        System.out.println("FORMA 1");
        System.out.println("=======");
        {
            int[][] x = {{1}, {1, 2, 3}, {1, 2, 3, 4, 5}};
            for (int f = 0; f < x.length; f++) {
                for (int c = 0; c < x[f].length; c++) {
                    System.out.print(x[f][c] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("FORMA 2");
        System.out.println("=======");
        {
            int[][] x;
            x = new int[3][]; //La Matriz tiene 3 filas
            x[0] = new int[1];//La fila 0 tiene 1 columna
            x[0][0] = 1;
            x[1] = new int[3];//La fila 1 tiene 3 columnas
            x[1][0] = 1;
            x[1][1] = 2;
            x[1][2] = 3;
            x[2] = new int[5];//La fila 2 tiene 5 columnas
            x[2][0] = 1;
            x[2][1] = 2;
            x[2][2] = 3;
            x[2][3] = 4;
            x[2][4] = 5;
            for (int f = 0; f < x.length; f++) {
                for (int c = 0; c < x[f].length; c++) {
                    System.out.print(x[f][c] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }
}
