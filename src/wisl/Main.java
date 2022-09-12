package wisl;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            cls();
            System.out.println("MENU");
            System.out.println("1. CONVERTIR UN OBJETO JAVA EN UN OBJETO JSON");
            System.out.println("2. CONVERTIR UNA LISTA DE OBJETOS JAVA EN UNA LISTA DE OBJETOS JSON");
            System.out.println("3. CREAR UN ARCHIVO JSON");
            System.out.println("4. Eliminar registro alumno por su identificador");
            System.out.println("5. Actualizar registro alumno en todos sus datos");
            System.out.println("6. Mostrar todos los registros de la tabla alumno");
            System.out.println("7. Mostrar todos los registros de la tabla alumno ordenados por el nombre");
            System.out.println("8. Mostrar todos los registros de la tabla alumno ordenados por el nombre descendente");
            System.out.println("0. Salir");

            String opcion = Entrada.cadena("Ingrese Opción? ");

            switch (opcion) {
                case "1":
                    cls();
                    Opcion.opcion1();
                    pause();
                    break;
                case "2":
                    cls();
                    Opcion.opcion2();
                    pause();
                    break;
                case "3":
                    cls();
                    Opcion.opcion3();
                    pause();
                    break;
                case "4":
                    cls();
                    Opcion.opcion4();
                    pause();
                    break;
                case "5":
                    cls();
                    Opcion.opcion5();
                    pause();
                    break;
                case "6":
                    cls();
                    Opcion.opcion6();
                    pause();
                    break;
                case "7":
                    cls();
                    Opcion.opcion7();
                    pause();
                    break;
                case "8":
                    cls();
                    Opcion.opcion8();
                    pause();
                    break;
                case "9":
                    cls();
                    Opcion.opcion9();
                    pause();
                    break;
                case "10":
                    cls();
                    Opcion.opcion10();
                    pause();
                    break;
                case "0":
                    System.exit(0);
                    break;
            }

        } while (true);
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
