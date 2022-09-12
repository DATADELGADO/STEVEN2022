package SQLITE;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal1 {
//CRUD  === 'D' DELETE
   
    public static void main(String[] args) {
        File f = new File("datos/probando.db");
        String ra = f.getAbsolutePath(); // esto es para conseguir la ruta absoluta
        System.out.println(ra);
        String ruta = "jdbc:sqlite" + ":" + ra;

        try {
            Connection conexion = DriverManager.getConnection(ruta);
            String query = "DELETE FROM CONSULTA WHERE NOMBREMEDICO = 'ANA DURAN VILA'";
            PreparedStatement ps = conexion.prepareStatement(query);
            //ps.setString(1,);
            ps.executeUpdate();
            System.out.println("SE HA ELIMINADO CORRECTAMENTE");
           
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
