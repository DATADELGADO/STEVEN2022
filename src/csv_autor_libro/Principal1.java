package csv_autor_libro;

import autor_libro.Autor;
import autor_libro.Libro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal1 {

    public static void main(String[] args) {
        List<Autor> autores_al = new ArrayList<Autor>();
        List<Libro> libros_al = new ArrayList<Libro>();
        File f;
        FileReader fr;
        BufferedReader br;
        String registro = "";
        try {
            //AUTOR
            f = new File("datos/autor.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {
                String[] c = registro.split(";");
                Autor autor = new Autor(Integer.parseInt(c[0]),
                        c[1], c[2], Integer.parseInt(c[3]));
                autores_al.add(autor);
                //autores_al.add(new Autor(Integer.parseInt(c[0]),c[1],c[2],Integer.parseInt(c[3])));
            };
            //LIBRO
            f = new File("datos/libro.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] c = registro.split(";");
                Libro libro = new Libro(Integer.parseInt(c[0]),
                        c[1], c[2],
                        Integer.parseInt(c[3]),
                        Integer.parseInt(c[4]));
                libros_al.add(libro);
                //autores_al.add(new Autor(Integer.parseInt(c[0]),c[1],c[2],Integer.parseInt(c[3])));
            };
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println();
        System.out.println("1. MOSTRAR TODOS REGISTROS DE LA TABLA LIBRO");
        System.out.println("============================================");
        System.out.println();

        Libro.cabecera();
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libro = libros_al.get(i);
            libro.imprimir();
        }
        System.out.println();
        System.out.println("2. MOSTRAR TODOS LOS LIBROS DE PROGRAMACION");
        System.out.println("===========================================");
        System.out.println();

        Libro.cabecera();
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libro = libros_al.get(i);
            if (libro.getDescripcion().equalsIgnoreCase("ProgRamaciÓn")) {
                libro.imprimir();
            }
        }
        System.out.println();
        System.out.println("3. MOSTRAR TODOS LOS AUTORES DE LIBROS DE PROGRAMACION");
        System.out.println("======================================================");
        System.out.println();

        Set<Integer> autores_ts = new TreeSet<Integer>();
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libros = libros_al.get(i);
            if (libros.getDescripcion().equalsIgnoreCase("Programación")) {
                int idAutor = libros.getIdAutor();
                autores_ts.add(idAutor);
            }
        }
        List<Integer> identificadoresautores_al = new ArrayList<Integer>(autores_ts);
        Autor.cabecera();
        //FORMA 1
        for (int i = 0; i < identificadoresautores_al.size(); i++) {
            for (Autor a : autores_al) {
                if (a.getIdAutor() == identificadoresautores_al.get(i)) {
                    a.imprimir();
                    break;
                }
            }
        }
        //FORMA 2
        for (int i = 0; i < identificadoresautores_al.size(); i++) {
            for (int j = 0; j < autores_al.size(); j++) {
                Autor a = autores_al.get(j);
                if (a.getIdAutor() == identificadoresautores_al.get(i)) {
                    a.imprimir();
                    break;
                }
            }
        }
        //FORMA 3
        for (Integer id : identificadoresautores_al) {//1, 2
            for (Autor a : autores_al) {
                if (a.getIdAutor() == id) {
                    a.imprimir();
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("4. MOSTRAR TODOS LOS LIBROS DE JAVA");
        System.out.println("===================================");
        System.out.println();

        Libro.cabecera();
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libro = libros_al.get(i);
            String titulo = libro.getTitulo();
            String[] c = titulo.split(" ");//Introducción A Java8
            String er = "java";
            String er1 = "[0-9]+";//9,28,111,1234,8
            for (int j = 0; j < c.length; j++) {
                String sf = c[j].replaceAll(er1, "").trim().toLowerCase();
                if (sf.equalsIgnoreCase("c#")) {
                    libro.imprimir();
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("5. MOSTRAR TODOS LOS LIBROS DE C#");
        System.out.println("=================================");
        System.out.println();

        int k = 1;
        boolean bandera = false;
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libro = libros_al.get(i);
            String titulo = libro.getTitulo();
            String[] c = titulo.split(" ");//Introducción A Java8
            String er = "java";
            String er1 = "[0-9]+";//9,28,111,1234,8
            for (int j = 0; j < c.length; j++) {
                String sf = c[j].replaceAll(er1, "").trim().toLowerCase();
                if (sf.equalsIgnoreCase("c#")) {
                    bandera = true;
                    if (k == 1) {
                        Libro.cabecera();
                        k++;
                    }
                    libro.imprimir();
                    break;
                }
            }
        }
        if (bandera == false) {
            System.out.println("NO EXISTE LIBROS DE C#");
        }

        System.out.println();
        System.out.println("6. RECOMENDAR LIBROS RELACIONADOS A JAVA");
        System.out.println("========================================");
        System.out.println();

        int k1 = 1;
        boolean bandera1 = false;
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libro = libros_al.get(i);
            String titulo = libro.getTitulo();
            String[] c = titulo.split(" ");//Introducción A Java8
            String er1 = "[0-9]+";//9,28,111,1234,8
            for (int j = 0; j < c.length; j++) {
                String sf = c[j].replaceAll(er1, "").trim().toLowerCase();
                if (sf.equalsIgnoreCase("java")) {
                    bandera1 = true;
                    if (k1 == 1) {
                        Libro.cabecera();
                        k1++;
                    }
                    libro.imprimir();
                    break;
                }
            }
        }
        if (bandera == true) {
            System.out.println("TE RECOMENDAMOS LIBROS RELACIONADOS A JAVA");
            System.out.println("==========================================");
            Libro.cabecera();
            for (int i = 0; i < libros_al.size(); i++) {
                Libro libro = libros_al.get(i);
                String titulo = libro.getTitulo().trim().toLowerCase();
                String subcadena = "javascript";
                boolean x = titulo.contains(subcadena);
                if (x == true) {
                    libro.imprimir();
                }
            }
        }

        System.out.println();
        System.out.println("7. CREAR UN ARCHIVO RESUMEN.CSV TODOS LOS LIBROS PROGRAMACION");
        System.out.println("=============================================================");
        System.out.println();

        boolean bandera7 = false;
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libro = libros_al.get(i);
            if (libro.getDescripcion().equalsIgnoreCase("Programación")) {
                libro.escribirArchivoCsv();
                bandera7 = true;
            }
        }
        if(bandera == false) {
            System.out.println("NO EXISTEN LIBROS DE PROGRAMACION PARA ESCRIBIR ARCHIVO CSV");
        }else {
            System.out.println("OK ESCRITURA");
        }

    }
}
/*
c[0] = Tutorial
c[1] = Java9
 */
