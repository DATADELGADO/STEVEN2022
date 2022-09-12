package SQLITE;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal2 {
// CRUD === 'U'= UPDATE
    public static void main(String[] args) {
        File f = new File("datos/probando.db");
        String ra = f.getAbsolutePath(); // esto es para conseguir la ruta absoluta
        String ruta = "jdbc:sqlite" + ":" + ra;

        try {
            Connection conexion = DriverManager.getConnection(ruta);
            String query = "UPDATE Consulta SET nombreMedico = ? WHERE nombreMedico = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(2, libreria.MisMetodos_1.entradaGeneralDevolucionString("NOMBRE DEL MEDICO QUE DESEA ACTUALIZAR?: "));
            ps.setString(1,libreria.MisMetodos_1.entradaGeneralDevolucionString("INGRESE ACTUALIZACIÓN?: "));
            
            ps.executeUpdate();
            System.out.println("SE HA ACTUALIZADO CORRECTAMENTE");

        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }

}
