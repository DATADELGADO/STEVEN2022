package coleccion_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Principal1 {

    public static void main(String[] args) {
        HashMap<Integer, String> frutas_hm = new HashMap<Integer, String>();//Creating HashMap    
        frutas_hm.put(1, "Mango");  //Put elements in Map  
        frutas_hm.put(2, "Apple");
        frutas_hm.put(3, "Banana");
        frutas_hm.put(4, "Grapes");

        System.out.println("RECORRER LA COLECCION HASHMAP");
        for (Map.Entry m : frutas_hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
