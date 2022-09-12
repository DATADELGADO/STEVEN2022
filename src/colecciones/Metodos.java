package colecciones;

public class Metodos {

    public static int numeroAleatoriaEnteroRango1_100() {
        return (int) (Math.random() * 100 + 1);
    }

    public static void mostrarCabecera() {
        System.out.printf("%10s%10s%10s%10s\n", "N", "BASE", "ALTURA", "AREA");
        System.out.printf("%10s%10s%10s%10s\n", "-", "----", "------", "----");
    }
}
