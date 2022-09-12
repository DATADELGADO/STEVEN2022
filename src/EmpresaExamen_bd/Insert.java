package EmpresaExamen_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert {

    public static void main(String[] args) {

        try { // conexion
            Connection x = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresaexamen", "root", "25800307");
            PreparedStatement ps = null;
            try { //insert

                //String query = "INSERT INTO PROVEEDOR(idProveedor,nif,nombre,direccion) VALUES('1','1111111E','STEVEN','MADRID')";
                String query = "INSERT INTO PROVEEDOR(idProveedor,nif,nombre,direccion) VALUES(?,?,?,?)";
                ps = x.prepareStatement(query);
                ps.setString(1, "3");
                ps.setString(2, "2222222E");
                ps.setString(3, "aida");
                ps.setString(4, "madrid");
                ps.executeUpdate();
                System.out.println("ok: insert");

            } catch (SQLException e) {
                System.out.println("error: insert" + e);
            }

            try { //select
                String query = "select * from proveedor";
                ps = x.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%-10s %-10s %-10s %-10s\n", "IDPROVEEDOR", "NIF", "NOMBRE", "DIRECCION");
                System.out.printf("%-10s %-10s %-10s %-10s\n", "-----------", "---", "------", "---------");
                while (rs.next()) {
                    System.out.printf("%-10s %-10s %-10s %-10s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                }

            } catch (SQLException e) {
                System.out.println("error: select" + e);
            }

        } catch (SQLException ex) {
            System.out.println("error: conexion" + ex);
        }

    }

}

/*
CRUD
        
C   CREAR    (INSERT,CREATE)
R   READ    (SELECT)
U   UPDATE  
D   DELETE
 */
