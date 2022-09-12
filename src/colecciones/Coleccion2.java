package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Coleccion2 {

    public static void main(String[] args) {
        final Long inicio = System.currentTimeMillis();
        List<Circulo> circulos_al = new ArrayList<Circulo>();

        for (int i = 0; i < 2000; i++) {
            Circulo c = new Circulo(i);
            circulos_al.add(c);
        }

        Metodos.mostrarCabecera();
        Circulo c = null;
        for (int i = 0; i < circulos_al.size(); i++) {
            c = circulos_al.get(i);
            System.out.printf("%10d%10.2f%10.2f%10.2f\n", (i + 1), c.getRadio(), c.perimetro(), c.area());
        }
        final Long fin = System.currentTimeMillis();
        System.out.println("Duración en milisegundos: " + (fin - inicio));
    }

}
