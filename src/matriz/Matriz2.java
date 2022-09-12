package matriz;

public class Matriz2 {

    public static void main(String[] args) {
        System.out.println("FORMA 1");
        System.out.println("=======");
        {
            //Declarar una matriz de cadenas de tamaño 3x2 (filas x columnas)
            String[][] m = new String[3][2]; //3x2 = 6 elementos
            //Llenar una matriz manualmente
            m[0][0] = "Luis";
            m[0][1] = "Miguel";
            m[1][0] = "Carmen";
            m[1][1] = "María";
            m[2][0] = "Jose";
            m[2][1] = "Arturo";
            //Recorrer una matriz para mostrarlo por pantalla
            for (int f = 0; f < m.length; f++) {
                for (int c = 0; c < m[0].length; c++) {
                    System.out.printf("(%d,%d)=%-10s", f, c, m[f][c]);
                }
                System.out.println();
            }
            //Mostrar el número de filas y columnas de una matriz
            System.out.println("Número filas   : " + m.length);
            System.out.println("Número columnas: " + m[2].length);
        }

        System.out.println("FORMA 2");
        System.out.println("=======");
        {
            //Declarar y llenar una matriz de enteros de tamaño 3x2 (filas x columnas)
            String[][] m = {{"Luis", "Miguel"},
            {"Carmen", "María"},
            {"Jose", "Arturo"}};
            //Recorrer una matriz para mostrarlo por pantalla
            for (int f = 0; f < m.length; f++) {
                for (int c = 0; c < m[0].length; c++) {
                    System.out.printf("(%d,%d)=%-10s", f, c, m[f][c]);
                }
                System.out.println();
            }
            //Mostrar el número de filas y columnas de una matriz
            System.out.println("Número filas   : " + m.length);
            System.out.println("Número columnas: " + m[2].length);
        }
    }
}
