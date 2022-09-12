package llamar_metodo;

import java.sql.Date;

public class Principal {

    public static void main(String[] args) {
        double n1 = 45.3;
        double n2 = 10;
        double r = sumar1(n1, n2);//Memoria RAM
        System.out.println("Suma: " + r);
        System.out.println("Suma: " + sumar1(n1, n2));
        sumar2(n1, n2);
        System.out.println("Suma: " + MisMetodos.sumar2(n1, n2));
        System.out.println("Suma: " + libreria.MisMetodos.sumar3(n1, n2));
        MisMetodos.sumar21(n1, n2);
        libreria.MisMetodos.sumar21(n1, n2);
        ejercicio17();
    }

    public static double sumar1(double a, double b) {
        return a + b;
    }

    public static void sumar2(double n1, double n2) {
        System.out.println("Suma: " + (n1 + n2));
    }

    //mayor = (vble1 > vble2)?vble1:vble2;
    public static void ejercicio16() {
        int a = 4;
        String r = (a % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println(r);
        System.out.println((a % 2 == 0) ? "PAR" : "IMPAR");
    }

    public static void ejercicio17() {
        int n = 2000;
        int semanas = n/168;
        int rs = n%168;
        int dias = rs/24;
        int rd = rs%24;
        int horas = rd;
        System.out.println(semanas + " Semanas");
        System.out.println(dias + " Días");
        System.out.println(horas + " Horas");
        
        /*
        String r = (a % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println(r);
        System.out.println((a % 2 == 0) ? "PAR" : "IMPAR");
*/
    }

}
