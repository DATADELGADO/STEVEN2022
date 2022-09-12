package cadena;

public class Cadena {

    public static void main(String[] args) {
        {//1
            String cadena = "Hola Mundo";
            System.out.println(cadena.charAt(5)); //M
        }

        {//2
            String cadena1 = "Luis";
            String cadena2 = "luis";
            if (cadena1.equals(cadena2)) {
                System.out.println("TIENEN EL MISMO VALOR");
            } else {
                System.out.println("NO TIENEN EL MISMO VALOR");
            }
        }

        {//3
            String cadena1 = "Luis";
            String cadena2 = "luis ";
            if (cadena1.equalsIgnoreCase(cadena2)) {
                System.out.println("TIENEN EL MISMO VALOR");
            } else {
                System.out.println("NO TIENEN EL MISMO VALOR");
            }
        }

        {//4
            String cadena1 = "Luis".trim();
            String cadena2 = "luis       ".trim();
            if (cadena1.equalsIgnoreCase(cadena2)) {
                System.out.println("TIENEN EL MISMO VALOR");
            } else {
                System.out.println("NO TIENEN EL MISMO VALOR");
            }
        }

        {//5
            String cadena1 = "Luis".trim().toLowerCase();
            String cadena2 = "luis       ".trim().toLowerCase();
            if (cadena1.equals(cadena2)) {
                System.out.println("TIENEN EL MISMO VALOR");
            } else {
                System.out.println("NO TIENEN EL MISMO VALOR");
            }
        }

        {//6
            String cadena = "Luis".trim().toLowerCase();
            int x = cadena.codePointAt(0);
            System.out.println(x); //Obtener el código unicode de un caracter
            System.out.println("2345 \u20AC"); //Mostrar un caracter a partir de su código unicode
        }

    }

}


