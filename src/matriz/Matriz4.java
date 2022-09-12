package matriz;

import java.io.IOException;

public class Matriz4 {

    public static void main(String[] args) {
        for (int f = 1; f <= 10; f++) {
            for (int c = 1; c <= f; c++) {
                if (c == 1) {
                    for (int k = 1; k <= (10 - f); k++) {
                        System.out.print(" ");
                    }
                }

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }
}

/*
f=1    c<=1   c=1
f=2    c<=2   c=1,2
f=3    c<=3   c=1,2,3

1          *                  10-1= 9
2         * *                 10-2= 8
3        * * *
4
5
6
7
8
9
10

1, 2, 3, 4, ... 10
         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 

*/
