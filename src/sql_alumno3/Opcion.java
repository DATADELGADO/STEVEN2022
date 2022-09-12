package sql_alumno3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import sql_alumno1.Alumno;
import sql_alumno1.ConexionMariadb;
import sql_alumno1.OperacionesCrud;

public class Opcion {

    public static void opcion1() {
        cls();
        System.out.println("1. INSERTAR RESGITRAR ALUMNO");
        System.out.println("----------------------------");
        String nombre = Entrada.entradaCadena("Ingrese nombre? ");
        int edad = Entrada.entradaNumeroEntero("Ingrese edad? ");
        double estatura = Entrada.entradaNumeroReal("Ingrese estatura? ");
        Alumno alumno = new Alumno(0, nombre, edad, estatura);
        if (OperacionesCrud.miconexion() != null) {
            if (OperacionesCrud.insertar(alumno, OperacionesCrud.miconexion()) != -1) {
                System.out.println("OK: INSERTAR REGISTRO ALUMNO");
            } else {
                System.out.println("ERROR: INSERTAR REGISTRO ALUMNO");
            }
        } else {
            System.out.println("NO HAY CONEXION");
        }
        pause();
    }

    public static void opcion1_1() {
        cls();
        System.out.println("1. INSERTAR RESGITRO ALUMNO");
        System.out.println("---------------------------");
        String nombre = Entrada.entradaCadena("Ingrese nombre? ");
        int edad = Entrada.entradaNumeroEntero("Ingrese edad? ");
        double estatura = Entrada.entradaNumeroReal("Ingrese estatura? ");
        Alumno alumno = new Alumno(0, nombre, edad, estatura);
        try {
            OperacionesCrud.insertar(alumno, OperacionesCrud.miconexion());
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        pause();
    }

    public static void opcion2() {
        cls();
        System.out.println("2. BUSCAR REGISTRO ALUMNO POR SU NOMBRE");
        System.out.println("---------------------------------------");
        String nombre = Entrada.entradaCadena("Ingresar nombre? ");
        if (OperacionesCrud.miconexion() != null) {
            List<Alumno> alumnos_al = OperacionesCrud.buscarRegistroAlumno(nombre, OperacionesCrud.miconexion());
            if (alumnos_al != null) {
                if (alumnos_al.size() > 0) {
                    for (int i = 0; i < alumnos_al.size(); i++) {
                        Alumno alumno = alumnos_al.get(i);
                        alumno.imprimir();
                    }
                } else {
                    System.out.println("NO EXISTE NINGUN ALUMNO CON ESE NOMBRE");
                }
            } else {
                System.out.println("ERROR: BUSCAR REGISTRO ALUMNO POR NOMBRE");
            }
        } else {
            System.out.println("ERROR CONEXION");
        }
        pause();
    }

    public static void opcion2_2() {
        cls();
        System.out.println("2. BUSCAR REGISTRO ALUMNO POR SU NOMBRE");
        System.out.println("---------------------------------------");
        try {
            String nombre = Entrada.entradaCadena("Ingresar nombre? ");
            List<Alumno> alumnos_al = OperacionesCrud.buscarRegistroAlumno(nombre, OperacionesCrud.miconexion());
            for (int i = 0; i < alumnos_al.size(); i++) {
                Alumno alumno = alumnos_al.get(i);
                alumno.imprimir();
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        pause();
    }

    public static void opcion3() {
        cls();
        System.out.println("3. BUSCAR REGISTRO ALUMNO POR SU IDENTIFICADOR");
        System.out.println("----------------------------------------------");
        if (OperacionesCrud.miconexion() != null) {
            int idAlumno = Entrada.entradaNumeroEntero("Ingrese Identificador? ");
            Alumno alumno = OperacionesCrud.buscarRegistroAlumno(idAlumno, OperacionesCrud.miconexion());
            if (alumno != null) {
                if (alumno.getIdAlumno() != 0) {
                    alumno.imprimir();
                } else {
                    System.out.println("NO EXISTE ALUMNO");
                }
            } else {
                System.out.println("ERROR: BUSCAR REGISTRO ALUMNO POR IDENTIFICADOR");
            }
        } else {
            System.out.println("ERROR CONEXION");
        }
        pause();
    }

    public static void opcion4() {
        cls();
        System.out.println("4. ELIMINAR REGISTRO ALUMNO POR SU IDENTIFICADOR");
        System.out.println("------------------------------------------------");
        if (OperacionesCrud.miconexion() != null) {
            int idAlumno = Entrada.entradaNumeroEntero("Ingresar Identificador? ");
            int z = OperacionesCrud.existeAlumno(idAlumno, OperacionesCrud.miconexion());
            switch (z) {
                case 0:
                    System.out.println("NO EXISTE ALUMNO");
                    break;
                case 1:
                    if (OperacionesCrud.eliminar(idAlumno, OperacionesCrud.miconexion()) == 1) {
                        System.out.println("OK: ELIMINAR REGISTRO ALUMNO POR SU IDENTIFICADOR");
                    } else {
                        System.out.println("ERROR: ELIMINAR REGISTRO ALUMNO POR SU IDENTIFICADOR");
                    }
                    break;
                case -1:
                    System.out.println("ERROR: METODO EXISTE ALUMNO(SQL)");
            }
        } else {
            System.out.println("ERROR CONEXION");
        }

        pause();
    }

    public static void opcion5() {
        cls();
        System.out.println("5. ACTUALIZAAR REGISTRO ALUMNO");
        System.out.println("------------------------------");
        if (OperacionesCrud.miconexion() != null) {
            int idAlumno = Entrada.entradaNumeroEntero("Ingrese Identificador? ");
            int x = OperacionesCrud.existeAlumno(idAlumno, OperacionesCrud.miconexion());
            switch (x) {
                case 0:
                    System.out.println("NO EXISTE EL ALUMNO");
                    break;
                case 1:
                    String nombre = Entrada.entradaCadena("Ingrese nombre? ");
                    int edad = Entrada.entradaNumeroEntero("Ingrese edad? ");
                    double estatura = Entrada.entradaNumeroReal("Ingrese estatura? ");
                    Alumno alumno = new Alumno(idAlumno, nombre, edad, estatura);
                    if (OperacionesCrud.actualizar(alumno, OperacionesCrud.miconexion()) == 1) {
                        System.out.println("OK: ACTUALIZAR");
                    } else {
                        System.out.println("ERROR: ACTUALIZAR(SQL)");
                    }
                    break;
                default:
                    System.out.println("ERROR: EXISTE ALUMNO(SQL)");
                    break;
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
        //pause();
    }

    public static void opcion6(int opcion) {
        cls();
        switch (opcion) {
            case 1:
                System.out.println("6. MOSTRAR TODOS LOS REGISTROS DE LA TABLA ALUMNO");
                System.out.println("-------------------------------------------------");
                break;
            case 2:
                System.out.println("7. MOSTRAR TODOS LOS REGISTROS DE LA TABLA ALUMNO ORDENDO POR EL CAMPO NOMBRE");
                System.out.println("-----------------------------------------------------------------------------");
                break;
            case 3:
                System.out.println("8. MOSTRAR TODOS LOS REGISTROS DE LA TABLA ALUMNO ORDENDO POR EL CAMPO NOMBRE DESCENDENTE");
                System.out.println("-----------------------------------------------------------------------------------------");
                break;
        }
        Connection conexion = OperacionesCrud.miconexion();
        if (conexion != null) {
            List<Alumno> alumnos_al = OperacionesCrud.retornarTodosRegistrosTablaAlumno(conexion, opcion);
            if (alumnos_al != null) {
                if (alumnos_al.size() > 0) {
                    for (int i = 0; i < alumnos_al.size(); i++) {
                        Alumno alumno = alumnos_al.get(i);
                        alumno.imprimir();
                    }
                } else {
                    System.out.println("NO EXISTEN REGISTROS EN LA TABLA ALUMNO");
                }
            } else {
                System.out.println("ERROR: retornarTodosRegistrosTablaAlumno(SQL)");
            }
        } else {
            System.out.println("ERROR: CONEXION");
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
