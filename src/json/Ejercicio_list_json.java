package json;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio_list_json {

    public static void main(String[] args) {
        String ruta = "datos/alumno1.json";
        Alumno1[] alumnos_v = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(ruta));
            Gson gson = new Gson();
            alumnos_v = gson.fromJson(r, Alumno1[].class);
            int con = 1;
            if (alumnos_v != null) {

                /*
                for (Alumno1 alumno : alumnos_v) {
                    System.out.println("numero " + con);

                    List<Curso> otro = alumno.getAsignaturas_l();
                    for (Curso x : otro) {
                        System.out.println("idCurso: " + x.getIdCurso() + "      nombre: " + x.getNombre());
                    }
                    con++;
                }
                 */
                Alumno1.cabecera();
                for (Alumno1 alumno : alumnos_v) {
                    alumno.imprimir();
                }

            } else {
                System.out.println("VECTOR VACIO");
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }

}
