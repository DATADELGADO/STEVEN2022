package mysql_bd_triangulo;



public class MainSelect {

    public static void main(String[] args) {

        if (OperacionesCrud.conexion != null) {

            if (OperacionesCrud.seleccionar() == true) {
                System.out.println("OK:MOSTRAR");
            } else {
                System.out.println("ERROR:MOSTRAR");
            }

        } else {
            System.out.println("ERROR: NO HAY CONEXION");
        }
    }

}
