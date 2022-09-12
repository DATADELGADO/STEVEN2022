package json;

import java.util.List;

public class Alumno {

    private int codigo;
    private String nombre;
    private String paterno;
    private List<String> asignaturas_l;

    public Alumno() {
    }

    public Alumno(int codigo, String nombre, String paterno, List<String> asignaturas_l) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.paterno = paterno;
        this.asignaturas_l = asignaturas_l;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public List<String> getAsignaturas_l() {
        return asignaturas_l;
    }

    public void setAsignaturas_l(List<String> asignaturas_l) {
        this.asignaturas_l = asignaturas_l;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", paterno=" + paterno + ", asignaturas_l=" + asignaturas_l + '}';
    }

}
