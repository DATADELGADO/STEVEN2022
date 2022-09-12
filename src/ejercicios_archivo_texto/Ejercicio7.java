package ejercicios_archivo_texto;

import sql_alumno3.Entrada;

public class Ejercicio7 {

    public static void main(String[] args) {
        String rutaNombreArchivo = Entrada.entradaRutaNombreArchivo("Ingrese la ruta y nombre del archivo? ");
        //C:\Users\RYZEN\Downloads\archivo.txt
        String atributo = "-H";//+H Ocultar, -H Visible
        try {
            Runtime.getRuntime().exec("taskkill /IM cmd.exe /F");
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        
    }

}
