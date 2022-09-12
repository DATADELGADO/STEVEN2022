package modelo;

import java.sql.*;

public class ConexionPostgresql {

    private Connection conexion;

    public ConexionPostgresql() {
    }

    public void setConexion(boolean flag) {
        try {
            if (flag) {
                String url = "jdbc:postgresql://localhost:5433/campusfp";
                String usuario = "postgres";
                String clave = "12345678";

                Class.forName("org.postgresql.Driver");
                conexion = (Connection) DriverManager.getConnection(url, usuario, clave);
            } else {
                conexion.close();
                conexion = null;
            }
        } catch (Exception e) {
            conexion = null;
        }
    }

    public Connection getConexion() {
        return conexion;
    }

}
