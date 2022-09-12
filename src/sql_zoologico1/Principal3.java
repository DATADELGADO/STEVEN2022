package sql_zoologico1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal3 {

    public static void main(String[] args) {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Zoologico", "root", "");
            //String query = "INSERT INTO Zoologico(idZoo,descripcion,ciudad,superficie,presupuesto,pais) VALUES ('Z09','Zulia','San Fran.',20,300000,'Venezuela')";
            String query = "INSERT INTO Animal(idAnimal,nacimiento,paisOrigen,continente,sexo,idZoo,idEspecie) VALUES\n"
                    + "('A47','2013-05-05','Somalía','Africa','M','Z09','E04'),\n"
                    + "('A48','2014-06-06','Somalía','Africa','H','Z09','E04')";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException ex) {
            Logger.getLogger(Principal3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

/*
INSERT INTO Animal(idAnimal,nacimiento,paisOrigen,continente,sexo,idZoo,idEspecie) VALUES
('A47','2013-05-05','Somalía','Africa','M','Z09','E04'),
('A48','2014-06-06','Somalía','Africa','H','Z09','E04');
 */
