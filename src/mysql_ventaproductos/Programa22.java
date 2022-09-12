package mysql_ventaproductos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa22 {

    public static void main(String[] args) {
        String query1 = "select * from proveedor where nif = ?";
        String query2 = "INSERT INTO PROVEEDOR(NOMBRE,NIF,DIRECCION) VALUES('nombre',?,'direccion')";
        Connection conexion = obtenerConexion();
        if (conexion != null) {
            try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                boolean bandera = false;
                do {
                    bandera = false;
                    String nif = libreria.MisMetodos_1.entradaGeneralDevolucionString("ingrese el nif: ");
                    ps = conexion.prepareStatement(query1);
                    ps.setString(1, nif);
                    rs = ps.executeQuery();
                    if (rs.next() == true) {
                        bandera = true;
                        System.out.println("EL NIF ES EXISTENTE");
                    }
                    if (bandera == false) {
                        ps = conexion.prepareStatement(query2);
                        ps.setString(1, nif);
                        ps.executeUpdate();
                        System.out.println("se inserto el registro");
                        bandera = false;
                    }

                } while (bandera == true);

            } catch (SQLException ex) {
                System.out.println("error: " + ex);
            }

        }else{
            System.out.println("error conexion");
        }
    }

    public static Connection obtenerConexion() {
        String url = "jdbc:mysql://localhost:3306/ventaproductos";

        try {
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            return conexion;
        } catch (SQLException ex) {
            System.out.println("error: "+ ex);
            return null;
        }
    }
}
