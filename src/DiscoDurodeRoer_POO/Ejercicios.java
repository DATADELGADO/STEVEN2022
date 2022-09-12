package DiscoDurodeRoer_POO;

import libreria.MisMetodos_1;

public class Ejercicios {

    public static void Ejercicio_38() {
        
        Dado[] dado = new Dado[MisMetodos_1.aleatorioGeneral()];
        System.out.println("HAY " + dado.length + " DADOS");
        System.out.println("-------------");
        System.out.println();

        for (int i = 0; i < dado.length; i++) {
            dado[i] = new Dado(MisMetodos_1.aleatorioGeneral());
            System.out.println("DADO #" + (i + 1) + ": " + dado[i].getNumCaras() + " CARAS");
            System.out.println("TIRAR DADO 1 VEZ: " + dado[i].tirarDado());
            System.out.println("TIRAR DADO N VECES");
            int[] x = dado[i].tirarDadoNveces(4);
            for (int j = 0; j < x.length; j++) {
                System.out.println("INTENTO #" + (j + 1) + ": " + x[j]);
            }
            System.out.println();
        }
        //dado[0] = new Dado(6);
        //dado[1] = new Dado(10);

        //int x = dado[1].tirarDado();
        //System.out.println(x);
        /*
        int[] j = dado[1].tirarDadoNveces(3);
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
        }
         
 /*
        double puntaje1 = 0;
        double puntaje2 = 0;

        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(6);
        for (int i = 0; i < 10; i++) {
            int jugador1 = dado1.tirarDado();
            int jugador2 = dado2.tirarDado();
            System.out.println("INTENTO #" + (i + 1));
            System.out.println("JUGADOR 1 SACÓ: " + jugador1);
            System.out.println("JUGADOR 2 SACÓ: " + jugador2);
            if (jugador1 > jugador2) {
                puntaje1 = puntaje1 + 1;
            }
            if (jugador1 < jugador2) {
                puntaje2 = puntaje2 + 1;
            }
            if (jugador1 == jugador2) {
                puntaje1 = puntaje1 + 0.5;
                puntaje2 = puntaje2 + 0.5;

            }

        }
        System.out.println("PUNTAJE DEL JUGADOR 1: " + puntaje1);
        System.out.println("PUNTAJE DEL JUGADOR 2: " + puntaje2);
        if (puntaje1 > puntaje2) {
            System.out.println("EL GANADOR ES EL JUGADOR 1");
        }
        if (puntaje1 < puntaje2) {
            System.out.println("EL GANADOR ES EL JUGADOR 2");
        }
        if (puntaje1 > puntaje2) {
            System.out.println("HUBO UN EMPATE");
        }
         */
    }
}
