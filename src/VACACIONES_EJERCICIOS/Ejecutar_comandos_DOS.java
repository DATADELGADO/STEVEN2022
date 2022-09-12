package VACACIONES_EJERCICIOS;

public class Ejecutar_comandos_DOS {

   
    public static void main(String[] args) {
        /*
         try {
            Runtime.getRuntime().exec("taskkill /IM cmd.exe /F");
        }catch(Exception e) {
            e.printStackTrace();
        }
        */
        
        
        try {
            Runtime.getRuntime().exec("calc");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
