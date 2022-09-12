package coleccion_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class P_HashMap_1 {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>();
        map.put("nombre", "Casillas");
        map.put("edad", "23");
        Object objeto = map.get("edad");
        int valor = Integer.parseInt(objeto.toString());
        if(valor > 18) {
            System.out.println("MAYOR DE EDAD");
        }else {
            System.out.println("MENOR DE EDAD");
        }
    }

}
