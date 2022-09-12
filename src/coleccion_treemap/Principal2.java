package coleccion_treemap;

import java.util.Map;
import java.util.TreeMap;

public class Principal2 {

    public static void main(String[] args) {
        String[] bd = {
            "10;04/01/2004;Parking;Venta;Lleida;299;2042768;06/10/2004;Joaquin",
            "1;01/01/2004;Parking;Alquiler;Lleida;291;2133903;19/06/2004;Carmen",
            "2;01/01/2004;Local;Venta;Girona;199;1945424;19/04/2004;Pedro",
            "3;01/01/2004;Oficina;Alquiler;Girona;82;712416;08/11/2004;Joaquin",
            "4;02/01/2004;Parking;Alquiler;Girona;285;1815450;27/04/2004;Jesus",
            "5;02/01/2004;Suelo;Venta;Tarragona;152;1138024;10/07/2004;Maria",
            "6;03/01/2004;Industrial;Alquiler;Girona;131;953156;05/09/2004;Pedro",
            "7;03/01/2004;Parking;Alquiler;Tarragona;69;406686;07/06/2004;Pedro",
            "8;03/01/2004;Oficina;Venta;Girona;235;2158475;31/10/2004;Jesus",
            "9;04/01/2004;Piso;Alquiler;Lleida;108;1024380;28/12/2004;Jesus",};

        TreeMap<Integer, String> inmobiliaria_tm = new TreeMap<Integer, String>();
        for (int i = 0; i < bd.length; i++) {
            inmobiliaria_tm.put((i+1), bd[i]);
        }
        System.out.printf("%12s%12s  %-12s\n", "REFERENCIA", "FECHA", "TIPO");
        for (Map.Entry m : inmobiliaria_tm.entrySet()) {
            String s = (String) m.getValue();
            String[] campo = s.split(";");
            if (campo[8].equalsIgnoreCase("Pedro")) {
                System.out.printf("%12s%12s  %-12s\n", m.getKey(), campo[1], campo[2]);
            }

            // System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("QUIERO MOSTRAR EL REGISTRO 10");
        System.out.println("-----------------------------");
        System.out.printf("%12s%12s  %-12s\n", "REFERENCIA", "FECHA", "TIPO");
        for (Map.Entry m : inmobiliaria_tm.entrySet()) {
            String s = (String) m.getValue();
            String[] campo = s.split(";");
            if (campo[0].equalsIgnoreCase("10")) {
                System.out.printf("%12s%12s  %-12s\n", m.getKey(), campo[1], campo[2]);
            }

            // System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("MOSTRAR TODOS LOS REGISTROS");
        System.out.printf("%12s%12s%12s  %-12s\n", "REFERENCIA","PROPIA", "FECHA", "TIPO");
        for (Map.Entry m : inmobiliaria_tm.entrySet()) {
            String s = (String) m.getValue();
            String[] campo = s.split(";");
            System.out.printf("%12s%12s%12s  %-12s\n", m.getKey(), campo[0], campo[1], campo[2]);
        }

    }

}




/*
1;01/01/2004;Parking;Alquiler;Lleida;291;2133903;19/06/2004;Carmen
2;01/01/2004;Local;Venta;Girona;199;1945424;19/04/2004;Pedro
3;01/01/2004;Oficina;Alquiler;Girona;82;712416;08/11/2004;Joaquin
4;02/01/2004;Parking;Alquiler;Girona;285;1815450;27/04/2004;Jesus
5;02/01/2004;Suelo;Venta;Tarragona;152;1138024;10/07/2004;Maria
6;03/01/2004;Industrial;Alquiler;Girona;131;953156;05/09/2004;Pedro
7;03/01/2004;Parking;Alquiler;Tarragona;69;406686;07/06/2004;Pedro
8;03/01/2004;Oficina;Venta;Girona;235;2158475;31/10/2004;Jesus
9;04/01/2004;Piso;Alquiler;Lleida;108;1024380;28/12/2004;Jesus
10;04/01/2004;Parking;Venta;Lleida;299;2042768;06/10/2004;Joaquin
 */
