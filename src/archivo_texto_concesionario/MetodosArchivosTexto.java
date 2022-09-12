package archivo_texto_concesionario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MetodosArchivosTexto {

    public static List<Coche> leer(String nombreRutaArchivo) {
        List<Coche> coches_al = new ArrayList<Coche>();
        File f;
        FileReader fr;
        BufferedReader br;
        String fila;
        try {
            f = new File(nombreRutaArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int k = 0;
            while ((fila = br.readLine()) != null) {
                if (k != 0) {
                    String[] campo = fila.split(";");
                    Coche coche = new Coche(Integer.parseInt(campo[0]),
                            campo[1], campo[2],
                            Double.parseDouble(campo[3]));
                    coches_al.add(coche);
                }else {
                    //System.out.println(fila);
                }
                k++;
            }
        } catch (IOException e) {
            System.out.println("ERROR EN LA LECTURA DEL ARCHIVO");
        }
        return coches_al;
    }
}
