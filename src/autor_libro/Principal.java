package autor_libro;

import java.io.File;
import javax.swing.JOptionPane;//Interfaces gráficas (javax.swing)

public class Principal {

    public static void main(String[] args) {
        Autor a1 = new Autor(1,"Miguel","Prado",60);
        Libro l1 = new Libro(1,"Programación base datos","Base de Datos",200,1);
        Libro l2 = new Libro(2,"Programación python","Programación",300,1);
        Libro l3 = new Libro(3,"Programación vba","Programación",400,1);
        
        Autor a2 = new Autor(2,"Delly","Castillo",34);
        Libro l4 = new Libro(4,"Programación Java","Programación",500,2);
        Libro l5 = new Libro(5,"Física","Ciencia",250,2);
        
        //BASE DE DATOS DE OBJETOS
        Libro[] x = {l1,l2,l3,l4,l5};
        Autor[] y = {a1,a2};
        
        System.out.println("Quisiera mostrar todos los titulos de libros sobre programación");
        MisMetodos.mostrarTitulosLibrosProgramacion(x, "Programación");
        
        
        
        
        
        
        
        
        
        /*
        
        //String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        //JOptionPane.showMessageDialog(null, "Hola " + nombre);
        
        //Quisiera saber los autores que tengan libros sobre ciencia
           // Entrada: "ciencia"
           // Salida
        System.out.println("Id Autor: " + MisMetodos.retornaCodigoAutorCiencia(x, "Ciencia"));   
         
        for(int i=0; i<y.length; i++ ) {
            if(y[i].getIdAutor()== MisMetodos.retornaCodigoAutorCiencia(x, "Ciencia")) {
                System.out.println("Nombre: " + y[i].getNombre());
                System.out.println("Apellido: " + y[i].getPaterno());
            }
        }
        
        
        //Quisiera saber el autor con mayor número de libros
                
           */
    }
    
}
