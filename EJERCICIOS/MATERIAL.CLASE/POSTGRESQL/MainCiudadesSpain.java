package array;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainCiudadesSpain {

    public static void main(String[] args) {

        //0. PARAMETROS PARA LA CONEXION BASE DE DATOS
        String url = "jdbc:postgresql://127.0.0.1:5433/campusfp";
        String usuario = "postgres";
        String clave = "12345678";

        //1. CONEXION BASE DE DATOS
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("OK: CONEXION BASE DE DATOS");
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION BASE DE DATOS");
        }

        //2. BORRAR TABLA SI ESTA EXISTE
        String nombreTabla = "Pais";
        try {
            String query = String.format("DROP TABLE IF EXISTS %s", nombreTabla);
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
            System.out.println("OK: QUERY 1");
        } catch (Exception e) {
            System.out.println("ERROR: QUERY 1");
        }

        //3. CREAR TABLA
        try {
            String query = "CREATE TABLE Pais (pais TEXT, ciudades TEXT[])";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
            System.out.println("OK: QUERY 2");
        } catch (Exception e) {
            System.out.println("ERROR: QUERY 2");
        }

        //4. INSERTAR ARRAYS EN TABLA
        try {
            String pais = "Spain";
            String[] ciudadesSpain = {"Madrid", "Valencia", "Sevilla", "Cadiz"};
            Array arrayCiudadesSpain = conexion.createArrayOf("text", ciudadesSpain);
            String query = "INSERT INTO pais VALUES (?, ?)";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, pais);
            ps.setArray(2, arrayCiudadesSpain);
            ps.executeUpdate();
            System.out.println("OK: QUERY 3");
        } catch (Exception e) {
            System.out.println("ERROR: QUERY 3");
        }

        //5. RECUPERACION DE ARRAYS
        try {

            String query = "SELECT * FROM Pais";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Pais: " + rs.getString(1));
                Array arrayCiudadesSpain = rs.getArray(2);
                String[] ciudadesSpain = (String[]) arrayCiudadesSpain.getArray();

                for (int i = 0; i < ciudadesSpain.length; i++) {
                    System.out.println(ciudadesSpain[i]);
                }
            }
            System.out.println("OK: QUERY 4");
        } catch (Exception e) {
            System.out.println("ERROR: QUERY 4");
        }

        //6. ACTUALIZAR ARRAYS
        try {
            String[] ciudadesSpain = {"Madrid", "Valencia", "Sevilla", "Cadiz", "Granada", "Jaen"};//Array cadena en java
            Array arrayCiudadesSpain = conexion.createArrayOf("text", ciudadesSpain);//Array texto en postgresql
            String query = "UPDATE Pais SET ciudades = ? WHERE pais = 'Spain'";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setArray(1, arrayCiudadesSpain);
            ps.executeUpdate();
            System.out.println("OK: QUERY 5");
        } catch (Exception e) {
            System.out.println("ERROR: QUERY 5");
        }

        //7. RECUPERACION DE ARRAYS
        try {
            System.out.println("SALIDA 1");
            System.out.println("========");
            String query = "SELECT * FROM Pais";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2));
            }
            System.out.println("OK: QUERY 6");
        } catch (Exception e) {
            System.out.println("ERROR: QUERY 6");
        }

        //8. RECUPERACION DE ARRAYS
        try {
            System.out.println("SALIDA 2");
            System.out.println("========");
            String query = "SELECT * FROM Pais";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String pais = rs.getString(1);
                System.out.println("Pais: " + pais);
                Array arrayCiudadesSpain = rs.getArray(2); //Array Postgresql
                String[] ciudadesSpain = (String[]) arrayCiudadesSpain.getArray(); //Array Java
                for (int i = 0; i < ciudadesSpain.length; i++) {
                    System.out.println(ciudadesSpain[i]);
                }
            }
            System.out.println("OK: QUERY 7");
        } catch (Exception e) {
            System.out.println("ERROR: QUERY 7");
        }

    }

}
