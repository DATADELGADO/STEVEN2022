package ejercicios_array;

public class Ejercicio6_2_Clase {

    private String calle;
    private int portales;
    private int[] habitantes;

    public Ejercicio6_2_Clase() {
    }

    public Ejercicio6_2_Clase(String calle, int portales, int[] habitantes) {
        this.calle = calle;
        this.portales = portales;
        this.habitantes = habitantes;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getPortales() {
        return portales;
    }

    public void setPortales(int portales) {
        this.portales = portales;
    }

    public int[] getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int[] habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Ejercicio6_2_Clase{" + "calle=" + calle + ", portales=" + portales + ", habitantes=" + habitantes + '}';
    }

    public int obtenerTotalHabitantesCalle() {
        int total = 0;
        for (int i = 0; i < habitantes.length; i++) {
            total = total + habitantes[i];
        }
        return total;
    }

    public static void cabecera() {
        System.out.printf("%-10s  %-10s  %-17s  %-22s\n", "CALLE", "NºPORTALES", "HABITANTES/PORTAL", "TOTAL HABITANTES/CALLE");
        System.out.printf("%-10s  %-10s  %-17s  %-22s\n", "-----", "----------", "-----------------", "----------------------");
    }

    public String obtenerNumeroHabitantesCadaCalleConcatenado() {
        String s = "";
        for (int i = 0; i < habitantes.length; i++) {
            s = s + habitantes[i] + " ";
        }
        return s;
    }

}
