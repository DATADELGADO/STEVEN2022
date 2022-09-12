package POSTGRESQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertTipoDatoJson {

    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/campusfp";
            Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
            PreparedStatement ps = null;
            ResultSet rs = null;
            //(1)
            String query1 = "DROP TABLE IF EXISTS venta;";
            ps = conexion.prepareStatement(query1);
            ps.execute();
            System.out.println("OK: DROP TABLE");

            //(2)
            String query2 = "create table venta (\n"
                    + "    idVenta              INT,\n"
                    + "    nombreVendedor       varchar(20),\n"
                    + "    documento            JSON,\n"
                    + "                         primary key (idVenta)   \n"
                    + ");";
            ps = conexion.prepareStatement(query2);
            ps.execute();
            System.out.println("OK: CREATE TABALE");
            /*
            //(3)
            String query3 = "insert into venta values(1,'Luis','{\"idProducto\":\"P1\", \"producto\":\"lapiz\",\"venta\":3000}');\n"
                    + "insert into venta values(2,'Miguel','{\"idProducto\":\"P1\", \"producto\":\"regla\",\"venta\":5000}');\n"
                    + "insert into venta values(3,'Carlos','{\"idProducto\":\"P1\", \"producto\":\"borrador\",\"venta\":7000}');";
            ps = conexion.prepareStatement(query3);
            ps.executeUpdate();
            System.out.println("OK: INSERT TABLE");
             */
            //(3)
            String[] registros = {
                "insert into venta values(1,'Luis','{\"idProducto\":\"P1\", \"producto\":\"lapiz\",\"venta\":3000}');",
                "insert into venta values(2,'Miguel','{\"idProducto\":\"P1\", \"producto\":\"regla\",\"venta\":5000}');",
                "insert into venta values(3,'Carlos','{\"idProducto\":\"P1\", \"producto\":\"borrador\",\"venta\":7000}');"
            };
            for (String query : registros) {
                ps = conexion.prepareStatement(query);
                ps.executeUpdate();
            }
            System.out.println("OK: ALL INSERT");

            //(4)
            String query4 = "SELECT * FROM venta";
            ps = conexion.prepareStatement(query4);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idVenta = rs.getInt(1);
                String nombre = rs.getString(2);
                String documento = rs.getString(3);
                System.out.printf("%5d  %-15s    %-30s\n", idVenta, nombre, documento);
            }
            
            //(5)
            String query5 = "SELECT idventa, nombrevendedor,documento->'venta' FROM venta";
            ps = conexion.prepareStatement(query5);
            rs = ps.executeQuery();
            int ventatotal = 0;
            while (rs.next()) {
                int idVenta = rs.getInt(1);
                String nombre = rs.getString(2);
                int montoVenta = rs.getInt(3);
                System.out.printf("%5d  %-15s    %15d\n", idVenta, nombre, montoVenta);
            ventatotal = ventatotal + montoVenta;
            }
            String x = String.valueOf(ventatotal); // para convertir de numero a cadena string
            System.out.println("TOTAL VENTA VENDEDORES: "+ ventatotal);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

}
