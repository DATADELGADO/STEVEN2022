package coleccion_treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal1 {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");

        for (Map.Entry m : map.entrySet()) {
            //System.out.println(m.getKey() + " " + m.getValue());
            System.out.println(m.getValue());
        }
        System.out.println("***********\n\n");
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(100, "Amit");
        map1.put(102, "Ravi");
        map1.put(101, "Vijay");
        map1.put(103, "Rahul");

        for (Map.Entry m : map1.entrySet()) {
            //System.out.println(m.getKey() + " " + m.getValue());
            System.out.println(m.getValue());
        }
    }

}
