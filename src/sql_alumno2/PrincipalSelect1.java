package sql_alumno2;

import java.sql.*;
import java.util.*;

public class PrincipalSelect1 {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/instituto";
            Connection conexion = DriverManager.getConnection(url, "root", "");
            String query = "SELECT * FROM Alumno WHERE idAlumno = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, 10);
            ResultSet rs = ps.executeQuery();
            boolean bandera = false;
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " "
                        + rs.getString(2) + " "
                        + rs.getInt(3) + " "
                        + rs.getDouble(4));
                bandera = true;
            }
            if (bandera == false) {
                System.out.println("NO EXISTE ALUMNO");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: \n" + e.getMessage());
        }
    }
}
