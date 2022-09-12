package SQLITE;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
//CRUD === 'R' READ
    public static void main(String[] args) {
        //"C:/Users/delga/OneDrive/Escritorio/NetBeansEjercicios/INICIO_JAVA_STEVEN_PRINCIPAL/datos/probando.db" // ESTO ES RUTA ABSOLUTA
        //"C:/SQLITE3/probando.db"
        File f = new File("datos/probando.db");
        String ra = f.getAbsolutePath(); // esto es para conseguir la ruta absoluta
        System.out.println(ra);
        String ruta = "jdbc:sqlite" + ":" + ra;

        try {
            Connection conexion = DriverManager.getConnection(ruta);
            String query = "select distinct(nombremedico) from consulta;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%10s  %-30s\n","", "NOMBRE DEL MEDICO");
            int c = 0;
            while (rs.next()) {
                System.out.printf("%10s  %-30s\n","("+(++c)+")", rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
