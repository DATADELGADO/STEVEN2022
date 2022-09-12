package SQLITE;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal3 {

    public static void main(String[] args) {
        PreparedStatement ps = null;
        File f = new File("datos/probando.db");
        String ra = f.getAbsolutePath(); // esto es para conseguir la ruta absoluta
        String ruta = "jdbc:sqlite" + ":" + ra;

        try {
            Connection conexion = DriverManager.getConnection(ruta);
            String query1 = "insert into consulta (numeroConsulta,fecha,nombreMedico,deinpr,procedencia) values ('8741','2022-07-25','ROMAN DELGADO','INDUCCION','URGENCIA');";
            ps = conexion.prepareStatement(query1);
            ps.executeUpdate();

            String query2 = "insert into consulta (numeroConsulta,fecha,nombreMedico,deinpr,procedencia) values (?,?,?,?,?);";
            ps = conexion.prepareStatement(query2);
            ps.setString(1,"8742");
            ps.setString(2,"2022-07-01");
            ps.setString(3,"AIDA LUZ");
            ps.setString(4,"CESAREA");
            ps.setString(5,"URGENCIA");
            ps.executeUpdate();

            System.out.println("SE HA ACTUALIZADO CORRECTAMENTE");

        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }

}
