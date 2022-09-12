package vector;

public class Vector1 {

    public static void main(String[] args) {
        //CREAR UN VECTOR DE N ENTEROS (DIMENSION)
        int n = 9;
        int[] v = new int[n];
        //LLENAR EL VECTOR
        int k = 5;
        for (int i = 0; i < v.length; i++) {
            v[i] = k;
            k = k + 1;
        }
        //MOSTRAR EL VECTOR
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

}
