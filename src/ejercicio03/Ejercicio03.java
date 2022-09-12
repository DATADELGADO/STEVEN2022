package ejercicio03;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio03 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 1");
        System.out.println("---------");
        {
            String nra = "data/03/alumno.json";
            Alumno[] alumnosA = null;
            try {
                Reader r = Files.newBufferedReader(Paths.get(nra));
                Gson gson = new Gson();
                alumnosA = gson.fromJson(r, Alumno[].class);
                if (alumnosA != null) {
                    for (Alumno alumno : alumnosA) {
                        System.out.println(alumno);
                    }
                } else {
                    System.out.println("Objeto Vacio");
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio03.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
