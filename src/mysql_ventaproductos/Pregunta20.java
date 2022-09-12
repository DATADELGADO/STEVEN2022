package mysql_ventaproductos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pregunta20 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ventaproductos";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            String query = "INSERT INTO PROVEEDOR(NOMBRE,NIF,DIRECCION) VALUES(?,?,?)";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, "Luis");
            ps.setString(2, "55541255g");
            ps.setString(3, "direccion 11");
            ps.executeUpdate();
            System.out.println("OK");

        } catch (SQLException ex) {
            ex.getMessage();
        }
        
        System.out.println("CONTINUA CON EL PROGRAMA");
    }

}
