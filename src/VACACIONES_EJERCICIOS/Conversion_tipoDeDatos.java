package VACACIONES_EJERCICIOS;

public class Conversion_tipoDeDatos {

    public static void main(String[] args) {
        /*
        // CONVERTIR DE STRING A ENTERO
        String a = "25";
        //int b = (int) a;
        int b = Integer.parseInt(a);
        
        b = b + 2;
        System.out.println(b);
         */

 /*
        // CONVERTIR DE STRING A DECIMAL
        String a = "25.52";
        //int b = (int) a;
        double b = Double.parseDouble(a);
        
        b = b + 2;
        System.out.println(b);
         */
 
 
  // CONVERTIR DE NUMERO O CUALQUIER TIPO DE DATO A STRING
        double a = 25.52;
        int b = 29;
        String c = String.valueOf(a) + String.valueOf(b);
        
        System.out.println(c + "hola como estas");
    }

}
