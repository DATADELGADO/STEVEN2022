package matriz;

import java.util.Scanner;

public class Matriz7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar número de asteriscos que tendra el lado de un cuadrado? ");
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    x = j - 1;
                    for (int k = 0; k < x; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("X");
                    y = z - j;
                    for (int l = 1; l <= y; l++) {
                        System.out.print(" ");
                    }
                    System.out.print("X");
                    break;
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
