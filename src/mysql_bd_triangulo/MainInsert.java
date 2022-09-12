package mysql_bd_triangulo;

public class MainInsert {

    // static Connection conexion = establecerConexion();
    public static void main(String[] args) {

        if (OperacionesCrud.conexion != null) {
            double cateto1 = libreria.Entrada.entradaNumeroReal("INGRESE CATETO#1: ");
            double cateto2 = libreria.Entrada.entradaNumeroReal("INGRESE CATETO#2: ");

            Triangulo t = new Triangulo(1, cateto1, cateto2);
            boolean x = OperacionesCrud.insertar(t);
            if (x == true) {
                System.out.println("OK: SE INSERTO EL REGISTRO CORRECTAMENTE");
            } else {
                System.out.println("ERROR: NO SE INSERTÓ EL REGISTRO");
            }
        } else {
            System.out.println("ERROR: NO HAY CONEXION");
        }

    }

}
