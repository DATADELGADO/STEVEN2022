package tipos;

import java.util.Scanner;

public class ProbarReal {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = null;
    	String sER = "([0-9]+./[0-9]+)"; 
    	do {
             System.out.print("Introduzca número real? ");
             s = sc.next();
    	}while(!s.matches(sER));
    	System.out.print("Numero real");
    	
    	sc.close();
    }
}
