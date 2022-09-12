package ejercicios_array;

import java.util.ArrayList;
import java.util.List;
import sql_alumno3.Entrada;

public class Ejercicio6_2 {

    public static void main(String[] args) {
        List<Ejercicio6_2_Clase> objetos_al = new ArrayList<>();
        int[] hab = null;
        Ejercicio6_2_Clase objeto = null;

        int cantidadCalles = Entrada.entradaNumeroEntero("Ingrese cantidad calles? ");

        for (int i = 0; i < cantidadCalles; i++) {
            String calle = Entrada.entradaCadena("Ingrese nombre calle? ");
            int portales = Entrada.entradaNumeroEntero("Ingrse cantidad portales? ");
            hab = new int[portales];
            for (int j = 0; j < portales; j++) {
                hab[j] = Entrada.entradaNumeroEntero("Ingrese cantidad habitantes del portal? ");
            }
            objeto = new Ejercicio6_2_Clase(calle, portales, hab);
            objetos_al.add(objeto);
        }
        int total = 0;
        Ejercicio6_2_Clase.cabecera();
        for (int i = 0; i < objetos_al.size(); i++) {
            objeto = objetos_al.get(i);
            System.out.printf("%-10s  %10d  %17s  %22d\n", objeto.getCalle(), objeto.getPortales(), objeto.obtenerNumeroHabitantesCadaCalleConcatenado(), objeto.obtenerTotalHabitantesCalle());
            total = total + objeto.obtenerTotalHabitantesCalle();
        }
        System.out.println("\nTotal Habitantes: " + total);

    }

}
