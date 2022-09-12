package coleccion_alumno;

import java.util.ArrayList;
import java.util.List;

public class Metodos {

    public static String nombreAleatorio() {
        String[] nombre = {"Luis", "Miguel", "Carmen", "Carlos", "Arturo"};
        int aleatorio = (int) (Math.random() * 5);
        return nombre[aleatorio];
    }

    public static double estaturaAleatorio() {
        double[] estatura = {1.65, 1.66, 1.67, 1.68, 1.69, 1.70, 1.72, 1.72, 1.73};
        int aleatorio = (int) (Math.random() * 9);
        return estatura[aleatorio];
    }

    public static int edadAleatorio() {
        int aleatorio = (int) (Math.random() * 31 + 15);
        int edad = aleatorio;
        return edad;
    }

    public static List<Alumno> llenarYrecupearArrayList() {
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        //LLENAR LA COLECCION
        for (int i = 0; i < 200; i++) {
            Alumno a = new Alumno((i + 1), nombreAleatorio(), estaturaAleatorio(), edadAleatorio());
            alumnos_al.add(a);
        }
        return alumnos_al;
    }

    public static void mostrarArrayList(List<Alumno> alumnos_al) {
        System.out.printf("%14s  %-14s%9s%14s%17s\n", "IDALUMNO", "NOMBRE", "ESTATURA", "EDAD", "ESTADO EDAD");
        System.out.printf("%14s  %-14s%9s%14s%17s\n", "--------", "------", "--------", "----", "-----------");

        for (int i = 0; i < 200; i++) {
            Alumno a = alumnos_al.get(i);
            System.out.printf("%14d  %-14s%9.2f%14d%17s\n", a.getIdAlumno(), a.getNombre(), a.getEstatura(), a.getEdad(), a.estadoEdad());
        }
    }

}
