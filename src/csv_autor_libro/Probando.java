package csv_autor_libro;

public class Probando {

    public static void main(String[] args) {
        String cadena = "Hola julio como estas espero que bien mi cumple es hoy 4 julio 2022";
        //String er = "[0-9]+";//2,22,223,
        //String er = "julio";
        String er = "o";
        String resultado = cadena.replaceAll(er, "xxxx");
        System.out.println("Resultado: " + resultado);
        
       
    }

}
