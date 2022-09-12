package sqlite_bd_triangulo;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacionesCrud {

    static Connection conexion = establecerConexion();

    public static Connection establecerConexion() {
        File archivo = new File("datos/triangulo.db");
        String ra = archivo.getAbsolutePath();
        
        String url = "jdbc:sqlite:"+ra;
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            return conexion;
        } catch (SQLException ex) {
            System.out.println("error:" + ex);
            return null;
        }
    }

    public static boolean insertar(Triangulo t) {
        boolean bandera = false;
        String query = "INSERT INTO triangulo(cateto1,cateto2) VALUES(?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setDouble(1, t.getCateto1());
            ps.setDouble(2, t.getCateto2());
            ps.executeUpdate();
            bandera = true;
        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean seleccionar() {
        boolean bandera = false;
        String query = "SELECT * FROM triangulo";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Triangulo.cabecera();
            while (rs.next()) {
                int idTriangulo = rs.getInt(1);
                double cateto1 = rs.getDouble(2);
                double cateto2 = rs.getDouble(3);
                Triangulo t = new Triangulo(idTriangulo, cateto1, cateto2);
                t.cuerpo();
                bandera = true;
            }
        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;

    }

}
