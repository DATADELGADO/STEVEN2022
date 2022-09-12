package sql_alumno1;

import java.sql.Connection;

public class PrincipalEliminarRegistroAlumnoPorIdentificador {

    public static void main(String[] args) {
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        if (conexion != null) {
            int idAlumno = 9;
            int x = OperacionesCrud.existeAlumno(idAlumno, conexion);
            switch (x) {
                case 0:
                    System.out.println("NO EXISTE EL ALUMNO");
                    break;
                case 1:
                    if (OperacionesCrud.eliminar(idAlumno, conexion) == 1) {
                        System.out.println("OK: ELIMINAR REGISTRO ALUMNO POR IDENTIFICADOR");
                    } else {
                        System.out.println("ERROR: ELIMINAR REGISTRO ALUMNO POR IDENTIFICADOR");
                    }
                    break;
                default:
                    System.out.println("ERROR: EXISTE ALUMNO");
                    break;
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

}
