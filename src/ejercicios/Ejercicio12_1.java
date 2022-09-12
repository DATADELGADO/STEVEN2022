package ejercicios;

public class Ejercicio12_1 {
    
    private int cantidadSegundos;

    public Ejercicio12_1() {
    }

    public Ejercicio12_1(int cantidadSegundos) {
        this.cantidadSegundos = cantidadSegundos;
    }

    public int getCantidadSegundos() {
        return cantidadSegundos;
    }

    public void setCantidadSegundos(int cantidadSegundos) {
        this.cantidadSegundos = cantidadSegundos;
    }

    @Override
    public String toString() {
        return "Ejercicio12_1{" + "cantidadSegundos=" + cantidadSegundos + '}';
    }
    
    public int[] getCalculoAtributos() {
        int[] v = new int[3];
        v[0] = this.cantidadSegundos / 3600;
        v[1] = (this.cantidadSegundos % 3600) / 60;
        //v[2] = this.cantidadSegundos % 60;
        v[2] = (this.cantidadSegundos % 3600) % 60;;
        return v;
    }
}
