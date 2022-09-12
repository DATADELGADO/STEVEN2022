package tipos;

public class ProbarTipos {

    public static void main(String[] args) {
       double x = 2.343513454545;
       int y = (int)x; //Cast
       double z = x - y;
       double m = ((int)(x * 100))/(double)100;
       System.out.println("y = " + y);
       System.out.println("z = " + z);
       System.out.println("m = " + m);
       
       
       double m1 = Math.round(x*100.0)/100.0;
       System.out.println("m = " + m1);
    }
    
}
