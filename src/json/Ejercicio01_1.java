package json;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio01_1 {

    public static void main(String[] args) {
        String nra = "datos/usuario.json";
        Map<?, ?> coleccion_map = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(nra));
            Gson gson = new Gson();
            coleccion_map = gson.fromJson(r, Map.class);
            if (coleccion_map != null) {
                List<String> nombres_al = new ArrayList<String>();
                
                Set<String> coleccion_claves = new TreeSet<String>();
                coleccion_claves = (Set<String>)coleccion_map.keySet();
                System.out.println(coleccion_claves);
                for (String clave : coleccion_claves) {
                    Object objeto = coleccion_map.get(clave);
                    if (clave.equalsIgnoreCase("idUsuario")) {
                        int c = (int) Double.parseDouble(objeto.toString());
                        System.out.println(clave + " : " + c);
                    } else {
                        System.out.println(clave + " : " + objeto);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR");

        }

    }
}
