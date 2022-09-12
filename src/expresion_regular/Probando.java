package expresion_regular;

import java.util.Scanner;

public class Probando {

    public static void main(String[] args) {
        String si = "En españa se aprecia modernidad, pero españa también es segura";
        String er = "españa";
        String sf = si.replaceAll(er, "España");
        System.out.println("Antes   : " + si);
        System.out.println("Después : " + sf);
    }
}
