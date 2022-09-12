package EJERCICIOS_VACACIONES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMysql {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/tiendarabanal";
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            String query = "SELECT numeroFactura, SUM(precio*cantidad) AS MONTO\n"
                    + "FROM Detalle\n"
                    + "GROUP BY numeroFactura\n"
                    + "HAVING MONTO = (SELECT SUM(precio*cantidad) AS MONTO\n"
                    + "FROM Detalle\n"
                    + "GROUP BY numeroFactura\n"
                    + "ORDER BY MONTO DESC\n"
                    + "LIMIT 1);";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-13s     %-10s\n", "NUMERO FACTURA","MONTO");
            while (rs.next()) {
                System.out.printf("%13d  %10.2f\n", rs.getInt(1),rs.getDouble(2));
            }

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex.getMessage());
        }
    }

}
