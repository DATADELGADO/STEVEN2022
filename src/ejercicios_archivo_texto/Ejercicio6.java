package ejercicios_archivo_texto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import sql_alumno3.Entrada;

public class Ejercicio6 {

    public static void main(String[] args) {

        String rutaNombreArchivo = Entrada.entradaRutaNombreArchivo("Ingrese la ruta y nombre del archivo? ");
        //C:\Users\RYZEN\Downloads\archivo.txt

        File f;
        FileReader fr;
        BufferedReader br;

        String linea = "";

        String er = "[aeiouáéíóú]";

        int[] c = new int[5];

        try {
            f = new File(rutaNombreArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    String letra = String.valueOf(linea.charAt(i)).toLowerCase();
                    switch (letra) {
                        case "a":
                        case "á":
                            c[0] = c[0] + 1;
                            break;
                        case "e":
                        case "é":
                            c[1] = c[1] + 1;
                            break;
                        case "i":
                        case "í":
                            c[2] = c[2] + 1;
                            break;
                        case "o":
                        case "ó":
                            c[3] = c[3] + 1;
                            break;
                        case "u":
                        case "ú":
                            c[4] = c[4] + 1;
                            break;
                    }
                }
            }
            int suma = c[0] + c[1] + c[2] + c[3] + c[4];
            String cadena = "A: " + c[0] + "\n" + "E: " + c[1] + "\n" + "I: " + c[2] + "\n" + "O: " + c[3] + "\n" + "U: " + c[4] + "\n" + "TOTAL VOCALES: " + suma + "\n";
            crearArchivo(cadena);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void crearArchivo(String cadena) {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File("datos/vocales.txt");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(cadena);
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
