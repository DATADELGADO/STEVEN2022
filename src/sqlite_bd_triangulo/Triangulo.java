package sqlite_bd_triangulo;



public class Triangulo {

    private int idTriangulo;
    private double cateto1;
    private double cateto2;
    private double hipotenusa;

    public Triangulo() {
    }

    public Triangulo(int idTriangulo, double cateto1, double cateto2) {
        this.idTriangulo = idTriangulo;
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public int getIdTriangulo() {
        return idTriangulo;
    }

    public void setIdTriangulo(int idTriangulo) {
        this.idTriangulo = idTriangulo;
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    public double getHipotenusa() {
        return Math.sqrt(Math.pow(this.cateto1, 2) + Math.pow(this.cateto2, 2));
    }

    public void cuerpo() {
        System.out.printf("%12d %7.2f %7.2f %11.2f\n", idTriangulo, cateto1, cateto2, getHipotenusa());

    }

    public static void cabecera() {
        System.out.printf("%12s %7s %7s %11s\n", "IDTRIANGULO", "CATETO1", "CATETO2", "HIPOTENUSA");
        System.out.printf("%12s %7s %7s %11s\n", "-----------", "-------", "-------", "----------");

    }
}
