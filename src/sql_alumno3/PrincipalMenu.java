package sql_alumno3;

public class PrincipalMenu {

    public static void main(String[] args) {

        do {
            Opcion.cls();
            System.out.println("MENU");
            System.out.println("1. Insertar registro alumno");
            System.out.println("2. Buscar registro alumno por su nombre");
            System.out.println("3. Buscar registro alumno por su identifiador");
            System.out.println("4. Eliminar registro alumno por su identificador");
            System.out.println("5. Actualizar registro alumno en todos sus datos");
            System.out.println("6. Mostrar todos los registros de la tabla alumno");
            System.out.println("7. Mostrar todos los registros de la tabla alumno ordenados por el nombre");
            System.out.println("8. Mostrar todos los registros de la tabla alumno ordenados por el nombre descendente");
            System.out.println("9. Salir");

            int opcion = Entrada.entradaNumeroEntero("Ingrese Opción? ");

            switch (opcion) {
                case 1:
                    Opcion.opcion1_1();
                    break;
                case 2:
                    Opcion.opcion2_2();
                    break;
                case 3:
                    Opcion.opcion3();
                    break;
                case 4:
                    Opcion.opcion4();
                    break;
                case 5:
                    Opcion.opcion5();
                    break;
                case 6:
                    Opcion.opcion6(1);
                    break;
                case 7:
                    Opcion.opcion6(2);
                    break;
                case 8:
                    Opcion.opcion6(3);
                    break;
                case 9:
                    System.exit(0);
                    break;
            }

        } while (true);

    }
}
