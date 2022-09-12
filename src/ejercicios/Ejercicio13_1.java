package ejercicios;

public class Ejercicio13_1 {

    private int cantidadCajas;
    private int unidadesxCaja;
    private double precioUnidad;

    public Ejercicio13_1() {
    }

    public Ejercicio13_1(int cantidadCajas, int unidadesxCaja, double precioUnidad) {
        this.cantidadCajas = cantidadCajas;
        this.unidadesxCaja = unidadesxCaja;
        this.precioUnidad = precioUnidad;
    }

    public int getCantidadCajas() {
        return cantidadCajas;
    }

    public void setCantidadCajas(int cantidadCajas) {
        this.cantidadCajas = cantidadCajas;
    }

    public int getUnidadesxCaja() {
        return unidadesxCaja;
    }

    public void setUnidadesxCaja(int unidadesxCaja) {
        this.unidadesxCaja = unidadesxCaja;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    @Override
    public String toString() {
        return "Ejercicio13_1{" + "cantidadCajas=" + cantidadCajas + ", unidadesxCaja=" + unidadesxCaja + ", precioUnidad=" + precioUnidad + '}';
    }

    public double[] getCalculoAtributos() {
        double[] v = new double[2];
        v[0] = this.cantidadCajas * this.unidadesxCaja * this.precioUnidad;  //Importe por cada producto
        v[1] = v[0] * 1.21; //Total
        return v;
    }
    
    public Retorno getCalculoAtributos1() {
        double importe = this.cantidadCajas * this.unidadesxCaja * this.precioUnidad;  //Importe por cada producto
        double total = importe * 1.21; //Total
        Retorno r = new Retorno(importe,total);
        return r;
    }

}
