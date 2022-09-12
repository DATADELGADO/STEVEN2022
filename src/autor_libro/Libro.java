package autor_libro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Libro {

    private int idLibro;
    private String titulo;
    private String descripcion;
    private int nroPaginas;
    private int idAutor;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, String descripcion, int nroPaginas, int idAutor) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nroPaginas = nroPaginas;
        this.idAutor = idAutor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", titulo=" + titulo + ", descripcion=" + descripcion + ", nroPaginas=" + nroPaginas + ", idAutor=" + idAutor + '}';
    }

    public static void cabecera() {
        System.out.printf("%-8s  %-25s%-15s%8s%8s\n", "IDLIBRO", "TITULO", "DESCRIPCION", "NºPAGINA", "IDAUTOR");
        System.out.printf("%-8s  %-25s%-15s%8s%8s\n", "-------", "------", "-----------", "--------", "-------");
    }

    public void imprimir() {
        System.out.printf("%-8d  %-25s%-15s%8d%8d\n", idLibro, titulo, descripcion, nroPaginas, idAutor);
    }

    public void escribirArchivoCsv() {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File("datos/resumen.csv");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(idLibro+";"+titulo+";"+descripcion+";"+nroPaginas+";"+idAutor+"\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
