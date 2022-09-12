package wisl;

public class Color {

    private String nombreColor;
    private String valorHexadec;

    public Color() {
    }

    public Color(String nombreColor, String valorHexadec) {
        this.nombreColor = nombreColor;
        this.valorHexadec = valorHexadec;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }

    public String getValorHexadec() {
        return valorHexadec;
    }

    public void setValorHexadec(String valorHexadec) {
        this.valorHexadec = valorHexadec;
    }

    @Override
    public String toString() {
        return "Color{" + "nombreColor=" + nombreColor + ", valorHexadec=" + valorHexadec + '}';
    }
    
}
