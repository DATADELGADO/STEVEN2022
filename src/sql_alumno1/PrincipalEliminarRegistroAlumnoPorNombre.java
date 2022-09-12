package sql_alumno1;

import java.sql.Connection;

public class PrincipalEliminarRegistroAlumnoPorNombre {

    public static void main(String[] args) {
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        if (conexion != null) {
            String nombre = "Luis";
            int x = OperacionesCrud.eliminar(nombre, conexion);
            switch (x) {
                case 0:
                    System.out.println("NO EXISTE ALUMNO");
                    break;
                case -1:
                    System.out.println("ERROR: ELIMINAR ALUMNO");
                    break;
                default:
                    System.out.println("OK: ELIMINAR ALUMNO");
                    break;
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

}
