package SQLITE;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal4 {

    public static void main(String[] args) {
        File f = new File("datos/probando.db");
        String ra = f.getAbsolutePath(); // esto es para conseguir la ruta absoluta
        String ruta = "jdbc:sqlite" + ":" + ra;
        try {
            Connection conexion = DriverManager.getConnection(ruta);
            String query = "CREATE TABLE Artista1 (\n"
                    + "  idArtista TEXT(4)  NOT NULL,\n"
                    + "  nombre    TEXT(30) NOT NULL,\n"
                    + "            PRIMARY KEY (idArtista)\n"
                    + ");";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
            System.out.println("SE HA ACTUALIZADO CORRECTAMENTE");
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }

}
