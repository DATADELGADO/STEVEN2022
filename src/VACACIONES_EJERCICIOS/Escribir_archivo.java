package VACACIONES_EJERCICIOS;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Escribir_archivo {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("datos/vacaciones.txt", true));
            bw.write(libreria.MisMetodos_1.entradaGeneralDevolucionString("escriba texto?: ")+"\n");

            //bw.write("hola como estas");
            bw.flush();
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
