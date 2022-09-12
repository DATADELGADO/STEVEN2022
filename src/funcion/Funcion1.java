package funcion;

import libreria.MisMetodos;

public class Funcion1 {

    public static void main(String[] args) {
        //Construir una función que convierta centigrados a farenhite y viceversa
        double c = MisMetodos.entrada();
        System.out.print("F: " + MisMetodos.convertirCF(c));
    }
}
