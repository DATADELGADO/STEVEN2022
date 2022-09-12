package libreria;

import POSTGRESQL.SelectFormatoFecha;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MisMetodos_1 {

    public static String entradaGeneralDevolucionString(String a) {
        System.out.print(a);
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8);

        return sc.nextLine();
    }

    public static double entradaGeneral(String a) {
        System.out.print(a);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static int aleatorio() {
        return (int) (Math.random() * 7001 + 3000);

    }

    public static int aleatorioGeneral() {
        return (int) (Math.random() * 10 + 1);

    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static String getFechaConFormato(String fechaEntrada) {
        SimpleDateFormat sdE = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdS = new SimpleDateFormat("dd/MM/yyyy");
        String fechaSalida = "";
        java.util.Date p = null;
        try {
            p = sdE.parse(fechaEntrada);
            long milis_fe = p.getTime();
            fechaSalida = sdS.format(milis_fe);
        } catch (ParseException ex) {
            Logger.getLogger(SelectFormatoFecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaSalida;

    }

}
