package paciente;

public class Paciente {

    //(1)VARIABLES DE INSTANCIAS (ATRIBUTOS)
    String dni;
    String nombre;
    String paterno;
    String materno;
    String telefono;
    String correo;
    String direccion;
    int edad;
    double estatura;
    boolean isCasado;
    char sexo;

    //(2)CONSTRUCTORES (SIRVEN PARA ASIGNARLE VALORES A LOS ATRIBUTOS)
    //CONSTRUCTOR CON TODOS LOS ATRIBUTOS
    public Paciente(String dni, String nombre, String paterno, String materno, String telefono, String correo, String direccion, int edad, double estatura, boolean isCasado, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.edad = edad;
        this.estatura = estatura;
        this.isCasado = isCasado;
        this.sexo = sexo;
    }

    //CONSTRUCTOR VACIO
    public Paciente() {
    }

    //CONSTRUCTOR CON SOLO LOS ATRIBUTOS DNI,NOMBRE,PATERNO,MATERNO
    public Paciente(String dni, String nombre, String paterno, String materno) {
        this.dni = dni;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }

    //(3)METODOS (GET Y SET)
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public boolean getIsCasado() {
        return isCasado;
    }

    public void setIsCasado(boolean isCasado) {
        this.isCasado = isCasado;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //METODO TOSTRING (MOSTRAR LOS VALORES DE TODOS LOS ATRIBUTOS)
    @Override //SOBREESCRIBIR = LO VUELVE A DEFINIR
    public String toString() {
        return "dni=" + dni + ", nombre=" + nombre + ", paterno=" + paterno + "\n, materno=" + materno + ", telefono=" + telefono + ", correo=" + correo + "\n, direccion=" + direccion + ", edad=" + edad + ", estatura=" + estatura + ", isCasado=" + isCasado + ", sexo=" + sexo;
    }

    public void mostrar() {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10d  %10.2f %-10s%-10s\n", this.dni, this.nombre, this.paterno, this.materno, this.telefono, this.correo, this.direccion, this.edad, this.estatura, this.isCasado, this.sexo);
    }

    //IMPLEMENTAR UN METODO PARA MOSTRAR SOLO LOS PACIENTES MAYORES DE EDAD
    public void mostrarMayoresEdad() {
        if (this.edad >= 18) {
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10d  %10.2f %-10s%-10s\n", this.dni, this.nombre, this.paterno, this.materno, this.telefono, this.correo, this.direccion, this.edad, this.estatura, this.isCasado, this.sexo);
        }
    }

    //IMPLEMENTAR UN METODO PARA MOSTRAR SOLO LOS PACIENTES QUE TENGAN LA ESTATURA MAYOR A 1.73
    public void mostrarEstaturaMayor173() {
        if (this.estatura >= 1.73) {
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10d  %10.2f %-10s%-10s\n", this.dni, this.nombre, this.paterno, this.materno, this.telefono, this.correo, this.direccion, this.edad, this.estatura, this.isCasado, this.sexo);
        }
    }
}
