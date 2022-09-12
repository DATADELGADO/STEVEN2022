package ejercicios_array;

public class Ejercicio3_1 {

    public static void main(String[] args) {
        String[] nombres_a = {"Cesar", "Miguel", "Gerson", "Sylvia", "Vanessa", "Arturo","María"};
        String aux = "";
        //ALGORIMO DE LA BURBUJA
        for (int i = 0; i < nombres_a.length; i++) {
            for (int j = 0; j < nombres_a.length - 1; j++) {
                if (nombres_a[j].compareTo(nombres_a[j + 1]) > 0) {
                    aux = nombres_a[j];
                    nombres_a[j] = nombres_a[j + 1]; //en esta parte debo poner
                    nombres_a[j + 1] = aux;
                }
            }
        }
        for(int i=0; i<nombres_a.length; i++) {
            System.out.println(nombres_a[i]);
        }
    }
}
