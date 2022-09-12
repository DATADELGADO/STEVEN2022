package vector;

public class Vector6 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 6 + 5); //[5,10]
        int[] v = new int[n];
        System.out.println("el tamaño del vector es: " + n);

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100 + 1);//[1,100]
            System.out.println("v" + i + ": " + v[i]);
        }
        //SUMAR SOLAMENTE LAS POSICIONES QUE TENGA EL NÚMERO PAR

    }

}
