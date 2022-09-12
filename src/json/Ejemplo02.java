package json;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

public class Ejemplo02 {

    public static void main(String[] args) {
        String nra = "datos/diccionario.json";
        Map<?, ?> coleccion_map = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(nra));
            Gson gson = new Gson();
            coleccion_map = gson.fromJson(r, Map.class);
            Set<String> listas_claves = (Set<String>) coleccion_map.keySet();
            System.out.printf("%-12s %-12s\n", "INGLES", "ESPAÑOL");
            System.out.printf("%-12s %-12s\n", "------", "-------");

            for (String clave : listas_claves) {
                System.out.printf("%-12s %-12s\n", clave, coleccion_map.get(clave));

            }

        } catch (IOException e) {

        }
    }
}
