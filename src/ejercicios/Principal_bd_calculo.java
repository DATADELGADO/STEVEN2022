package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal_bd_calculo {

    public static void main(String[] args) {

        String query1 = "SELECT * FROM triangulo";
        String query2 = "INSERT INTO triangulo(cateto1,cateto2,hipotenusa) VALUES(?,?,?)";
        Connection conexion = establecerConexion();
        PreparedStatement ps = null;

        if (conexion != null) {
            try {

                do {
                    System.out.println("QUE DESEA REALIZAR?");
                    System.out.println("(1) CONSULTAR TABLA TRIANGULO");
                    System.out.println("(2) INSERTAR REGISTRO EN TABLA TRIANGULO");
                    System.out.println("(3) SALIR DEL PROGRAMA");

                    int opcion = (int) libreria.MisMetodos_1.entradaGeneral("INGRESE OPCION: ");
                    System.out.println("");
                    boolean bandera = false;
                    switch (opcion) {
                        case 1:
                            ps = conexion.prepareStatement(query1);
                            ResultSet rs = ps.executeQuery();
                            System.out.printf("%-10s     %-8s     %-8s     %-11s\n", "IDTRIANGULO", "CATETO#1", "CATETO#2", "HIPOTENUSA");
                            while (rs.next()) {
                                System.out.printf("%10d     %8.2f     %8.2f     %11.2f\n", rs.getInt(1), rs.getDouble(2), rs.getDouble(3), rs.getDouble(4));
                            }
                            limpiar();
                            break;
                        case 2:
                            Ejercicio11_2 triangulo = new Ejercicio11_2(libreria.MisMetodos_1.entradaGeneral("INGRESE CATETO#1: "), libreria.MisMetodos_1.entradaGeneral("INGRESE CATETO#2: "));
                            ps = conexion.prepareStatement(query2);
                            ps.setDouble(1, triangulo.getC1());
                            ps.setDouble(2, triangulo.getC2());
                            ps.setDouble(3, triangulo.hipotenusa());
                            ps.executeUpdate();
                            System.out.println("SE HA INSERTADO CORRECTAMENTE");
                            limpiar();
                            break;
                        case 3:
                            bandera = true;
                            break;
                    }
                    if (bandera == true) {
                        System.out.println("HAS TERMINADO EL PROGRAMA");
                        System.exit(0);
                    }

                } while (true);

            } catch (Exception e) {
                System.out.println("error " + e);
            }

        } else {
            System.out.println("NO HAY CONEXION");
        }

    }

    public static Connection establecerConexion() {
        String url = "jdbc:mysql://localhost:3306/calculo";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "25800307");
            return conexion;
        } catch (SQLException ex) {
            System.out.println("error:" + ex);
            return null;
        }
    }

    public static void limpiar() {
        System.out.println("\n\n\n\n\n\n");
    }

}
