package ejercicios_archivo_texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import sql_alumno3.Entrada;

public class Ejercicio4 {

    public static void main(String[] args) {

        String rutaNombreArchivo = Entrada.entradaRutaNombreArchivo("Ingrese la ruta y nombre del archivo? ");
        //C:\Users\RYZEN\Downloads\archivo.txt

        File f;
        FileReader fr;
        BufferedReader br;

        String linea = "";

        String er = "[aeiouáéíóú]";
        String er1 = "[qwrtypsdfghjklñmnbvcxz]";
        int[] con = new int[2];
        try {
            f = new File(rutaNombreArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    String letra = String.valueOf(linea.charAt(i)).toLowerCase();
                    if (letra.matches(er)) {
                        con[0]++;
                    }
                    if (letra.matches(er1)) {
                        con[1]++;
                    }
                }
            }
            System.out.println("VOCALES: " + con[0]);
            System.out.println("CONSONANTES: " + con[1]);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
