package bucle_while;

import java.util.Scanner;

public class SerieNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ca;
        
        do { //si quiero volver a repetir algo (test al final)
            System.out.print("Ingrese la cadena: ");
            ca = sc.nextLine(); //Controla el retorno de carro
            System.out.println("Longitud: " + ca.length());
            if (ca.length() > 0) {//1
                for (int i = 0; i < ca.length(); i++) {
                    if (i % 2 == 0) {
                        System.out.print(ca.charAt(i));
                    }
                }
            } else {
                System.out.println("DEBE INGRESAR UNA CADENA");
            }
        }while(ca.length() <= 0);//0 <= 0 VERDADER SE REPITE Y FALSO SALE
    }
}

