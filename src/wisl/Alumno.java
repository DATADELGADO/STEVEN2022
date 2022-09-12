package wisl;

import java.util.List;

public class Alumno {

    private String idAlumno;
    private String nombre;
    private double estatura;
    private boolean soltero;
    private List<String> cursos;

    public Alumno() {
    }

    public Alumno(String idAlumno, String nombre, double estatura, boolean soltero, List<String> cursos) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.estatura = estatura;
        this.soltero = soltero;
        this.cursos = cursos;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean isSoltero() {
        return soltero;
    }

    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", estatura=" + estatura + ", soltero=" + soltero + ", cursos=" + cursos + '}';
    }
    
    
    
}
