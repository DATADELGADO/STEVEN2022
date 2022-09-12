package ejercicios_archivo_texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import sql_alumno3.Entrada;

public class Ejercicio5 {

    public static void main(String[] args) {
        String rutaNombreArchivo = Entrada.entradaRutaNombreArchivo("Ingrese la ruta y nombre del archivo? ");
        //C:\Users\RYZEN\Downloads\archivo.txt

        File f;
        FileReader fr;
        BufferedReader br;

        String linea = "";
        String er = "[a-zñ\\sáéíóú]";
        int con = 0;
        try {
            f = new File(rutaNombreArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    String letra = String.valueOf(linea.charAt(i)).toLowerCase();
                    if (!letra.matches(er)) {
                        con++;
                    }
                }
            }
            System.out.println("Cantidad : " + con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
