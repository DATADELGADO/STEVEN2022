package autor_libro;

public class BD {
    
    private Libro[] vLibro;
    private Autor[] vAutor;

    public BD() {
    }

    public BD(Libro[] vLibro, Autor[] vAutor) {
        this.vLibro = vLibro;
        this.vAutor = vAutor;
    }

    public Libro[] getvLibro() {
        return vLibro;
    }

    public void setvLibro(Libro[] vLibro) {
        this.vLibro = vLibro;
    }

    public Autor[] getvAutor() {
        return vAutor;
    }

    public void setvAutor(Autor[] vAutor) {
        this.vAutor = vAutor;
    }

    @Override
    public String toString() {
        return "bd{" + "vLibro=" + vLibro + ", vAutor=" + vAutor + '}';
    }
    
    
    
}
