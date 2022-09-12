package colecciones;

public class Coleccion1 {

    public static void main(String[] args) {
        final Long inicio = System.currentTimeMillis();
        Circulo[] circulos_v = new Circulo[2000];

        for (int i = 0; i < circulos_v.length; i++) {
            Circulo c = new Circulo(i);
            circulos_v[i] = c;
        }

        Metodos.mostrarCabecera();
        Circulo c = null;
        for (int i = 0; i < circulos_v.length; i++) {
            c = circulos_v[i];
            System.out.printf("%10d%10.2f%10.2f%10.2f\n", (i + 1), c.getRadio(), c.perimetro(), c.area());
        }
        final Long fin = System.currentTimeMillis();
        System.out.println("Duración en milisegundos: " + (fin - inicio));

    }

}
