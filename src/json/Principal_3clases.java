package json;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Principal_3clases {

    public static void main(String[] args) {
        String ruta = "datos/alumno2.json";
        //String ruta = "datos/alumno2.json";

        Alumno2[] alumno_v = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(ruta));
            Gson gson = new Gson();
            alumno_v = gson.fromJson(r, Alumno2[].class);
            if (alumno_v != null) {
                int cont = 1;
                Alumno2.cabecera2();
                for (Alumno2 alumno : alumno_v) {
                    //if (cont == 1) {
                    /*
                        List<Asignatura> asig = alumno.getAsignaturas_l();
                        for (Asignatura a : asig) {
                            List<Nota> not = a.getNotas();
                            for (Nota nota : not) {
                                System.out.println(nota.getExamen());
                            }
                        }
                     */
                    //System.out.println(alumno

                    alumno.imprimir2();
                    // }
                   // cont = cont + 1;
                }

            } else {
                System.out.println("NO HAY REGISTROS");
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }

}
