package ejercicios;

public class Ejercicio11_2 {
    
    private double c1;
    private double c2;

    public Ejercicio11_2() {
    }

    public Ejercicio11_2(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "Ejercicio11_2{" + "c1=" + c1 + ", c2=" + c2 + '}';
    }
    
    public double hipotenusa() {
        return Math.sqrt(Math.pow(this.c1,2)+Math.pow(this.c2,2));
    }
    /*
    public void mostrar() {
        System.out.println("Hipotenusa: " + hipotenusa());
    }
    
    public void motrarTodo() {
        double c = Math.sqrt(Math.pow(this.c1,2)+Math.pow(this.c2,2));
        System.out.println("Hipotenusa: " + c);
    }
*/


}
