package sql_bd_montoproducto;


import ejercicios.Entrada;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {
        File archivo = new File("datos/importeproducto1.db");//Ruta Relativa
        String ra = archivo.getAbsolutePath();//Ruta Absoluta
        System.out.println(ra);
        
        String url = "jdbc:sqlite:" + ra;
        
        try {
            Connection conexion = DriverManager.getConnection(url, "postgres", "25800307");
            String query1 = "INSERT INTO factura(cantidadCajas,unidadesxCaja,precioxUnidad) VALUES(?,?,?)";
            String query2 = "SELECT * FROM factura";
            int cantidadCajas = Entrada.entradaNumeroEntero("INGRESE CANTIDAD CAJAS?: ");
            int unidadesxCaja = Entrada.entradaNumeroEntero("INGRESE UNIDADES X CAJA?: ");
            double precioxUnidad = Entrada.entradaNumeroReal("INGRESE PRECIO X UNIDAD?: ");
            Factura f = new Factura(1, cantidadCajas, unidadesxCaja, precioxUnidad);
            PreparedStatement ps = null;

            try {
                //INSERT
                ps = conexion.prepareStatement(query1);
                ps.setInt(1, f.getCantidadCajas());
                ps.setInt(2, f.getUnidadesxCaja());
                ps.setDouble(3, f.getPrecioxUnidad());
                ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println("ERROR INSERT: " + e);
            }

            try {
                //SELECT
                ps = conexion.prepareStatement(query2);
                ResultSet rs = ps.executeQuery();
                Factura.cabecera();
                while (rs.next()) {
                    int idFactura = rs.getInt(1);
                    cantidadCajas = rs.getInt(2);
                    unidadesxCaja = rs.getInt(3);
                    precioxUnidad = rs.getDouble(4);
                    Factura x = new Factura(idFactura, cantidadCajas, unidadesxCaja, precioxUnidad);
                    x.cuerpo();
                }
            } catch (SQLException e1) {
                System.out.println("ERROR SELECT: " + e1);
            }

        } catch (SQLException ex) {
            System.out.println("ERROR CONEXION" + ex);
        }
    }

}
