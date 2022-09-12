package json;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio_json_2 {

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
                    int codigo = alumno.getCodigo();
                    String nombre = alumno.getNombre();
                    String paterno = alumno.getPaterno();
                    List<String> asignaturas_l = alumno.getAsignaturas_l();
                    for (String valor : asignaturas_l) {
                        System.out.println(valor);
                    }
                }
            } else {
                System.out.println("VECTOR VACIO");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
