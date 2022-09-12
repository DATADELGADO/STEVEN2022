package sql_alumno1;


public class Alumno {
    
    private int idAlumno;
    private String nombre;
    private int edad;
    private double estatura;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, int edad, double estatura) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {//método de instancia
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
    
    public static void cabecera() { //método de clase
        System.out.printf("%8s  %-10s  %5s  %8s\n","IDALUMNO","NOMBRE","EDAD","ESTATURA");
        System.out.printf("%8s  %-10s  %5s  %8s\n","--------","------","----","--------");
    }
    
    public void imprimir() {//método de instancia
        System.out.printf("%8d  %-10s  %5d  %8.2f\n",idAlumno,nombre,edad,estatura);
    }

}
