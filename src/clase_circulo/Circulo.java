package clase_circulo;

public class Circulo {

    //(1) VARIABLES DE INSTANCIA
    private double radio;

    //(2) CONSTRUCTORES
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    //(3) METODOS SET Y GET
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //(4) MOSTRAR EL VALOR DE TODAS LAS VARIABLES DE INSTANCIA
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    //(5) METODOS OTROS
    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

}
