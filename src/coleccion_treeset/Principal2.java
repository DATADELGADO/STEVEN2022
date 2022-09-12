package coleccion_treeset;

import java.util.TreeSet;

public class Principal2 {

    public static void main(String[] args) {
        //Generar 300 números aleatorios entre [100,1000]  1000-99=901
        //Mostrar los números distintos generados
        System.out.println(aleatorio());
        TreeSet<Integer> numeros_ts = new TreeSet<Integer>();
        for(int i=0; i<300; i++) {
            numeros_ts.add(aleatorio());
        }
        int c = 0;
        for(Integer x: numeros_ts) {
            System.out.println("("+  (++c)  +")=" + x);
        }
        

    }
    
    public static int aleatorio() {
        return (int)(Math.random()*901 + 100);
    }

}
