package POSTGRESQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Delete {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/universidad";//PROTCOLO NAMESERVER PUERTO NOMBREBASEDATOS
        int idAlumnoEliminar = 7;
        try {
            Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
            String query = "DELETE FROM Alumno WHERE idAlumno = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idAlumnoEliminar);
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
