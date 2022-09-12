package VACACIONES_EJERCICIOS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Leer_archivo {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos/vacaciones.txt"));
            List<Persona> persona = new ArrayList<Persona>();
            //List<String> persona = new ArrayList<String>();
            String linea = "";
            while ((linea = br.readLine()) != null) {
                String[] cadena = linea.split(" ");
                persona.add(new Persona(cadena[0],cadena[1]));
            }
            /*
            for (String a : persona) {
                System.out.println(a);
            }
             */
            Persona.imprimirCabecera();
            for (Persona a : persona) {
                a.imprimir();
            }
        } catch (Exception ex) {
            Logger.getLogger(Leer_archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
