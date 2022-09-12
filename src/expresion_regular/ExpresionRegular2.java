package expresion_regular;

import java.util.Scanner;

public class ExpresionRegular2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sestatura;
        String er = "[0-9]\\.[0-9]+";
        boolean estaturaValido;
        //ENTRADA ESTATURA
        do {
            System.out.print("Ingrese estatura? ");
            sestatura = sc.next();
            estaturaValido = sestatura.matches(er);
            if (!estaturaValido) {
                System.out.println("Estatura error");
            }
        } while (!estaturaValido);
        double destatura = Double.parseDouble(sestatura);
        System.out.println(destatura + " OK");
    }

}
/*

public static Alumno entradaCampos(){
        Alumno a = null;
        Scanner sc = new Scanner(System.in);
        String codigo;
        String nombre;
        String edad;
        String estatura;
        String correo;
        String sexo;
        
        String erc = "C[0-9]+";
        boolean codigoValido;
        //ENTRADA CODIGO
        do {
            System.out.println("Ingrese codigo:");
            codigo = sc.next();
            codigoValido = codigo.matches(erc);
            if(!codigoValido) System.out.println("Codigo error");
        }while(!codigoValido);
        
        String ern = "[a-z,A-Z]+";
        boolean nombreValido;
        //ENTRADA NOMBRE
        do {
            System.out.println("Ingrese nombre:");
            nombre = sc.next();
            nombreValido = nombre.matches(ern);
            if(!nombreValido) System.out.println("Nombre error");
        }while(!nombreValido);
        
        String ered = "[0-9]+";
        boolean edadValido;
        //ENTRADA EDAD
        do {
            System.out.println("Ingrese edad:");
            edad = sc.next();
            edadValido = edad.matches(ered);
            if(!edadValido) System.out.println("Edad error");
        }while(!edadValido);
        int ed = Integer.parseInt(edad);
        
        String eres = "[0-9]\\.[0-9]+";
        boolean estaturaValido;
        //ENTRADA ESTATURA
        do {
            System.out.println("Ingrese estatura:");
            estatura = sc.next();
            estaturaValido = estatura.matches(eres);
            if(!estaturaValido) System.out.println("Estatura error");
        }while(!estaturaValido);
        double est = Double.parseDouble(estatura);
        
        String erm = ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        boolean correoValido;
        //ENTRADA CORREO
        do {
            System.out.println("Ingrese correo:");
            correo = sc.next();
            correoValido = correo.matches(erm);
            if(!correoValido) System.out.println("Correo error");
        }while(!correoValido);
        
        String ers = ("M|H");
        boolean sexoValido;
        //ENTRADA SEXO
        do {
            System.out.println("Ingrese sexo:");
            sexo = sc.next();
            sexoValido = sexo.matches(ers);
            if(!sexoValido) System.out.println("sexo error");
        }while(!sexoValido);
        char sex = sexo.charAt(0);

        
        a = new Alumno(codigo,nombre,ed,est,correo,sex);
        
        return a;
    }
 */
