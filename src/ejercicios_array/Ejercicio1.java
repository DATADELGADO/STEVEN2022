package ejercicios_array;

public class Ejercicio1 {

    public static void main(String[] args) {
        String[] turno = {"M", "M", "M", "M", "T", "T", "T", "T"};
        String[] nombre = {"Luis", "Miguel", "Carlos", "Carmen", "Arturo", "Gerson", "Delly", "María"};
        double[] sueldo = {1000, 900, 800, 1210, 1000, 920, 850, 1500};
        double sueldom = 0;
        double sueldot = 0;
        for (int i = 0; i < turno.length; i++) {
            if (turno[i].equalsIgnoreCase("M")) {
                sueldom = sueldom + sueldo[i];
            }
            if (turno[i].equalsIgnoreCase("T")) {
                sueldot = sueldot + sueldo[i];
            }
        }
        System.out.println("Gasto Sueldo Mañana: " + sueldom + "\u20ac");
        System.out.println("Gasto Sueldo Tarde : " + sueldot + "\u20ac");
    }

}
