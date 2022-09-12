package coleccion_map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class P_HashMap_2 {

    public static void main(String[] args) {
        Map<Integer, Alumno> map = new TreeMap<Integer, Alumno>();
        map.put(1, new Alumno(1, "Luis", 1.72));
        map.put(2, new Alumno(2, "Miguel", 1.73));
        map.put(3, new Alumno(3, "Carlos", 1.74));
        Set<Integer> alumnosLista = map.keySet(); 
        System.out.println(alumnosLista);
        for (Integer clave : alumnosLista) {//Recorriendo la lista
            Alumno alumno = map.get(clave);
            System.out.println(alumno);
            if(alumno.getNombre().equalsIgnoreCase("Carlos")) {
                System.out.println(alumno.getEstatura());
            }
        }
    }

}
