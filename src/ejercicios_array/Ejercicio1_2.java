package ejercicios_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1_2 {

    public static void main(String[] args) {
        List<String> turnos_al = new ArrayList<String>(Arrays.asList("M", "M", "M", "M", "T", "T", "T", "T"));
        List<String> nombre_al = new ArrayList<String>(Arrays.asList("Luis", "Miguel", "Carlos", "Carmen", "Arturo", "Gerson", "Delly", "María"));
        List<Double> sueldos_al = new ArrayList<Double>(Arrays.asList(1000.0, 900.0, 800.0, 1210.0, 1000.0, 920.0, 850.0, 1500.0));
        double sueldom = 0;
        double sueldot = 0;
        for (int i = 0; i < turnos_al.size(); i++) {
            String t = turnos_al.get(i);
            double s = sueldos_al.get(i);
            if (t.equalsIgnoreCase("M")) {
                sueldom = sueldom + s;
            }
            if (t.equalsIgnoreCase("T")) {
                sueldot = sueldot + s;
            }
        }
        System.out.println("Gasto Sueldo Mañana: " + sueldom + "\u20ac");
        System.out.println("Gasto Sueldo Tarde : " + sueldot + "\u20ac");
    }

}
