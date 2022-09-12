package src;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacionesCrud {

    /**
     * Método para crear la tabla alumno
     */
    public boolean crearTabla(Connection conexion) {
        boolean bandera = true;
        try {
            Statement sql = conexion.createStatement();
            sql.executeUpdate("create table Alumno ("
                    + "id               VARCHAR(15) , "
                    + "nombresApellidos VARCHAR(100), "
                    + "carrera          VARCHAR(50) , "
                    + "direccion        VARCHAR(120), "
                    + "mail             VARCHAR(70) , "
                    + "edad             INTEGER     , "
                    + "telefono         INTEGER       "
                    + ");"
            );
            sql.close();
        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }

    /**
     * Método para verificar si exite la tabla alumno
     */
    public boolean existeTabla(Connection conexion) {
        boolean bandera = true;
        try {
            Statement sql = conexion.createStatement();
            ResultSet rs = sql.executeQuery("select * from Alumno");
            rs.close();
            sql.close();
        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }
}
