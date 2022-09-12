package modelo;

public class Aficionado {

    private int idAficionado;
    private String nombre;
    private String[] clubs;

    public Aficionado() {
    }

    public Aficionado(int idAficionado, String nombre, String[] clubs) {
        this.idAficionado = idAficionado;
        this.nombre = nombre;
        this.clubs = clubs;
    }

    public int getIdAficionado() {
        return idAficionado;
    }

    public void setIdAficionado(int idAficionado) {
        this.idAficionado = idAficionado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getClubs() {
        return clubs;
    }

    public void setClubs(String[] clubs) {
        this.clubs = clubs;
    }

    @Override
    public String toString() {
        return "Aficionado{" + "idAficionado=" + idAficionado + ", nombre=" + nombre + ", clubs=" + clubs + '}';
    }

}
