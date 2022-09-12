package json;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Principal2 {

    public static void main(String[] args) {
        String ruta = "datos/alumno1.json";
        Alumno1[] alumnos_v = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(ruta));
            Gson gson = new Gson();
            alumnos_v = gson.fromJson(r, Alumno1[].class);
            int con = 1;
            if (alumnos_v != null) {
                Alumno1.cabecera();
                for (Alumno1 alumno : alumnos_v) {

                    alumno.imprimir1();

                }
            } else {
                System.out.println("VECTOR VACIO");
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }

}
