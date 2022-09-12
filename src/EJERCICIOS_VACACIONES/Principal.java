package EJERCICIOS_VACACIONES;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        try {

            String url = "jdbc:mysql://localhost:3306/tiendarabanal";
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            String query = "SELECT * FROM CLIENTE;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String a = rs.getString(1) + ";" + rs.getString(2) + ";" + rs.getString(3) + "\n";
                escribirArchivo(a);
            }
            System.out.println("OK");
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void escribirArchivo(String cadena) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("datos/consulta_cliente.txt", true));
            bw.write(cadena);
            bw.flush();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
