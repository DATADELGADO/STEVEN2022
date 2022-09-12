package ejercicios_array;

import libreria.Entrada;

public class Ejercicio6 {

    public static void main(String[] args) {

        int cantidadCalles = Entrada.entradaNumeroEntero("Ingrese cantidad de calles? ");
        int[][] matrizCantidadPortales = new int[cantidadCalles][];
        String[] calle = new String[cantidadCalles];
        int[] portal = new int[cantidadCalles];
        for (int i = 0; i < cantidadCalles; i++) {
            String nombreCalle = Entrada.entradaCadena("Ingrese nombre de la calle? ");
            int cantidadPortales = Entrada.entradaNumeroEntero("Ingrese la cantidad de portales? ");
            calle[i] = nombreCalle;
            portal[i] = cantidadPortales;
            matrizCantidadPortales[i] = new int[cantidadPortales];
            for (int j = 0; j < cantidadPortales; j++) {
                matrizCantidadPortales[i][j] = Entrada.entradaNumeroEntero("Ingrese cantidad habitantes del portal? ");
            }
        }

        for (int i = 0; i < cantidadCalles; i++) {
            System.out.print(calle[i] + "  " + portal[i] + "  ");
            for (int j = 0; j < portal[i]; j++) {
                System.out.print(matrizCantidadPortales[i][j] + ",");
            }
            System.out.println();
        }

    }
}

/*
            Calle Portales  Habitantes Junin  3         10,20,15
Cuba   5         11,23,14,12,10

String[] calle
        int[] portales

String
    }
 */
