package expresion_regular;

public class ER2 {

    public static void main(String[] args) {
        String er = ".";
                    
        String s = "?";
        if(s.matches(er)) {
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }
    }
    
}
