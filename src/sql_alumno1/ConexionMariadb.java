package sql_alumno1;

import java.sql.*;

public class ConexionMariadb {

    private Connection conexion;

    public void setConexion(String bd, String usuario, String clave) {
        String url = "jdbc:mysql://localhost:3306/" + bd;
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConexion() {
        return this.conexion;
    }

}
