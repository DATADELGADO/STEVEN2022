package ejercicios;

public class Ejercicio17_3 {
    private int cantidadHoras;

    public Ejercicio17_3() {
    }

    public Ejercicio17_3(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    @Override
    public String toString() {
        return "Ejercicio17_3{" + "cantidadHoras=" + cantidadHoras + '}';
    }
    
    public int[] getSemanasDiasHoras() {
        int[] v = new int[3];
        
        int h = this.cantidadHoras;

        int semanas =  h / 168;
        int dias    = (h % 168) / 24;
        int horas   = (h % 24);

        v[0] = semanas;
        v[1] = dias;
        v[2] = horas;

        return v;
    }
}
