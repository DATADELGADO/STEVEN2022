package ejercicios_array;

import ejercicios.Entrada;
import static fecha_hora.Principal.getObjetoLocalDate;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadObreros = Entrada.entradaNumeroEntero("Cantidad Obreros? ");

        String[][] matriz = new String[cantidadObreros][];

        String nombre;
        String fecha;
        String horas;
        String dias;
        
        int mayor = -99999;
        int posicion = -1;

        for (int i = 0; i < cantidadObreros; i++) {
            System.out.println("Obrero " + (i + 1) + ":");
            System.out.print("Ingrese nombre? ");
            nombre = sc.next();
            System.out.print("Ingrese fecha? ");
            fecha = sc.next();
            dias = String.valueOf(getNumeroDiasEntreDosFechas("2022-07-08", fecha));
            System.out.print("Ingrese horas? ");
            horas = sc.next();
            matriz[i] = new String[]{nombre,dias,horas};
            if(Integer.parseInt(dias) > mayor) {
                mayor = Integer.parseInt(dias);
                posicion = i;
            }
        }
        for(String[] r: matriz) {
            for(String x: r) {
               System.out.print(x + "   ");
            }
            System.out.println();
        }
        
        String[] a = matriz[posicion];
        for(String x: a) {
           System.out.print(x + "  ");
        }
        

    }

    public static long getNumeroDiasEntreDosFechas(String fechaInicio, String fechaFin) { //Entrada = yyyy-MM-dd
        LocalDate ldInicio = getObjetoLocalDate(fechaInicio);
        LocalDate ldFin = getObjetoLocalDate(fechaFin);
        long dias = DAYS.between(ldInicio, ldFin);
        return dias;
    }

    public static LocalDate getObjetoLocalDate(String fecha) {//fecha="2010-10-15"
        String[] parte = fecha.split("-");
        LocalDate ld = LocalDate.of(Integer.parseInt(parte[0]), Integer.parseInt(parte[1]), Integer.parseInt(parte[2]));
        return ld;
    }

}

/*
Scanner sc = new Scanner(System.in);
        int cantidadObreros = Entrada.entradaNumeroEntero("Cantidad Obreros? ");

        String[][] matriz = new String[cantidadObreros][];

        String nombre = new String[cantidadObreros];
        String fecha = new String[cantidadObreros];//12a07/2022
        String horas = new int[cantidadObreros];

        for (int i = 0; i < cantidadObreros; i++) {
            System.out.println("Obrero " + (i + 1) + ":");
            System.out.print("Ingrese nombre? ");
            nombre = sc.next();
            System.out.print("Ingrese fecha? ");
            fecha = sc.next();
            dias = getNumeroDiasEntreDosFechas("2022-07-08", fecha);
            try {
                long dias = getNumeroDiasEntreDosFechas("2022-07-08", fecha);
            } catch (Exception e) {
                System.out.println("ERROR: ENTRADA INCORRECTA");
            }
            horas[i] = Entrada.entradaNumeroEntero("Ingrese horas? ");
        }
*/