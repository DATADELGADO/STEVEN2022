package sql_zoologico3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql_alumno1.ConexionMariadb;

public class OperacionesCrud {

    public static void mostrar(Connection conexion) {
        String query = "SELECT z.ciudad,a.idAnimal, e.nombreVulgar\n"
                + "FROM Zoologico z, Animal a, Especie e\n"
                + "WHERE z.idZoo=a.idZoo AND e.idEspecie=a.idEspecie\n"
                + "GROUP BY z.ciudad,a.idAnimal";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-15s %8s %-15s\n", "CIUDAD", "IDANIMAL", "NOMBRE VULGAR");
            System.out.printf("%-15s %8s %-15s\n", "------", "--------", "-------------");
            while (rs.next()) {
                String ciudad = rs.getString(1);
                String idAnimal = rs.getString(2);
                String nombreVulgar = rs.getString(3);
                System.out.printf("%-15s %8s %-15s\n", ciudad, idAnimal, nombreVulgar);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: SENTENCIA SQL");
        }
    }

    public static void crearArchivoCsvZoologico(Connection conexion) {
        String query = "SELECT * FROM Zoologico";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idZoo = rs.getString(1);
                String descripcion = rs.getString(2);
                String ciudad = rs.getString(3);
                String superficie = rs.getString(4);
                String presupuesto = rs.getString(5);
                String pais = rs.getString(6);
                String registrocsv = idZoo+";"+descripcion+";"+ciudad+";"+superficie+";"+presupuesto+";"+pais+"\n";
                escribirCsv(registrocsv);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: SENTENCIA SQL");
        }
    }

    public static void escribirCsv(String registrocsv) {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File("datos/zoologico.csv");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);

            bw.write(registrocsv);
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection miconexion() {
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("zoologico", "root", "");
        Connection conexion = cm.getConexion();
        return conexion;
    }
}
