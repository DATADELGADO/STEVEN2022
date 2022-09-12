package clase_circulo;

public class PrincipalCirculo1 {

    public static void main(String[] args) {
       
        Circulo c = new Circulo(10);
        
        System.out.println("Radio    : " + c.getRadio());
        System.out.println("Perimetro: " + c.perimetro());
        System.out.println("Area     : " + c.area());
    }
    
}
