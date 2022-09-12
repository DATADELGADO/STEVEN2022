package POSTGRESQL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Update {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/universidad";//PROTCOLO NAMESERVER PUERTO NOMBREBASEDATOS
        int idAlumnoActualizar = 8;
        String nombre = "Steven";
        String apellido = "Delgado";
        String grupo = "daw";
        String nacimiento = "1997-04-23";
        // Date d = new Date(1900, 00, 01);
        //java.sql.Date fechaConvertida = d;
        try {
            Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
            String query = "UPDATE Alumno SET nombre=?, apellidos=?, grupo=?, fecha_nacimiento=? WHERE idAlumno = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, grupo);
            ps.setDate(4, getDateFormat(nacimiento));//949 359 600
            //ps.setDate(4, fechaConvertida);//949 359 600
            ps.setInt(5, idAlumnoActualizar);
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static java.sql.Date getDateFormat(String fechaEntrada) {
        SimpleDateFormat sdE = new SimpleDateFormat("yyyy-MM-dd");
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date fechaConvertida = null;
        try {
            java.util.Date parsed = sdE.parse(fechaEntrada);
            System.out.println(parsed.getTime());
            fechaConvertida = new java.sql.Date(parsed.getTime());

        } catch (Exception e) {
            System.out.println("Error occurred" + e.getMessage());
        }
        return fechaConvertida;
    }

}
