package coleccion_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class P_HashMap {

    public static void main(String[] args) {
        System.out.println("PRIMER EJEMPLO");
        {
            Map<Integer, String> map = new TreeMap<Integer, String>();
            map.put(1, "Casillas");
            map.put(15, "Ramos");
            map.put(3, "Pique");
            map.put(5, "Puyol");
            map.put(11, "Capdevila");
            map.put(14, "Xabi Alonso");
            map.put(16, "Busquets");
            map.put(8, "Xavi Hernandez");
            map.put(18, "Pedrito");
            map.put(6, "Iniesta");
            map.put(7, "Villa");
            Set<Integer> numeroCamisetaLista = map.keySet();
            System.out.println(numeroCamisetaLista);
            for (Integer clave : numeroCamisetaLista) {//Recorriendo la lista
                String valor = map.get(clave);
                System.out.println("Clave: " + clave + ", valor: " + valor);
            }
        }

        System.out.println("SEGUNDO EJEMPLO");
        {
            Map<String, String> map = new TreeMap<String, String>();
            map.put("Monday", "Lunes");
            map.put("Tuesday", "Martes");
            map.put("Wednesday", "Miercoles");
            Set<String> palabraInglesLista = map.keySet();
            System.out.println(palabraInglesLista);
            for (String clave : palabraInglesLista) {//Recorriendo la lista
                String valor = map.get(clave);
                System.out.println("Clave: " + clave + ", valor: " + valor);
            }
        }

    }

}
/*
/*
        // Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();//Clave
            int x = key.intValue();
            x = key + key;
            //String x = (String) it.next().toString();//Clave
            String valor = map.get(key);//Valor
            System.out.println("Clave: " + key + " -> Valor: " + valor + "x " + x);
        }
 */
 /* PROCESAR UN DATO NUMERICO
                Object objeto = usuarioM.get("edad");
                int valor = (int)Double.parseDouble(objeto.toString());
 */
