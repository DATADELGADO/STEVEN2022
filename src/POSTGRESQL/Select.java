package POSTGRESQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Select {

    public static void main(String[] args) {
        /*{
            //String url = "jdbc:postgresql" + "://" + localhost;+":" + 5432;
            try {
                String url = "jdbc:postgresql://localhost:5432/universidad";
                Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
                String query = "select * from alumno;";
                PreparedStatement ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%-10s    %-15s %-25s %-15s %-15s\n", "ID ALUMNO", "NOMBRE", "APELLIDO", "GRUPO", "NACIMIENTO");
                System.out.printf("%-10s    %-15s %-25s %-15s %-15s\n", "---------", "------", "--------", "-----", "----------");
                while (rs.next()) {
                    System.out.printf("%10d     %-15s %-25s %-15s %-15s\n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);

            }
        }*/

        {
            //String url = "jdbc:postgresql" + "://" + localhost;+":" + 5432;
            List<Alumno> alumnos_al = new ArrayList<Alumno>();
            try {
                String url = "jdbc:postgresql://localhost:5432/universidad";
                Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
                String query = "select * from alumno;";
                PreparedStatement ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%-10s    %-15s %-25s %-15s %-15s\n", "ID ALUMNO", "NOMBRE", "APELLIDO", "GRUPO", "NACIMIENTO");
                System.out.printf("%-10s    %-15s %-25s %-15s %-15s\n", "---------", "------", "--------", "-----", "----------");
                while (rs.next()) {
                    alumnos_al.add(new Alumno(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5)));
                }
                for(Alumno a : alumnos_al){
                    a.imprimir();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

}
