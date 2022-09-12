package POSTGRESQL;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectDepartamento {

    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/campusfp";
            Scanner sc = new Scanner(System.in);
            System.out.println("INGRESE EL DEPARTAMENTO?: ");
            String p = sc.nextLine();
            Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
            String query = "SELECT * FROM vendedor;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Array arrayd = rs.getArray(3);
                String[] arrayn = (String[]) arrayd.getArray();
                for (int i = 0; i < arrayn.length; i++) {
                    if (arrayn[i].equalsIgnoreCase(p)) {
                        //System.out.printf("%5d      %-15s   %-40s\n", rs.getInt(1), rs.getString(2), rs.getArray(3));
                        System.out.printf("%5d      %-15s   %-40s\n", rs.getInt(1), rs.getString(2), arrayn[i]);

                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
