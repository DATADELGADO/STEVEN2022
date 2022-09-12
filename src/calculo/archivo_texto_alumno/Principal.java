package archivo_texto_alumno;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
       List<Alumno> alumnos_al = MetodosArchivosTexto.leer("datos/alumno.csv");
       for(int i=0; i<alumnos_al.size(); i++) {
           Alumno a = alumnos_al.get(i);
           System.out.println(a);
       }

    }

}
