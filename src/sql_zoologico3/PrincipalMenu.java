package sql_zoologico3;

import sql_alumno3.Entrada;

public class PrincipalMenu {

    public static void main(String[] args) {

        do {
            Opcion.cls();
            System.out.println("MENU");
            System.out.println("1. Qué animales hay en una ciudad");
            System.out.println("2. Crear un archivo zoologico.csv que contenga todos los registros de la tabla Zoologico");
            System.out.println("3. Borrar el archivo zoologico.csv");
            System.out.println("0. Salir");

            int opcion = Entrada.entradaNumeroEntero("Ingrese Opción? ");

            switch (opcion) {
                case 1:
                    Opcion.opcion1();
                    break;
                case 2:
                    Opcion.opcion2();
                    break;
                case 3:
                    Opcion.opcion3();
                    break;
                case 4:
                    //Opcion.opcion4();
                    break;
                case 5:
                    //Opcion.opcion5();
                    break;
                case 6:
                    //Opcion.opcion6();
                    break;
                case 7:
                    //Opcion.opcion6(2);
                    break;
                case 8:
                    //Opcion.opcion6(3);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        } while (true);

    }
}
