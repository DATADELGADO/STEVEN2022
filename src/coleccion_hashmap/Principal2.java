package coleccion_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Principal2 {

    public static void main(String[] args) {
        //GUARDAR UNA COLECCION DE OBJETOS CIRCULO EN UN HASHMAP DONDE CADA
        //OBJETO ESTE IDENTIFICADO POR UNA CLAVE.
        Circulo c = null;
        HashMap<Integer, Circulo> circulos_hm = new HashMap<Integer, Circulo>();//Creating HashMap    
        for(int i=0; i<200; i++) {
           c = new Circulo(i);
           circulos_hm.put((i+1), c);
        }
 
        System.out.println("RECORRER LA COLECCION HASHMAP");
        for (Map.Entry m : circulos_hm.entrySet()) {
            //c = (Circulo)m.getValue();
            System.out.println(m.getKey() + "  " + m.getValue());
        }
    }

}
