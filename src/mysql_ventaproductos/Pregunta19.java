package mysql_ventaproductos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pregunta19 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ventaproductos";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            String query = "select *\n"
                    + "from cliente\n"
                    + "where nombre like 'x%' or nombre like 'z%'";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            boolean bandera = false;
            while (rs.next()) {
                if (bandera == false) {
                    System.out.printf("%-9s    %-20s    %-20s    %-20s    %-20s    %-16s\n", "IDCLIENTE", "NOMBRE", "APELLIDOS", "DNI", "DIRECCION", "FECHA_NACIMIENTO");
                    System.out.printf("%-9s    %-20s    %-20s    %-20s    %-20s    %-16s\n", "---------", "------", "---------", "---", "---------", "----------------");
                }
                int idCliente = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellidos = rs.getString(3);
                String dni = rs.getString(4);
                String direccion = rs.getString(5);
                Date fecha_nacimiento = rs.getDate(6);
                System.out.printf("%9d    %-20s    %-20s    %-20s    %-20s    %16s\n", idCliente, nombre, apellidos, dni, direccion, fecha_nacimiento);
                bandera = true;
            }
            if (bandera == false) {
                System.out.println("no hay registros");
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

}
