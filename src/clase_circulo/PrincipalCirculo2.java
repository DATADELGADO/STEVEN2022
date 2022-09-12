package clase_circulo;

public class PrincipalCirculo2 {

    public static void main(String[] args) {
        Circulo[] v = new Circulo[10];
        Metodos.mostrarCabecera();
        for (int i = 0; i < v.length; i++) {
            v[i] = new Circulo(Metodos.numeroAleatoriaEnteroRango1_100());
            System.out.printf("%10d%10.2f%10.2f%10.2f\n", (i+1), v[i].getRadio(), v[i].perimetro(), v[i].area());

        }

    }

}
