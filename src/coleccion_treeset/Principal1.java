package coleccion_treeset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Principal1 {

    public static void main(String[] args) {

        TreeSet<String> nombres_ts = new TreeSet<String>();
        nombres_ts.add("Luis");
        nombres_ts.add("Miguel");
        nombres_ts.add("Luis");
        nombres_ts.add("Carmen");

        for (String nombre : nombres_ts) {
            System.out.println(nombre);
        }
        
        List<String> nombres_al = new ArrayList<String>(nombres_ts);
        
        //Generar 300 números aleatorios entre [100,1000]
        //Mostrar los números distintos generados
        
        
        
        
        
        /*

        List<String> nombres_al = new ArrayList<String>();
        nombres_al.addAll(nombres_ts);

        for (String nombre : nombres_al) {
            System.out.println(nombre);
        }

        //PROGRAMACION FUNCIONAL
        nombres_al.forEach(nombre -> {
            System.out.println(nombre);
        });

        for (int i = 0; i < nombres_al.size(); i++) {
            String nombre = nombres_al.get(i);
            System.out.println(nombre);
        }

        System.out.println("*********TREESET");
        for (String nombre : nombres_ts) {
            System.out.println(nombre);
        }

        System.out.println("*********TREESET");
        Iterator<String> x = nombres_ts.iterator();
        while (x.hasNext()) {
            System.out.println(x.next());
        }
*/

    }

}
