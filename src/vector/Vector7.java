package vector;

public class Vector7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int n = (int) (Math.random() * 6 + 5);
        int[] v = new int[n];
        int p = 0, imp = 0;
        System.out.println("el tamaño del vector es: " + n);

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100 + 1);
            System.out.println("v" + i + ": " + v[i]);
            if (v[i] % 2 == 0) {
                p = p + v[i];
            } else {
                imp = imp + v[i];
            }
        }
        System.out.println("la suma de los pares es: " + p);
        System.out.println("la suma de los impares es: " + imp);

    }
    
}
