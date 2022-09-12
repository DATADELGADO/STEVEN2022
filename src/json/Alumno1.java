package json;

import java.util.List;

public class Alumno1 {

    private int codigo;
    private String nombre;
    private String paterno;
    private List<Curso> asignaturas_l;

    public Alumno1() {
    }

    public Alumno1(int codigo, String nombre, String paterno, List<Curso> asignaturas_l) {
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

    public List<Curso> getAsignaturas_l() {
        return asignaturas_l;
    }

    public void setAsignaturas_l(List<Curso> asignaturas_l) {
        this.asignaturas_l = asignaturas_l;
    }

    @Override
    public String toString() {
        return "Alumno1{" + "codigo=" + codigo + ", nombre=" + nombre + ", paterno=" + paterno + ", asignaturas_l=" + asignaturas_l + '}';
    }

    public static void cabecera() {
        System.out.printf("%-6s %-10s  %-10s  %-40s\n", "CODIGO", "NOMBRE", "PATERNO", "CURSOS");
        System.out.printf("%-6s %-10s  %-10s  %-40s\n", "------", "------", "-------", "------");

    }

    public void imprimir() {
        System.out.printf("%6d %-10s  %-10s  %-40s\n", this.codigo, this.nombre, this.paterno, this.asignaturas_l);
    }

    public void imprimir1() {
        System.out.printf("%6d %-10s  %-10s  %-40s\n", this.codigo, this.nombre, this.paterno, getListaCadenaCursos());
    }

    public String getListaCadenaCursos() {
        String cadena = "";
        for (Curso curso : asignaturas_l) {
            cadena = cadena + " " + curso.getNombre();
        }
        return cadena;
    }
}
