package json;

public class Nota {

    private int examen;
    private String fecha;

    public Nota() {
    }

    public Nota(int examen, String fecha) {
        this.examen = examen;
        this.fecha = fecha;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Nota{" + "examen=" + examen + ", fecha=" + fecha + '}';
    }
    
    
}
