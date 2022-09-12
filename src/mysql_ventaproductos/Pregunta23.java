package mysql_ventaproductos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pregunta23 {

    public static void main(String[] args) {
        String query1 = "alter table proveedor add escasado bit not null;";
        String query2 = "describe proveedor;";
        String query3 = "update proveedor set escasado = ? where idproveedor = ?;";
        String query4 = "select * from proveedor";
        String query5 = "ALTER TABLE PROVEEDOR DROP COLUMN ESCASADO";
        Connection conexion = Programa22.obtenerConexion();
        PreparedStatement ps = null;

        if (conexion != null) {
            try {
                ps = conexion.prepareStatement(query5);
                ps.executeUpdate();

                ps = conexion.prepareStatement(query1);
                ps.executeUpdate();

                ps = conexion.prepareStatement(query2);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%-13s %-13s %-10s %-10s %-10s %-20s\n", "FIELD", "TYPE", "NULL", "KEY", "DEFAULT", "EXTRA");
                System.out.printf("%-13s %-13s %-10s %-10s %-10s %-20s\n", "-----", "----", "----", "---", "-------", "-----");
                while (rs.next()) {
                    System.out.printf("%-13s %-13s %-10s %-10s %-10s %-20s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                }

                ps = conexion.prepareStatement(query3);
                ps.setBoolean(1, true);
                ps.setInt(2, 5);
                ps.executeUpdate();

                ps = conexion.prepareStatement(query3);
                ps.setBoolean(1, false);
                ps.setInt(2, 6);
                ps.executeUpdate();

                System.out.println("");
                System.out.println("");

                ps = conexion.prepareStatement(query4);
                ResultSet rs1 = ps.executeQuery();
                System.out.printf("%-13s %-13s %-13s %-12s     %-10s\n", "IDPROVEEDOR", "NOMBRE", "NIF", "DIRECCION", "ESCASADO");
                System.out.printf("%-13s %-13s %-13s %-12s     %-10s\n", "-----------", "------", "---", "---------", "--------");
                while (rs1.next()) {
                    System.out.printf("%13d %-13s %-13s %-12s     %10s\n", rs1.getInt(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getBoolean(5));
                }

            } catch (SQLException e) {
                System.out.println("error: " + e);
            }
        } else {
            System.out.println("error: no hay conexion");
        }

    }

}
