package condicional_binario;

import java.util.Scanner;

public class Ejemplo2_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = 1; b = 2; c = 3;  
        //(1) a < b y b < c --> c b a
        
        if(a < b && b < c) System.out.println(c + " " + b + " " + a);
        
        //(2) 3 2 1   a > b y b > c -->  a b c
        a = 3; b = 2; c = 1; 
        if(a > b && b > c) System.out.println(a + " " + b + " " + c);
        
        a = 1; b = 3; c = 2;
        if(a < b && b > c) System.out.println(b + " " + c + " " + 1);
        
        //IF    THEN(ENTONCES)   ELSE(SINO)
        if(true) { //ENTONCES
            //verdadero
        }else {
            //falso
        }
        
        if(true) {
           //Verdadero
        }
        
                        
        
    }
        
        
        
    }
    

