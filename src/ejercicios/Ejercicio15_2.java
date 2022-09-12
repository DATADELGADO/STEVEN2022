package ejercicios;

public class Ejercicio15_2 {

    private int cantidadPersonas;
    private double precioxkiloArroz;
    private double precioxkiloGamba;

    public Ejercicio15_2() {
    }

    public Ejercicio15_2(int cantidadPersonas, double precioxkiloArroz, double precioxkiloGamba) {
        this.cantidadPersonas = cantidadPersonas;
        this.precioxkiloArroz = precioxkiloArroz;
        this.precioxkiloGamba = precioxkiloGamba;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public double getPrecioxkiloArroz() {
        return precioxkiloArroz;
    }

    public void setPrecioxkiloArroz(double precioxkiloArroz) {
        this.precioxkiloArroz = precioxkiloArroz;
    }

    public double getPrecioxkiloGamba() {
        return precioxkiloGamba;
    }

    public void setPrecioxkiloGamba(double precioxkiloGamba) {
        this.precioxkiloGamba = precioxkiloGamba;
    }

    @Override
    public String toString() {
        return "Ejercicio15_2{" + "cantidadPersonas=" + cantidadPersonas + ", precioxkiloArroz=" + precioxkiloArroz + ", precioxkiloGamba=" + precioxkiloGamba + '}';
    }
    
    public double[] getCalculoAtributos() {
        double[] v = new double[4];
        v[0] = this.cantidadPersonas / 8.0; //kilosArroz
        v[1] = cantidadPersonas / 16.0;     //kilosGamba
        v[2] = v[0] * precioxkiloArroz;     //costoArroz
        v[3] = v[1] * precioxkiloGamba;     //costoGamba
        return v;
    }

}
