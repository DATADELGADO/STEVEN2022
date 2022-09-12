package VACACIONES_EJERCICIOS;

public class Truncar_decimales {

    public static void main(String[] args) {
        double c = 25.55225251;
        double a = ((int)(c*100))/100.0;
       System.out.println(((int) (c * 100)) / 100.0);
        System.out.println(a);
        System.out.printf("Hipotenusa: %-1.3f", c);
        System.out.println(c);
    }

}
