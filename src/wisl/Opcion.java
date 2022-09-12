package wisl;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Opcion {

    public static void opcion1() {
        System.out.println("1. CONVERTIR UN OBJETO JAVA EN UN OBJETO JSON");
        System.out.println("---------------------------------------------");
        List cursos_l = Arrays.asList("Física", "Matemática");
        Alumno alumno = new Alumno("A1", "Luis", 1.72, true, cursos_l);
        Gson gson = new Gson();
        String json = gson.toJson(alumno);
        System.out.println(json);

    }

    public static void opcion2() {
        System.out.println("2. CONVERTIR UNA LISTA DE OBJETOS JAVA EN UNA LISTA DE OBJETOS JSON");
        System.out.println("-------------------------------------------------------------------");
        List cursos1_l = Arrays.asList("Física", "Matemática");
        List cursos2_l = Arrays.asList("Física");
        List cursos3_l = Arrays.asList();

        List alumnos_l = Arrays.asList(
                new Alumno("A1", "Luis", 1.72, true, cursos1_l),
                new Alumno("A2", "Miguel", 1.73, true, cursos2_l),
                new Alumno("A3", "Carlos", 1.74, false, cursos3_l)
        );

        Gson gson = new Gson();
        String json = gson.toJson(alumnos_l);
        System.out.println(json);
    }

    public static void opcion3() {
        System.out.println("3. CREAR UN ARCHIVO JSON");
        System.out.println("------------------------");
        List<Color> colores_l = Arrays.asList(
                new Color("rojo", "#f00"),
                new Color("verde", "#0f0"),
                new Color("azul", "#00f"),
                new Color("cyan", "#0ff"),
                new Color("magenta", "#f0f"),
                new Color("amarillo", "#ff0"),
                new Color("negro", "#000")
        );
        Colores color_l = new Colores(colores_l);

        Gson gson = new Gson();
        String json = gson.toJson(color_l);
        System.out.println(json);
        String nra = "datos/colores.json";
        if (escribirArchivoJson(json, nra) == true) {
            System.out.println("ESCRITURA CORRECTA");
        } else {
            System.out.println("ESCRITURA INCORRECTA");
        }

    }

    public static void opcion4() {

    }

    public static void opcion5() {

    }

    public static void opcion6() {

    }

    public static void opcion7() {

    }

    public static void opcion8() {

    }

    public static void opcion9() {

    }

    public static void opcion10() {

    }

    public static boolean escribirArchivoJson(String json, String nra) {
        boolean bandera = true;
        File f;
        FileWriter fw;
        BufferedWriter bw;

        try {
            f = new File(nra);
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            bw.write(json + "\n");
            bw.flush();
        } catch (IOException e) {
            System.out.println("ERROR");
            bandera = false;
        }
        return bandera;
    }
}
