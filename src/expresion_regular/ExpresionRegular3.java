package expresion_regular;

import java.util.Scanner;

public class ExpresionRegular3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8);
        String snombre;
        String ern = "[a-z,A-Z,\u00F1\u00D1]+";
        boolean nombreValido;
        //ENTRADA NOMBRE
        do {
            System.out.print("Ingrese nombre:");
            snombre = sc.next().trim();
            nombreValido = snombre.matches(ern);
            if (!nombreValido) {
                System.out.println("Nombre error");
            }
        } while (!nombreValido);
        System.out.println(snombre + " OK");
    }

}
