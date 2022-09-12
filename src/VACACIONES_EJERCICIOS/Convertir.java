package VACACIONES_EJERCICIOS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Convertir {

    public static void main(String[] args) {
        /*
        //String cadena = libreria.MisMetodos_1.entradaGeneralDevolucionString("ingrese cadena");
        System.out.println("ingrese cadena?");
        Scanner sc = new Scanner(System.in);
        
        String cadena = sc.nextLine();
        char[] array = cadena.toCharArray();
        for (char a : array) {
            System.out.print(a);
        }
         */
 /*
        String[] turnos_a = {"M", "M", "M", "M", "T", "T", "T", "T"};
        String[] nombres_a = {"Luis", "Miguel", "Carlos", "Carmen", "Arturo", "Gerson", "Delly", "María"};
        Double[] sueldos_a = {1000.0, 900.0, 800.0, 1210.0, 1000.0, 920.0, 850.0, 1500.0};

        List<String> turnos_al = new ArrayList<String>();
        List<String> nombres_al = new ArrayList<String>();
        List<Double> sueldos_al = new ArrayList<Double>();

        for (int i = 0; i < turnos_a.length; i++) {
            turnos_al.add(turnos_a[i]);
            nombres_al.add(nombres_a[i]);
            sueldos_al.add(sueldos_a[i]);

        }
        for (String a : turnos_al) {
            System.out.println(a);
        }
        for (String a : nombres_al) {
            System.out.println(a);
        }
        for (Double a : sueldos_al) {
            System.out.println(a);
        }
         */

        String[] turnos_a = {"M", "M", "M", "M", "T", "T", "T", "T"};
        String[] nombres_a = {"Luis", "Miguel", "Carlos", "Carmen", "Arturo", "Gerson", "Delly", "María"};
        Double[] sueldos_a = {1000.0, 900.0, 800.0, 1210.0, 1000.0, 920.0, 850.0, 1500.0};

        List<String> turnos_l = (List<String>) Arrays.asList(turnos_a);
        List<String> turnos_al = new ArrayList<String>(turnos_l);
        for (String a : turnos_al) {
            System.out.println(a);
        }

    }

}
