package coleccion_alumno;

public class Alumno {
   //(1) VARIABLES DE INSTANCIA
   private int idAlumno;//PK
   private String nombre;
   private double estatura;
   private int edad;
          
   //(2) CONSTRUCTORES

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, double estatura, int edad) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
    }
   
    //(3) METODOS SET Y GET

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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //(4) MOSTRAR TODOS LOS ATRIBUTOS

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", estatura=" + estatura + ", edad=" + edad + '}';
    }
    
    //(5) METODOS OTROS
    public String estadoEdad() {
        if(this.edad>=18) {
           return "Mayor de edad";
        }else {
           return "Menor de edad";
        }
    }
   
}
