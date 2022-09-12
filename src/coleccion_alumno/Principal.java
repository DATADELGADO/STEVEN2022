package coleccion_alumno;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Alumno> alumnos_al = Metodos.llenarYrecupearArrayList();
        Metodos.mostrarArrayList(alumnos_al);
    }
}
