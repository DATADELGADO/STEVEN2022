package clase_triangulo;

public class Triangulo {

    //(1)VARIABLES DE INSTANCIAS
    private double base;
    private double altura;

    //(2)CONSTRUCTORES
    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //(3)METODOS GET Y SET
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //(4)MOSTRAR LOS VALORES DE LOS ATRIBUTOS
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    //(5)OTROS METODOS
    public double area() {
        return this.base * this.altura / 2;
    }

}
