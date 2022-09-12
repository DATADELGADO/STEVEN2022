package ejercicios_archivo_texto;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import sql_alumno3.Entrada;

public class Ejercicio1 {

    public static void main(String[] args) {

        String rutaNombreArchivo = Entrada.entradaRutaNombreArchivo("Ingrese la ruta y nombre del archivo? ");
        //C:\Users\RYZEN\Downloads\archivo.txt

        File f;
        FileReader fr;
        BufferedReader br;

        String linea = "";

        String er = "[aeiouAEIOU]";

        int[] c = new int[5];

        try {
            f = new File(rutaNombreArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    String vocal = String.valueOf(linea.charAt(i)).toLowerCase();
                    if (vocal.matches(er)) {
                        switch (vocal) {
                            case "a":
                                c[0] = c[0] + 1;
                                break;
                            case "e":
                                c[1] = c[1] + 1;
                                break;
                            case "i":
                                c[2] = c[2] + 1;
                                break;
                            case "o":
                                c[3] = c[3] + 1;
                                break;
                            case "u":
                                c[4] = c[4] + 1;
                                break;
                        }
                    }
                }
            }
            System.out.println("A : " + c[0]);
            System.out.println("E : " + c[1]);
            System.out.println("I : " + c[2]);
            System.out.println("O : " + c[3]);
            System.out.println("U : " + c[4]);
            System.out.println("Total Vocales: " + (c[0]+c[1]+c[2]+c[3])+c[4]);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
