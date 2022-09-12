package VACACIONES_EJERCICIOS;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public static void imprimirCabecera() {
        System.out.printf("%-10s %-10s\n", "NOMBRE", "APELLIDO");
        System.out.printf("%-10s %-10s\n", "------", "--------");

    }

    public void imprimir() {
        System.out.printf("%-10s %-10s\n", this.nombre, this.apellido);
    }

}
