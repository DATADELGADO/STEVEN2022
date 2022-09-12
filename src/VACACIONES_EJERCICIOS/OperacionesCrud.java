package VACACIONES_EJERCICIOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacionesCrud {

    public static void main(String[] args) {
        //HACER UN PROGRAMA EN JAVA QUE PERMITA MOSTRAR LA FACTURA QUE TIENE EL MAYOR MONTO VENDIDO. MYSQL(TIENDARABAL).
/*
        String url = "jdbc:mysql://localhost:3306/tiendarabanal";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            String query = "select numerofactura, sum(precio*cantidad) as mayorMonto\n"
                    + "from detalle\n"
                    + "group by numerofactura\n"
                    + "having mayorMonto=(select sum(precio*cantidad) as montoVendido\n"
                    + "from detalle\n"
                    + "group by numerofactura\n"
                    + "order by montoVendido desc\n"
                    + "limit 1);";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-20s     %-20s\n", "NumeroFactura", "MayorMonto");

            while (rs.next()) {
                System.out.printf("%20d     %20d\n", rs.getInt(1), rs.getInt(2));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: CONEXION");
        }
         */

        String url = "jdbc:mysql://localhost:3306/tiendarabanal";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            String query = "select numerofactura, sum(precio*cantidad) as montoMayor\n"
                    + "from detalle\n"
                    + "group by numerofactura;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            int facturaMayor = 0;
            double montoMayor = 0;
            while (rs.next()) {
                double monto = rs.getDouble(2);
                if (monto > montoMayor) {
                    montoMayor = monto;
                    facturaMayor = rs.getInt(1);
                }
            }
            System.out.printf("%-20s     %-20s\n", "NumeroFactura", "MayorMonto");
            System.out.printf("%20d     %20.2f\n", facturaMayor, montoMayor);

        } catch (SQLException ex) {
            System.out.println("ERROR: CONEXION");
        }

    }

}
