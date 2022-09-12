package ejercicios_array;

import java.io.*;

public class Ejercicio1_1 {

    public static void main(String[] args) {
        File f;
        FileReader fr;
        BufferedReader br;

        String linea = "";
        double sueldom = 0;
        double sueldot = 0;

        try {
            f = new File("datos/sueldos.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                String[] c = linea.split(",");
                if (c[0].equalsIgnoreCase("M")) {
                    sueldom = sueldom + Double.parseDouble(c[2]);
                }
                if (c[0].equalsIgnoreCase("T")) {
                    sueldot = sueldot + Double.parseDouble(c[2]);
                }
            }
            System.out.println("Gasto Sueldo Mañana: " + sueldom + "\u20ac");
            System.out.println("Gasto Sueldo Tarde : " + sueldot + "\u20ac");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
