package wisl;

import java.util.List;

public class Colores {

    private List<Color> arrayColores;

    public Colores() {
    }

    public Colores(List<Color> arrayColores) {
        this.arrayColores = arrayColores;
    }


    public List<Color> getArrayColores() {
        return arrayColores;
    }

    public void setArrayColores(List<Color> arrayColores) {
        this.arrayColores = arrayColores;
    }

    @Override
    public String toString() {
        return "Colores{" + "arrayColores=" + arrayColores + '}';
    }
    
}
