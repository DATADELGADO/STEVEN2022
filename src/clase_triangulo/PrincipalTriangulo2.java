package clase_triangulo;

public class PrincipalTriangulo2 {

    public static void main(String[] args) {
        Triangulo[] v = new Triangulo[10];
        Metodos.mostrarCabecera();
        for (int i = 0; i < v.length; i++) {
            v[i] = new Triangulo(Metodos.numeroAleatoriaEnteroRango1_100(), Metodos.numeroAleatoriaEnteroRango1_100());
            System.out.printf("%10d%10.2f%10.2f%10.2f\n", (i + 1), v[i].getBase(), v[i].getAltura(), v[i].area());
        }
    }

}
