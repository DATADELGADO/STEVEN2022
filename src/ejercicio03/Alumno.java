package ejercicio03;

import java.util.List;

public class Alumno {

    private int codigo;
    private String nombre;
    private String paterno;
    private List<String> asignaturas_al;

    public Alumno() {
    }

    public Alumno(int codigo, String nombre, String paterno, List<String> asignaturas_al) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.paterno = paterno;
        this.asignaturas_al = asignaturas_al;
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

    public List<String> getAsignaturas_al() {
        return asignaturas_al;
    }

    public void setAsignaturas_al(List<String> asignaturas_al) {
        this.asignaturas_al = asignaturas_al;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", paterno=" + paterno + ", asignaturas_al=" + asignaturas_al + '}';
    }

}
