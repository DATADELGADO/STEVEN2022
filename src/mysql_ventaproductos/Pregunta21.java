package mysql_ventaproductos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pregunta21 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ventaproductos";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            String query1 = "INSERT INTO PROVEEDOR(NOMBRE,NIF,DIRECCION) VALUES(?,?,?)";
            String query2 = "SELECT * FROM PROVEEDOR";
            String query3 = "ALTER TABLE PROVEEDOR ADD UNIQUE (NIF);";
            String query4 = "DELETE FROM PROVEEDOR";
            String query5 = "ALTER TABLE PROVEEDOR AUTO_INCREMENT = 1";

            PreparedStatement ps = null;

            ps = conexion.prepareStatement(query4);
            ps.executeUpdate();

            ps = conexion.prepareStatement(query5);
            ps.executeUpdate();

            ps = conexion.prepareStatement(query1);
            ps.setString(1, "steven_1");
            ps.setString(2, "55541255h");
            ps.setString(3, "direccion 13");
            ps.executeUpdate();
            System.out.println("OK se inserto el registro");

            ps = conexion.prepareStatement(query3);
            ps.executeUpdate();

            ps = conexion.prepareStatement(query1);
            ps.setString(1, "steven_2");
            ps.setString(2, "55541249h");
            ps.setString(3, "direccion 14");
            ps.executeUpdate();
            System.out.println("OK se inserto el registro");

            ps = conexion.prepareStatement(query2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.printf("%-12d    %-7s    %-4s    %-10s\n", rs.getInt(1), rs.getString("nombre"), rs.getString("nif"), rs.getString(4));
            }

            System.out.println("OK");
        } catch (SQLException ex) {
            System.out.println("error:" + ex.getMessage());
        }

        System.out.println("CONTINUA CON EL PROGRAMA");
    }

}
