package ejercicios_array;

import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;
import sql_alumno3.Entrada;

public class Ejercicio5_1 {

    public static void main(String[] args) {
        int cantidadObreros = Entrada.entradaNumeroEntero("Ingrese cantidad obreros? ");
        String[] nombre = new String[cantidadObreros];
        int[] horas = new int[cantidadObreros];
        long[] dias = new long[cantidadObreros];
        boolean bandera = false;
        try {
            for (int i = 0; i < cantidadObreros; i++) {
                String nom = Entrada.entradaCadena("Ingrese nombre? ");
                String fec = libreria.Entrada.entradaCadena("Ingrese fecha? ");
                long dia = obtenerNumeroDias(fec);
                int hor = Entrada.entradaNumeroEntero("Ingrese horas? ");
                nombre[i] = nom;
                dias[i] = dia;
                horas[i] = hor;
            }
        } catch (Exception e) {
            System.out.println("ERROR: ENTRADA DE DATOS");
            bandera = true;
        }
        if (bandera == false) {
            int mayor = -99999;
            int posicion = 0;
            for (int i = 0; i < cantidadObreros; i++) {
                if (horas[i] > mayor) {
                    mayor = horas[i];
                    posicion = i;
                }
            }
            System.out.println(nombre[posicion] + "  " + dias[posicion] + "  " + horas[posicion]);
        }

    }

    public static long obtenerNumeroDias(String fechaFin) {//2022-07-12
        LocalDate ldInicio = obtenerObjetoLocalDate("2022-07-08");
        LocalDate ldFin = obtenerObjetoLocalDate(fechaFin);
        long dias = DAYS.between(ldInicio, ldFin);
        return dias;
    }

    public static LocalDate obtenerObjetoLocalDate(String fechaFin) {
        String[] c = fechaFin.split("-");
        LocalDate ld = LocalDate.of(Integer.parseInt(c[0]),
                Integer.parseInt(c[1]),
                Integer.parseInt(c[2]));
        return ld;
    }

}
