package sql_alumno1;

import java.sql.Connection;

public class PrincipalActualizarRegistroAlumno {

    public static void main(String[] args) {
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        if (conexion != null) {
            int x = OperacionesCrud.existeAlumno(12, conexion);
            Alumno alumno = new Alumno(12, "Susana", 0, 1.65);
            switch (x) {
                case 0:
                    System.out.println("NO EXISTE EL ALUMNO");break;
                case 1:
                    if (OperacionesCrud.actualizar(alumno, conexion) == 1) {
                        System.out.println("OK: ACTUALIZAR");
                    } else {
                        System.out.println("ERROR: ACTUALIZAR");
                    }
                    break;
                default: System.out.println("ERROR: EXISTE ALUMNO"); break;
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

}
