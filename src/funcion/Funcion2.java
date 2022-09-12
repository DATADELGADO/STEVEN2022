package funcion;

import libreria.MisMetodos;

public class Funcion2 {

    public static void main(String[] args) {
        //Implementar un método que reciba un vector de grados centigrados de tamaño 10 y sus valores son aleatorios entre el rango [1,100]

        int[] vectorC = new int[10]; //0-9

        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = MisMetodos.retornaGradoCentigradoAleatorio1_100();
        }

        //Crear un método que reciba vectorC y retorne vectorF
        double[] vectorF = MisMetodos.retornaVectorF(vectorC);

        System.out.printf("%12s%12s\n","CENTIGRADOS", "FAHRENHEIT");
        System.out.printf("%12s%12s\n","-----------", "----------");
        for (int i = 0; i < vectorC.length; i++) {
             System.out.printf("%12d%12.3f\n",vectorC[i], vectorF[i]);
        }
    }

}
