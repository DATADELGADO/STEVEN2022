package mysql_json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal4 {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/world_x";
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            
            String query = "SELECT (SELECT Name\n"
                    + "FROM country\n"
                    + "WHERE Name = ?) AS PAIS, Count(Name) AS NUMERO_CIUDADES\n"
                    + "FROM city\n"
                    + "WHERE CountryCode = (SELECT SUBSTRING(doc->'$.Code',2,3)\n"
                    + "FROM countryinfo\n"
                    + "WHERE doc->'$.Name' = ?);";

            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, "Spain");
            ps.setString(2, "Spain");

            ResultSet rs = ps.executeQuery();
            System.out.printf("%-30s %20s\n", "PAIS", "NUMERO_CIUDADES");
            System.out.printf("%-30s %20s\n", "------", "-------------");

            while (rs.next()) {
                //String columna1 = rs.getString(1).substring(1, rs.getString(1).length() - 1);
                //int columna2 = rs.getInt(2);
                //SEGUNDA FORMA DE EXTRAER LAS COLUMNAS
                String columna1 = rs.getString("PAIS");
                int columna2 = rs.getInt("NUMERO_CIUDADES");

                System.out.printf("%-30s %20d\n", columna1, columna2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
