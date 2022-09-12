package POSTGRESQL;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertSelectTipoDatoArray {

    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/campusfp";
            Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
            PreparedStatement ps = null;
            ResultSet rs = null;
            //(1)
            String query1 = "DROP TABLE IF EXISTS vendedor;";
            ps = conexion.prepareStatement(query1);
            ps.execute();
            System.out.println("OK: TABLA ELIMINADA");

            //(2)
            String query2 = "create table vendedor (\n"
                    + "    idVendedor      INT,\n"
                    + "    nombre          VARCHAR(10),\n"
                    + "    departamentos   TEXT[],\n"
                    + "                    primary key (idVendedor)   \n"
                    + ");";
            ps = conexion.prepareStatement(query2);
            ps.execute();
            System.out.println("OK: TABLA CREADA");

            //(3)
            String query3 = "insert into vendedor values(1,'Luis','{contabilidad,secretaria}');";
            ps = conexion.prepareStatement(query3);
            ps.executeUpdate();
            System.out.println("OK: SE HA INSERTADO CORRECTAMENTE");

            //3.1
            String[] registros = {
                "insert into vendedor values(2,'Miguel','{venta}');",
                "insert into vendedor values(3,'Carlos','{almacen,venta}');",
                "insert into vendedor values(4,'Maria','{secretaria,contabilidad,atención}');",
                "insert into vendedor values(5,'Carmen','{contabilidad,secretaria}');"
            };
            for (int i = 0; i < registros.length; i++) {
                String query3_1 = registros[i];
                ps = conexion.prepareStatement(query3_1);
                ps.executeUpdate();
            }
            System.out.println("OK: SE HA INSERTADO CORRECTAMENTE TODOS LOS REGISTROS");

            //(4)
            String query4 = "SELECT * FROM vendedor;";
            ps = conexion.prepareStatement(query4);
            rs = ps.executeQuery();
            System.out.printf("%-5s     %-15s   %-40s\n", "ID VENDEDOR", "NOMBRE", "DEPARTAMENTOS");
            while (rs.next()) {
                //Array arrayDepartamentos = rs.getArray(3);
                System.out.printf("%5d      %-15s   %-40s\n", rs.getInt(1), rs.getString(2), rs.getArray(3));
            }

            //(5)
            String query5 = "SELECT * FROM vendedor;";
            ps = conexion.prepareStatement(query5);
            rs = ps.executeQuery();
            System.out.printf("%-5s     %-15s   %-40s\n", "ID VENDEDOR", "NOMBRE", "DEPARTAMENTOS");
            while (rs.next()) {
                int idVendedor = rs.getInt(1);
                String nombre = rs.getString(2);
                Array arrayDepartamentos = rs.getArray(3);
                String[] departamentos = (String[]) arrayDepartamentos.getArray(); // CONVERTIR UN ARRAY DE POSTGRESQL A UN ARRAY DE JAVA NORMAL PARA PODER RECORRERLO
                for (int i = 0; i < departamentos.length; i++) {
                    String d = departamentos[i];
                    if (d.equalsIgnoreCase("secretaria")) {
                        //System.out.printf("%5d      %-15s   %-40s\n", idVendedor, nombre, arrayDepartamentos);
                        System.out.printf("%5d      %-15s   %-40s\n", idVendedor, nombre, d);

                    }
                }
            }

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex.getMessage());
        }
    }

}
