package json;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

public class Practicando {

    public static void main(String[] args) {
        String ruta = "datos/usuarios_sistema.json";
        Map<?, ?> jugadores = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(ruta));
            Gson gson = new Gson();
            jugadores = gson.fromJson(r, Map.class);
            if (jugadores != null) {
                System.out.println(jugadores);
                Set<String> clave = (Set<String>) jugadores.keySet();
                System.out.println(clave);
                for (String v : clave) {
                    Object ob = v;
                    int nume = Integer.parseInt(v.toString());
                    Object objeto = jugadores.get(v);
                    String valor = objeto.toString();
                    System.out.println(nume + 3);
                    //System.out.println(v+ 3);

                    System.out.println(valor);
                }
            } else {
                System.out.println("no hay registros");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

}
