package ejercicios_array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejercicio2_1 {

    public static void main(String[] args) {
        File f;
        FileReader fr;
        BufferedReader br;

        String linea = "";

        int sumam = 0;
        int sumaf = 0;

        double mediam = 0.0;
        double mediaf = 0.0;

        try {
            //f = new File("C:/Users/RYZEN/Documents/cursos.csv");
            f = new File("datos/cursos.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
                    //RAM   HDD
            while ((linea = br.readLine()) != null) {
                String[] c = linea.split("\\s+");//Luis;M;8
                if (c[1].equalsIgnoreCase("M")) {
                    sumam = sumam + Integer.parseInt(c[2]);
                }
                if (c[1].equalsIgnoreCase("F")) {
                    sumaf = sumaf + Integer.parseInt(c[2]);
                }
            }
            mediam = sumam / 5;
            mediaf = sumaf / 5;

            System.out.println("FORMA 1");
            if (mediam > mediaf) {
                System.out.println("Matemática tiene el promedio mayor: " + mediam);
            } else {
                if (mediam < mediaf) {
                    System.out.println("Física tiene el promedio mayor: " + mediaf);
                } else {
                    System.out.println("Matemática y Física tiene el mismo promedio: " + mediam);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
