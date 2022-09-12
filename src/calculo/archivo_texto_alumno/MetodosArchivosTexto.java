package archivo_texto_alumno;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MetodosArchivosTexto {
    
    public static List<Alumno> leer(String nombreRutaArchivo) {
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        File f;
        FileReader fr;
        BufferedReader br;
        String fila;
        try{
            f = new File(nombreRutaArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((fila = br.readLine()) != null) {
                String[] c = fila.split(";");
                Alumno a = new Alumno(Integer.parseInt(c[0]),
                                      c[1],Integer.parseInt(c[2]),
                                      Double.parseDouble(c[3]));
                alumnos_al.add(a);
            }
        }catch(IOException e) {
            System.out.println("ERROR EN LA LECTURA DEL ARCHIVO");
        }
        return alumnos_al;
    }
}
