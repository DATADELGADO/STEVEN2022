package ejercicios;

import java.util.*;

public class MisEjercicios {
    
    public static void ejercicio11_1() {
        //ENTRADA
        double a = Entrada.entradaNumeroReal("Ingrese longitud cateto 1? ");
        double b = Entrada.entradaNumeroReal("Ingrese longitud cateto 2? ");
        //PROCESO
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        //double c =   Math.pow((Math.pow(a,2)+Math.pow(b,2)),0.5);
        //SALIDA
        System.out.println("Hipotenusa: " + ((int)(c*100))/100.0);
        System.out.printf("Hipotenusa: %-1.3f", c);
    }

    /*
    public static void ejercicio11_2() { //hayar la hipotenusa y mostrarle el resultado de sumarle 10
        Ejercicio11_2 objeto = new Ejercicio11_2(Entrada.entradaNumeroReal("Ingrese longitud cateto 1? "),
                                                 Entrada.entradaNumeroReal("Ingrese longitud cateto 2? "));
        
        double x = objeto.hipotenusa() + 10;
        
        
        System.out.println("Hipotenusa: " + objeto.hipotenusa());
        //objeto.mostrar();
        //objeto.motrarTodo();
    }
    
*/
    public static void ejercicio12_1() {
        List<Ejercicio12_1> objetos_al = new ArrayList<Ejercicio12_1>();
        //ENTRADA
        for (int i = 0; i < 100; i++) {
            int aleatorio = (int) (Math.random() * 7001 + 3000); //[3000, 10000]
            Ejercicio12_1 objeto = new Ejercicio12_1(aleatorio);
            objetos_al.add(objeto);
        }
        //RESULTADO
        System.out.printf("%4s%18s%10s%10s%10s\n", "N", "CANTIDAD SEGUNDOS", "HORAS", "MINUTOS", "SEGUNDOS");
        System.out.printf("%4s%18s%10s%10s%10s\n", "-", "-----------------", "-----", "-------", "--------");
        for (int i = 0; i < 100; i++) {
            Ejercicio12_1 objeto = objetos_al.get(i);
            int[] v = objeto.getCalculoAtributos();
            System.out.printf("%4d%18d%10d%10d%10d\n", (i + 1), objeto.getCantidadSegundos(),
                    v[0], v[1], v[2]);
        }
    }

    public static void ejercicio13_1() {
        List<Ejercicio13_1> lineasfacturas_al = new ArrayList<Ejercicio13_1>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            int cantidadCajas = Entrada.entradaNumeroEntero("Ingrese número de cajas? ");
            int unidadesxCaja = Entrada.entradaNumeroEntero("Ingrese unidades por caja? ");
            double precioxUnidad = Entrada.entradaNumeroReal("Ingrese precio por unidad? ");
            Ejercicio13_1 objeto = new Ejercicio13_1(cantidadCajas, unidadesxCaja, precioxUnidad);
            lineasfacturas_al.add(objeto);
        }

        System.out.printf("%10s%10s%15s%15s%10s%10s%10s\n", "N", "CAJAS", "UNIDADES/CAJA", "PRECION/UNIDAD", "IMPORTE", "IVA(21%)", "TOTAL");
        System.out.printf("%10s%10s%15s%15s%10s%10s%10s\n", "-", "-----", "-------------", "--------------", "-------", "--------", "-----");
        for (int i = 0; i < lineasfacturas_al.size(); i++) {
            Ejercicio13_1 objeto = lineasfacturas_al.get(i);
            double[] v = objeto.getCalculoAtributos();
            System.out.printf("%10d%10d%15d%15.2f%10.2f%10.2f%10.2f\n",
                    (i + 1),
                    objeto.getCantidadCajas(),
                    objeto.getUnidadesxCaja(),
                    objeto.getPrecioUnidad(),
                    v[0],
                    (v[1] - v[0]),
                    v[1]);
        }
    }

    public static void ejercicio13_2() {
        List<Ejercicio13_1> lineasfacturas_al = new ArrayList<Ejercicio13_1>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            int cantidadCajas = Entrada.entradaNumeroEntero("Ingrese número de cajas? ");
            int unidadesxCaja = Entrada.entradaNumeroEntero("Ingrese unidades por caja? ");
            double precioxUnidad = Entrada.entradaNumeroReal("Ingrese precio por unidad? ");
            Ejercicio13_1 objeto = new Ejercicio13_1(cantidadCajas, unidadesxCaja, precioxUnidad);
            lineasfacturas_al.add(objeto);
        }

        System.out.printf("%10s%10s%15s%15s%10s%10s%10s\n", "N", "CAJAS", "UNIDADES/CAJA", "PRECION/UNIDAD", "IMPORTE", "IVA(21%)", "TOTAL");
        System.out.printf("%10s%10s%15s%15s%10s%10s%10s\n", "-", "-----", "-------------", "--------------", "-------", "--------", "-----");
        for (int i = 0; i < lineasfacturas_al.size(); i++) {
            Ejercicio13_1 objeto = lineasfacturas_al.get(i);
            Retorno r = objeto.getCalculoAtributos1();
            System.out.printf("%10d%10d%15d%15.2f%10.2f%10.2f%10.2f\n",
                    (i + 1),
                    objeto.getCantidadCajas(),
                    objeto.getUnidadesxCaja(),
                    objeto.getPrecioUnidad(),
                    r.importe,
                    (r.total - r.importe),
                    r.total);
        }
    }

    public static void ejercicio14() {
        //ENTRADA
        double precioPagado = Entrada.entradaNumeroReal("Ingrese precio pagado? ");
        double precioTarifa = Entrada.entradaNumeroReal("Ingrese precio tarifa? ");
        //CALCULO
        double descuento = (1 - (precioPagado / precioTarifa)) * 100;
        //SALIDA
        System.out.println("Descuento : " + descuento + "%");
    }

    public static void ejercicio15_1() {
        //ENTRADA
        int cantidadPersonas = Entrada.entradaCantidadPersonas();
        double precioxkiloArroz = Entrada.entradaPrecioxkilo("Arroz");
        double precioxkiloGamba = Entrada.entradaPrecioxkilo("Gambas");
        //CALCULO
        double kilosArroz = cantidadPersonas / 8.0;
        double kilosGamba = cantidadPersonas / 16.0;
        double costoArroz = kilosArroz * precioxkiloArroz;
        double costoGamba = kilosGamba * precioxkiloGamba;
        //SALIDA
        System.out.println("Cantidad en kilos de Arroz: " + kilosArroz + " Kilos");
        System.out.println("Cantidad en kilos de Gamba: " + kilosGamba + " Kilos");
        System.out.println("Costo de Arroz: " + costoArroz + " \u20AC");
        System.out.println("Costo de Gamba: " + costoGamba + " \u20AC");
    }

    public static void ejercicio15_2() {

        List<Ejercicio15_2> comensales_al = new ArrayList<Ejercicio15_2>();

        for (int i = 0; i < 2; i++) {
            System.out.println("COMENSAL " + (i + 1) + ":");
            Ejercicio15_2 objeto = new Ejercicio15_2();
            objeto.setCantidadPersonas(Entrada.entradaCantidadPersonas());
            objeto.setPrecioxkiloArroz(Entrada.entradaPrecioxkilo("Arroz"));
            objeto.setPrecioxkiloGamba(Entrada.entradaPrecioxkilo("Gamba"));
            comensales_al.add(objeto);
        }

        System.out.printf("%10s%10s%10s%10s%10s%10s%10s%10s\n", "N", "CANT PERS", "PXKA", "PXKG", "CANT KA", "CANT KG", "COSTO A", "COSTO G");
        System.out.printf("%10s%10s%10s%10s%10s%10s%10s%10s\n", "-", "---------", "----", "----", "-------", "-------", "-------", "-------");
        for (int i = 0; i < comensales_al.size(); i++) {
            Ejercicio15_2 objeto = comensales_al.get(i);
            double[] v = objeto.getCalculoAtributos();
            System.out.printf("%10d%10d%10.2f%10.2f%10.2f%10.2f%10.2f%10.2f\n", (i + 1), objeto.getCantidadPersonas(),
                    objeto.getPrecioxkiloArroz(),
                    objeto.getPrecioxkiloGamba(),
                    v[0],
                    v[1],
                    v[2],
                    v[3]);
        }

    }

    public static void ejercicio16_1() {
        int a = 4;
        String r = (a % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println(r);
    }

    public static void ejercicio16_2() {
        int a = 4;
        System.out.println((a % 2 == 0) ? "PAR" : "IMPAR");
    }

    public static void ejercicio17_1() {
        int n = 1008;
        int semanas = n / 168;
        int rs = n % 168;
        int dias = rs / 24;
        int rd = rs % 24;
        int horas = rd;
        System.out.println(semanas + " Semanas");
        System.out.println(dias + " Días");
        System.out.println(horas + " Horas");
    }

    public static void ejercicio17_2() {
        int h = 1008;

        int semanas = h / 168;
        int dias = (h % 168) / 24;
        int horas = (h % 24);

        System.out.println(h + " horas equivalen a");
        System.out.println(semanas + " Semanas ");
        System.out.println(dias + " Días ");
        System.out.println(horas + " Horas ");
    }

    public static void ejercicio17_3() {
        System.out.printf("%5s%14s%10s%10s%10s\n", "N", "CANTIDAD H", "SEMANAS", "DIAS", "HORAS");
        System.out.printf("%5s%14s%10s%10s%10s\n", "-", "----------", "-------", "----", "-----");
        for (int i = 0; i < 100; i++) {
            int aleatorio = (int) (Math.random() * 4001 + 1000);   //[1000,5000]
            Ejercicio17_3 objeto = new Ejercicio17_3(aleatorio);
            int[] x = objeto.getSemanasDiasHoras();
            System.out.printf("%5d%14d%10d%10d%10d\n", (i + 1), aleatorio, x[0], x[1], x[2]);
        }
    }

}
