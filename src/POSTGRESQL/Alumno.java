package POSTGRESQL;

import java.sql.Date;

public class Alumno {

    private int idAlumno;
    private String nombre;
    private String apellidos;
    private String grupo;
    private Date fecha_nacimiento;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, String apellidos, String grupo, Date fecha_nacimiento) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.grupo = grupo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos + ", grupo=" + grupo + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }

    public void imprimir() {
        System.out.printf("%10d     %-15s %-25s %-15s %-15s\n", this.idAlumno, this.nombre, this.apellidos, this.grupo, this.fecha_nacimiento);

    }
}
