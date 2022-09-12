package mysql_json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal3 {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/world_x";
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            String query = "SELECT doc->'$.geography.Region' AS REGION, COUNT(doc->'$.geography.Region') AS CANTIDAD_PAISES\n"
                    + "FROM countryinfo\n"
                    + "GROUP BY doc->'$.geography.Region'\n"
                    + "ORDER BY CANTIDAD_PAISES;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-30s %20s\n", "REGION", "CANTIDAD_PAISES");
            System.out.printf("%-30s %20s\n", "------", "---------------");

            while (rs.next()) {
                //String columna1 = rs.getString(1).substring(1, rs.getString(1).length() - 1);
                //int columna2 = rs.getInt(2);
                //SEGUNDA FORMA DE EXTRAER LAS COLUMNAS
                String columna1 = rs.getString("REGION").substring(1, rs.getString("REGION").length() - 1);
                int columna2 = rs.getInt("CANTIDAD_PAISES");

                System.out.printf("%-30s %20d\n", columna1, columna2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
