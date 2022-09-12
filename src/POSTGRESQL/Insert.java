package POSTGRESQL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/universidad";//PROTCOLO NAMESERVER PUERTO NOMBREBASEDATOS
        try {
            Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
            String query = "INSERT INTO Alumno(nombre, apellidos, grupo, fecha_nacimiento) VALUES ('Walmi', 'Ledezma', 'dam', '2000-01-01');";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
