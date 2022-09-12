package sql_zoologico1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal1 {

    public static void main(String[] args) {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zoologico", "root", "");
            String query = "SELECT z.ciudad,a.idAnimal, e.nombreVulgar FROM Zoologico z, Animal a, Especie e WHERE z.idZoo=a.idZoo AND e.idEspecie=a.idEspecie GROUP BY z.ciudad,a.idAnimal";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-15s %8s %-15s\n", "CIUDAD", "IDANIMAL", "NOMBRE VULGAR");
            System.out.printf("%-15s %8s %-15s\n", "------", "--------", "-------------");
            while (rs.next()) {
                System.out.printf("%-15s %8s %-15s\n", rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Principal1.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR");
        }
        System.out.println("CONTINUAR CON EL PROGRAMA");

    }

}
