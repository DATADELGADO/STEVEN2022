package ejercicios_array;

public class Ejercicio2 {

    public static void main(String[] args) {
        String[] nombre = {"Luis", "Miguel", "Carlos", "Carmen", "Arturo",
            "Sylvia", "Delly", "Lucho", "Roxana", "José"};
        String[] curso = {"Matemática", "Matemática", "Matemática", "Matemática",
            "Matemática", "Física", "Física", "Física", "Física", "Física"};
        int[] nota = {8, 5, 4, 8, 7, 2, 9, 10, 4, 8};

        int sumam = 0;
        int sumaf = 0;

        double mediam = 0.0;
        double mediaf = 0.0;

        for (int i = 0; i < curso.length; i++) {
            if (curso[i].equalsIgnoreCase("Matemática")) {
                sumam = sumam + nota[i];
            }
            if (curso[i].equalsIgnoreCase("Física")) {
                sumaf = sumaf + nota[i];
            }
        }
        mediam = sumam / 5;
        mediaf = sumaf / 5;

        System.out.println("FORMA 1");
        if (mediam > mediaf) {
            System.out.println("Matemática tiene el promedio mayor: " + mediam);
        } else {
            if (mediam < mediaf) {
                System.out.println("Física tiene el promedio mayor: " + mediaf);
            } else {
                System.out.println("Matemática y Física tiene el mismo promedio: " + mediam);
            }
        }

        System.out.println("FORMA 2");
        if (mediam > mediaf) {
            System.out.println("Matemática tiene el promedio mayor: " + mediam);
        }
        if (mediam < mediaf) {
            System.out.println("Física tiene el promedio mayor: " + mediaf);
        } else {
            System.out.println("Matemática y Física tiene el mismo promedio: " + mediam);
        }

    }

}

/*
NOBRE_ALUMNO  NOMBRE_CURSO  NOTA
Luis          M             8
Miguel        M             5
Carlos        M             4
Carmen        M             3
Arturo        M             7

Sylvia        F             2
Delly         F             9
Lucho         F             0
Roxana        F             4
José          F             8
 */
