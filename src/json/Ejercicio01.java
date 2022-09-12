package json;

import com.google.gson.Gson;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class Ejercicio01 {

    public static void main(String[] args) {
        String nra = "datos/usuario.json";
        Map<?,?> usuarioM = null;
        try {
            Reader r = Files.newBufferedReader(Paths.get(nra));
            Gson gson = new Gson();
            usuarioM = gson.fromJson(r, Map.class);
            if (usuarioM != null) {
                //Double objeto = (Double)usuarioM.get("edad");
                //double valor = (double)objeto.doubleValue();
                
                //int valor = (int)Double.parseDouble(objeto.toString());
                //System.out.println(usuarioM);
            
                Object objeto = usuarioM.get("edad");
                int valor = (int)Double.parseDouble(objeto.toString());
         
                //int valor = (int) (usuarioM.get("edad"));
                if (valor > 40) {
                    System.out.println("Es un cuarenton");
                } else {
                    System.out.println("No llega a los cuarenta");
                }
            } else {
                System.out.println("Objeto Vacio");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }

    }

}
