package fecha_hora;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        {
            System.out.println("(001) MOSTRAR CUANTOS AÑOS,MESES Y DIAS A PARTIR DE LA FECHA DE NACIMIENTO");
            System.out.println("--------------------------------------------------------------------------");
            String fechaNacimiento = "1969-02-11";
            int[] parte = Principal.getCantidadAniosMesesDiasApartirFechaNacimiento(fechaNacimiento);
            System.out.println("Años  : " + parte[0]);
            System.out.println("Meses : " + parte[1]);
            System.out.println("Dias  : " + parte[2]);
        }

        {
            System.out.println("(002) MOSTRAR CUANTOS AÑOS,MESES Y DIAS HAY ENTRE DOS FECHAS");
            System.out.println("------------------------------------------------------------");
            String fechaInicio = "2022-07-07";
            String fechaFin = "2022-07-12";
            int[] parte = Principal.getCantidadAniosMesesDiasApartirDosFechas(fechaInicio, fechaFin);
            System.out.println("Años  : " + parte[0]);
            System.out.println("Meses : " + parte[1]);
            System.out.println("Dias  : " + parte[2]);
        }

        {
            System.out.println("(003) MOSTRAR NUMERO DE DIAS ENTRE DOS FECHAS");
            System.out.println("---------------------------------------------");
            String fechaInicio = "2022-07-07";
            String fechaFin = "2022-07-12";
            long dias = Principal.getNumeroDiasEntreDosFechas(fechaInicio, fechaFin);
            System.out.println("Número de días : " + dias);
        }
    }

    public static int[] getCantidadAniosMesesDiasApartirFechaNacimiento(String fechaNacimiento) { //El método tiene como entrada una fecha en el formato yyyy-MM-dd
        LocalDate ldInicio = getObjetoLocalDate(fechaNacimiento);
        LocalDate ldFin = LocalDate.now();
        Period p = Period.between(ldInicio, ldFin);
        int[] aniosMesesDias = {p.getYears(), p.getMonths(), p.getDays()};
        return aniosMesesDias;
    }

    public static int[] getCantidadAniosMesesDiasApartirDosFechas(String fechaInicio, String fechaFin) { //El método tiene como entrada una fecha en el formato yyyy-MM-dd
        LocalDate ldInicio = getObjetoLocalDate(fechaInicio);
        LocalDate ldFin = getObjetoLocalDate(fechaFin);
        Period p = Period.between(ldInicio, ldFin);
        int[] aniosMesesDias = {p.getYears(), p.getMonths(), p.getDays()};
        return aniosMesesDias;
    }

    public static LocalDate getObjetoLocalDate(String fecha) {//fecha="2010-10-15"
        String[] parte = fecha.split("-");
        LocalDate ld = LocalDate.of(Integer.parseInt(parte[0]), Integer.parseInt(parte[1]), Integer.parseInt(parte[2]));
        return ld;
    }

    public static long getNumeroDiasEntreDosFechas(String fechaInicio, String fechaFin) { //Entrada = yyyy-MM-dd
        LocalDate ldInicio = getObjetoLocalDate(fechaInicio);
        LocalDate ldFin = getObjetoLocalDate(fechaFin);
        long dias = DAYS.between(ldInicio, ldFin);
        return dias;
    }

    public static int getMayorMenorIgualEntreDosFechas1(String fecha1, String fecha2) {//Entrada = yyyy-MM-dd
        int numero = -1;
        LocalDate ldFecha1 = LocalDate.parse(fecha1);
        LocalDate ldFecha2 = LocalDate.parse(fecha2);

        if (ldFecha1.isEqual(ldFecha2)) {//ficha1=fecha2
            numero = 1;
        } else if (ldFecha1.isAfter(ldFecha2)) {//fecha1>fecha2
            numero = 2;
        } else if (ldFecha1.isBefore(ldFecha2)) {//fecha1<fecha2
            numero = 3;
        }
        return numero;
    }

    public static String getFechaAleatoriaEntreUnRangoDeFechas(String fechaInicio, String fechaFin) {//El formato entrada de la fecha yyyy-MM-dd
        Calendar calendarI = Calendar.getInstance();
        Calendar calendarF = Calendar.getInstance();
        long rango1 = calendarI.getTimeInMillis();
        long rango2 = calendarI.getTimeInMillis();
        long n = rango2 - (rango1 - 1);
        long aleatorio = (long) (Math.random() * n + rango1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//El formato salida de la fecha
        String fechaAleatoria = sdf.format(aleatorio);
        return fechaAleatoria;
    }

    public static Calendar getObjetoCalendar(String fecha) {
        Calendar calendar = Calendar.getInstance();
        String[] p = fecha.split("-");
        calendar.set(Integer.parseInt(p[0]), Integer.parseInt(p[1]) - 1, Integer.parseInt(p[2]));
        return calendar;
    }

    public String getMesApartirDeUnaFecha(String fecha) {//El formato entrada de la fecha yyyy-MM-dd
        LocalDate f = getObjetoLocalDate(fecha);
        String mes = f.getMonth().toString();
        Map<String, String> meses_lkv = new HashMap<String, String>(); //Lista clave valor
        meses_lkv.put("JANUARY", "Enero");
        meses_lkv.put("FEBRUAY", "Febrero");
        meses_lkv.put("MARCH", "Marzo");
        meses_lkv.put("APRIL", "Abril");
        meses_lkv.put("MAY", "Mayo");
        meses_lkv.put("JUNE", "Junio");
        meses_lkv.put("JULY", "Julio");
        meses_lkv.put("AUGUST", "Agosto");
        meses_lkv.put("SEPTEMBER", "Septiembre");
        meses_lkv.put("OCTOBER", "Octubre");
        meses_lkv.put("NOVEMBER", "Noviembre");
        meses_lkv.put("DECEMBER", "Diciembre");
        return meses_lkv.get(mes);
    }

    public String getDiaDeLaSemanaApartirDeUnaFecha(String fecha) {//El formato entrada de la fecha yyyy-MM-dd
        LocalDate f = getObjetoLocalDate(fecha);
        String diaSemana = f.getDayOfWeek().toString();
        Map<String, String> diassemana_lkv = new HashMap<String, String>(); //Lista clave valor
        diassemana_lkv.put("MONDAY", "Lunes");
        diassemana_lkv.put("TUESDAY", "Martes");
        diassemana_lkv.put("WEDNESDAY", "Miercoles");
        diassemana_lkv.put("THURSDAY", "Jueves");
        diassemana_lkv.put("FRIDAY", "Viernes");
        diassemana_lkv.put("SATURDAY", "Sabado");
        diassemana_lkv.put("SUNDAY", "Domingo");
        return diassemana_lkv.get(diaSemana);
    }

    public static boolean esBisiesto(String fecha) {//El formato entrada de la fecha yyyy-MM-dd
        String[] p = fecha.split("-");
        int anio = Integer.parseInt(p[0]);
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<String> getListaFechasDiaPorDiaApartirDeDosFechas(String fechaInicio, String fechaFin) {//El formato entrada de la fecha yyyy-MM-dd
        List<String> fechas_al = new ArrayList<String>();
        Calendar calendarI = getObjetoCalendar(fechaInicio);
        Calendar calendarF = getObjetoCalendar(fechaFin);
        long x1 = calendarI.getTimeInMillis();
        long x2 = calendarF.getTimeInMillis();

        long aux;

        if (x2 < x1) {
            aux = x1;
            x1 = x2;
            x2 = aux;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//El formato salida de la fecha

        int k = 0;
        for (long i = x1; i <= x2; i = i + (24 * 60 * 60 * 1000)) {
            String f = sdf.format(i);
            fechas_al.add(k++, f);
        }
        return fechas_al;
    }

}
