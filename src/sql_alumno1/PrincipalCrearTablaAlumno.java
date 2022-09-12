package sql_alumno1;

import java.sql.Connection;

public class PrincipalCrearTablaAlumno {

    public static void main(String[] args) {
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        if (conexion != null) {
            if (OperacionesCrud.crearTablaAlumno(conexion) != -1) {
                System.out.println("OK: CREAR TABLA ALUMNO");
            } else {
                System.out.println("ERROR: CREAR TABLA ALUMNO");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }

    }

}
