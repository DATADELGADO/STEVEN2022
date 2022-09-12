package clase_triangulo;

public class PrincipalTriangulo1 {

    public static void main(String[] args) {
        Triangulo t = new Triangulo(10, 20);
        System.out.println("Base          : " + t.getBase());
        System.out.println("Altura        : " + t.getAltura());
        System.out.println("Area Triangulo: " + t.area());
    }

}
