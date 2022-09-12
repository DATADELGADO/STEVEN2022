package sql_zoologico3;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;

public class Opcion {

    public static void opcion1() {
        cls();
        System.out.println("1. QUE ANIMALES HAY EN UNA CIUDAD");
        System.out.println("=================================");
        Connection conexion = OperacionesCrud.miconexion();
        if (conexion != null) {
            OperacionesCrud.mostrar(conexion);
        } else {
            System.out.println("ERROR: CONEXION");
        }
        pause();
    }

    public static void opcion2() {
        cls();
        System.out.println("1. Crear un archivo zoologico.csv que contenga todos los registros de la tabla Zoologico");
        System.out.println("========================================================================================");
        Connection conexion = OperacionesCrud.miconexion();
        if (conexion != null) {
            OperacionesCrud.crearArchivoCsvZoologico(conexion);
        } else {
            System.out.println("ERROR: CONEXION");
        }
        pause();

    }

    public static void opcion3() {
        cls();
        System.out.println("3. BORRAR ARCHIVO ZOOLOGICO.CSV");
        System.out.println("===============================");
        File f = new File("datos/zoologico.csv");
        if (f.exists()) {
            f.delete(); 
            System.out.println("OK ARCHIVO ZOOLOGICO.CSV ELIMINADO");
        } else {
            System.out.println("ARCHIVO NO EXISTE");
        }
        pause();
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
