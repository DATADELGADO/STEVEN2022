package json;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class Ejercicio_Objeto_Json {

    public static void main(String[] args) {
        String ruta = "datos/alumno.json";
        Alumno[] alumnos_v = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(ruta));
            Gson gson = new Gson();
            alumnos_v = gson.fromJson(r, Alumno[].class);
            if (alumnos_v != null) {
                /*
                for (int i = 0; i < alumnos_v.length; i++) {
                    System.out.println(alumnos_v[i]);
                }
                 */
                for (Alumno alumno : alumnos_v) {
                    System.out.println(alumno);
                }
            } else {
                System.out.println("VECTOR VACIO");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
