package autor_libro;

public class Autor {

    //(1) VARIABLES DE INSTANCIAS
    private int idAutor;
    private String nombre;
    private String paterno;
    private int edad;

    //(2) CONSTRUCTORES
    public Autor() {
    }

    public Autor(int idAutor, String nombre, String paterno, int edad) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.paterno = paterno;
        this.edad = edad;
    }

    //(3) METODOS GET Y SET
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //(4) METODO MOSTRAR LAS VARIABLES DE INSTANCIAS
    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", nombre=" + nombre + ", paterno=" + paterno + ", edad=" + edad + '}';
    }

    public static void cabecera() {
        System.out.printf("%-8s  %-15s%-15s%8s\n", "IDAUTOR", "NOMBRE", "PATERNO", "EDAD");
        System.out.printf("%-8s  %-15s%-15s%8s\n", "-------", "------", "-------", "----");
    }

    public void imprimir() {
        System.out.printf("%-8d  %-15s%-15s%8d\n", idAutor, nombre, paterno, edad);
    }
}
