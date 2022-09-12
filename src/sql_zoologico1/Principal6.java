package sql_zoologico1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql_alumno3.Entrada;

public class Principal6 {

    public static void main(String[] args) {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ZOOLOGICOIR", "root", "");
            String query = "DELETE FROM Animal WHERE idEspecie = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, Entrada.entradaCadena("Ingrese Identificador Especie? "));
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException ex) {
            Logger.getLogger(Principal4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
