package POSTGRESQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectFormatoFecha {

    public static void main(String[] args) {
        //String fechaEntrada = "2022-07-28";
        // System.out.println(getFechaConFormato(fechaEntrada));
        //String url = "jdbc:postgresql" + "://" + localhost;+":" + 5432;
        try {
            String url = "jdbc:postgresql://localhost:5432/universidad";
            Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
            String query = "select * from alumno;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%-10s    %-15s %-25s %-15s %-15s\n", "ID ALUMNO", "NOMBRE", "APELLIDO", "GRUPO", "NACIMIENTO");
            System.out.printf("%-10s    %-15s %-25s %-15s %-15s\n", "---------", "------", "--------", "-----", "----------");
            while (rs.next()) {
                String[] c = rs.getDate(5).toString().split("-");
                int a = Integer.parseInt(c[0]);
                if (a<2001) {
                    System.out.printf("%10d     %-15s %-25s %-15s %-15s\n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), getFechaConFormato(rs.getDate(5).toString()));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public static String getFechaConFormato(String fechaEntrada) {
        SimpleDateFormat sdE = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdS = new SimpleDateFormat("dd/MM/yyyy");
        String fechaSalida = "";
        java.util.Date p = null;
        try {
            p = sdE.parse(fechaEntrada);
            long milis_fe = p.getTime();
            fechaSalida = sdS.format(milis_fe);
        } catch (ParseException ex) {
            Logger.getLogger(SelectFormatoFecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaSalida;

    }
}
