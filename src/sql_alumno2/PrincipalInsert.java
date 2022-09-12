package sql_alumno2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrincipalInsert {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/instituto";
            Connection conexion = DriverManager.getConnection(url, "root", "");
            String query = "INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,?,?,?)";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, "Delly");
            ps.setInt(2, 18);
            ps.setDouble(3, 1.72);
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR: \n" + e.getMessage());
        }

    }

}
