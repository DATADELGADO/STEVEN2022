package ejercicios_array;

import sql_alumno3.Entrada;

public class Ejercicio6_1 {

    public static void main(String[] args) {
       int cantidadCalles = Entrada.entradaNumeroEntero("Ingrese cantidad calles? ");
       int[][] matrizCantidadPortales = new int[cantidadCalles][];//Matriz dinámica en columnas
       String[] calle = new String[cantidadCalles];
       int[] portal = new int[cantidadCalles];
       //LLENAR
       for(int i=0; i<cantidadCalles; i++) {
           calle[i] = Entrada.entradaCadena("Ingrese nombre calle? ");
           portal[i] = Entrada.entradaNumeroEntero("Ingrse cantidad portales? ");
           matrizCantidadPortales[i] = new int[portal[i]];
           for(int j=0; j<portal[i]; j++) {
               matrizCantidadPortales[i][j] = Entrada.entradaNumeroEntero("Ingrese cantidad habitantes del portal? ");
           }
       }
       //MOSTRAR
       for(int i=0; i<cantidadCalles; i++) {
           System.out.print(calle[i] + "  " + portal[i] + "  "  );
           for(int j=0; j<portal[i]; j++) {
               System.out.print(matrizCantidadPortales[i][j] + ",");
           }
           System.out.println();
       }
    }

}
