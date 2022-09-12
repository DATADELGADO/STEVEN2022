package ejercicios_archivo_texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import sql_alumno3.Entrada;

public class Ejercicio2 {

    public static void main(String[] args) {
       String rutaNombreArchivo = Entrada.entradaRutaNombreArchivo("Ingrese la ruta y nombre del archivo? ");
        //C:\Users\RYZEN\Downloads\archivo.txt

        File f;
        FileReader fr;
        BufferedReader br;

        String linea = "";

        String er = "\\s*";//Un enter = cadena de ceros espacios
        
        int cont = 0;
        String[] c = null;
        try {
            f = new File(rutaNombreArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
            while((linea = br.readLine()) != null) {
               c = linea.split(" ");
               System.out.println("Tamaño: " + c.length);
               for(int i=0; i<c.length; i++) {
                   if(!c[i].trim().matches(er)) {
                       System.out.println(c[i]);
                       cont++;
                   }
               }
               c = null;
            }
            System.out.println("Cantidad Palabras: " + cont);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
