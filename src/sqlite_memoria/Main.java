package sqlite_memoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:sqlite::memory:";
        String query1 = "CREATE TABLE IF NOT EXISTS Alumno(\n"
                + "  idAlumno INTEGER      NOT NULL PRIMARY KEY AUTOINCREMENT,\n"
                + "  nombre   VARCHAR(20)  NOT NULL,\n"
                + "  edad     INTEGER      NOT NULL\n"
                + ");";
        String[] query2 = new String[5];
        query2[0] = "INSERT INTO Alumno(nombre,edad) VALUES('LUIS',21);";
        query2[1] = "INSERT INTO Alumno(nombre,edad) VALUES('MIGUEL',23);";
        query2[2] = "INSERT INTO Alumno(nombre,edad) VALUES('CARLOS',22);";
        query2[3] = "INSERT INTO Alumno(nombre,edad) VALUES('MARIA',19);";
        query2[4] = "INSERT INTO Alumno(nombre,edad) VALUES('ARTURO',23);";
        String query3 = "SELECT * FROM alumno;";
        PreparedStatement ps = null;
        try {
            Connection conexion = DriverManager.getConnection(url);

            //CREAR TABLA
            try {
                ps = conexion.prepareStatement(query1);
                ps.execute();
            } catch (SQLException e1) {
                System.out.println("error: crear tabla" + e1);
            }

            //INSERTAR REGISTROS
            try {
                for (String a : query2) {
                    ps = conexion.prepareStatement(a);
                    ps.executeUpdate();
                }

            } catch (SQLException e2) {
                System.out.println("error: insertar registros" + e2);
            }

            //SELECT
            try {
                ps = conexion.prepareStatement(query3);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%-8s %-8s %-3s\n", "IDALUMNO", "NOMBRE", "EDAD");
                System.out.printf("%-8s %-8s %-3s\n", "--------", "------", "----");
                while (rs.next()) {
                    System.out.printf("%8d %-8s %3d\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
                }
            } catch (SQLException e3) {
                System.out.println("error: select" + e3);
            }

        } catch (SQLException ex) {
            System.out.println("EEROR CONEXION:" + ex);
        }

    }

}
