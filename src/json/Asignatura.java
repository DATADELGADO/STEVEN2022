package json;

import java.util.List;

public class Asignatura {

    private String idCurso;
    private String nombre;
    private List<Nota> notas;

    public Asignatura() {
    }

    public Asignatura(String idCurso, String nombre, List<Nota> notas) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "idCurso=" + idCurso + ", nombre=" + nombre + ", notas=" + notas + '}';
    }

}
