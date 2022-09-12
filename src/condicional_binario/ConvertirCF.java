package condicional_binario;

import java.util.Scanner;

/**
 *
 * @author Curso Mañana
 */
public class ConvertirCF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        //Scanner sc1 = new Scanner(System.in);
        int r;
        int r1;
        double fahrenheit, celsius;
        boolean bandera = false;

        do {
            System.out.print("Qué conversión desea realizar (1)Cº to Fº, (2)Fº to Cº?: ");
            r = sc.nextInt();

            if (r == 1) {
                System.out.println("Convertir Cº to Fº");
                System.out.println("Ingrese Cº: ");
                //celsius = sc1.nextDouble();
                celsius = sc.nextDouble();
                //farenheit = (9/5)* celsius + 32;
                fahrenheit = (1.8 * celsius) + 32;
                System.out.println("Fº: " + fahrenheit);
            }

            if (r == 2) {
                System.out.println("Convertir Fº to Cº");
                System.out.println("Ingrese Fº: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) / 1.8;
                //System.out.println("Cº: " + celsius);
                System.out.println("Cº: " + Math.round(celsius * 100.0) / 100.0);
            }
            if (r != 2 && r != 1) {
                System.out.println("Ha ingresado un valor incorrecto");
            }

            System.out.print("Desea continuar: Si? Presione 1, No? Presione 2: ");
            r1 = sc.nextInt();
            if (r1 == 1) {
                bandera = true;
            } else {
                System.out.println("Gracias por utilizar el conversor");
                //bandera = false;
                break;
            }

        } while (bandera);
    }
    
  
    public int funcion() {
        return 5;
    }

}
