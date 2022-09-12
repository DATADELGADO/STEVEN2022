package ejercicios;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        /*
       List<Ejercicio15_2> x0;
       x0 = new ArrayList<Ejercicio15_2>();
       x0 = new LinkedList<Ejercicio15_2>();
       
       Set<Ejercicio15_2> x1;
       x1 = new HashSet<Ejercicio15_2>();
       x1 = new LinkedHashSet<Ejercicio15_2>();
        */
        Ejercicio11_2 objeto = new Ejercicio11_2(Entrada.entradaNumeroReal("Ingrese longitud cateto 1? "),
                                                 Entrada.entradaNumeroReal("Ingrese longitud cateto 2? "));
        
        System.out.println("Hipotenusa: " + objeto.hipotenusa());
      
    }

}
