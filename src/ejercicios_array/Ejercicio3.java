package ejercicios_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        String[] nombres_a = {"Cesar", "Miguel", "Gerson", "Sylvia", "Vanessa","Arturo","Maria"};
        List<String> nombres_l = (List<String>) Arrays.asList(nombres_a);
        List<String> nombres_al = new ArrayList<>(nombres_l);
        Collections.sort(nombres_al);
        for(String nombre: nombres_al) {
            System.out.println(nombre);
        }
    }

}
