package archivo_texto_concesionario;

public class Coche {

    private int idCoche;
    private String color;
    private String marca;
    private double kilometraje;

    public Coche() {
    }

    public Coche(int idCoche, String color, String marca, double kilometraje) {
        this.idCoche = idCoche;
        this.color = color;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    public int getIdCoche() {
        return idCoche;
    }

    public void setIdCoche(int idCoche) {
        this.idCoche = idCoche;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Coche{" + "idCoche=" + idCoche + ", color=" + color + ", marca=" + marca + ", kilometraje=" + kilometraje + '}';
    }

    public void imprimirTabla() {
        System.out.printf("%7d  %-10s  %-15s  %12.3f\n", idCoche, color, marca, kilometraje);
    }

    public void imprimirTabla1() {
        System.out.printf("%7d  %-10s  %-10s  %-15s  %12.3f\n", idCoche, color, getCodigoRGBAtributoColor(), marca, kilometraje);
    }

    public String getCodigoRGBAtributoColor() {
        String rgb = "";
        switch (this.color) {
            case "Blanco":
                rgb = "FFFFFF";
                break;
            case "Amarillo":
                rgb = "FFFF00";
                break;
            case "Negro":
                rgb = "000000";
                break;
            case "Rojo":
                rgb = "FF0000";
                break;
            case "Verde":
                rgb = "00FF00";
                break;
            case "Azul":
                rgb = "0000FF";
                break;
        }
        return rgb;
    }

}
