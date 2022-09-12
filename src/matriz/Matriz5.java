package matriz;

public class Matriz5 {

    public static void main(String[] args) {
        for (int f = 1; f <= 11; f++) {
            for (int c = 1; c <= f; c++) {
                if (c == 1) {
                    for (int e = 11; e > f * c; e = e - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
