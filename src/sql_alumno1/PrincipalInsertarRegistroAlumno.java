package sql_alumno1;

import java.sql.Connection;

public class PrincipalInsertarRegistroAlumno {

    public static void main(String[] args) {

        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        if (conexion != null) {
            Alumno a = new Alumno(0, "Marianela", 19, 1.75);
            if (OperacionesCrud.insertar(a, conexion) != -1) {
                System.out.println("OK: INSERTAR REGISTRO ALUMNO");
            } else {
                System.out.println("ERROR: INSERTAR REGISTRO ALUMNO");
            }
        }else {
                System.out.println("ERROR: CONEXION");
        }

    }

}
