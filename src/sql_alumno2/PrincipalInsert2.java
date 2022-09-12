package sql_alumno2;

import sql_alumno3.Entrada;
import sql_alumno1.Alumno;
import sql_alumno1.OperacionesCrud;

public class PrincipalInsert2 {

    public static void main(String[] args) {
        String nombre = Entrada.entradaCadena("Ingrese nombre? ");
        int edad = Entrada.entradaNumeroEntero("Ingrese edad? ");
        double estatura = Entrada.entradaNumeroReal("Ingrese estatura? ");
        if(estatura >= 1.5 && estatura <= 1.7) {
            Alumno alumno = new Alumno(0,nombre,edad,estatura);
            if(OperacionesCrud.miconexion() != null) {
                if(OperacionesCrud.insertar(alumno, OperacionesCrud.miconexion()) != -1) {
                    System.out.println("OK: INSERTAR REGISTRO ALUMNO");
                }else {
                     System.out.println("ERROR: INSERTAR REGISTRO ALUMNO");
                }
            }else {
                System.out.println("NO HAY CONEXION");
            }
        }else {
            System.out.println("NO SE PUEDE INGRESAR PORQUE ESTATURA NO CUMPLE LA CONDICION"); 
        }
        
        
        
    }

}
