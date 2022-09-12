package autor_libro;

public class MisMetodos {

    public static int retornaCodigoAutorCiencia(Libro[] x, String cadena) {
        int idAutorAux = 0;
        Libro libro = null;
        for (int i = 0; i < x.length; i++) {
            libro = x[i]; //Objeto
            String titulo = libro.getTitulo();
            String descri = libro.getDescripcion();
            int idAutor = libro.getIdAutor();
            if (descri.equalsIgnoreCase(cadena)) {
                //Libro l5 = new Libro(5,"Física","Ciencia",250,2); 
                idAutorAux = idAutor;
                break;
            }
        }
        return idAutorAux;
    }

    public static void mostrarTitulosLibrosProgramacion(Libro[] x, String cadena) {
        for (int i = 0; i < x.length; i++) {
            String titulo = x[i].getTitulo();
            String descri = x[i].getDescripcion();
            int idAutor = x[i].getIdAutor();
            if (descri.equalsIgnoreCase(cadena)) {
                System.out.println(titulo);
            }
        }
    }
    
    public static BD datos(){
        
        Autor A1 = new Autor(1,"Selva","Almada",60);
        Libro L1 = new Libro(1111,"El viento que arrasa", "Ficcion",200,1);
        Libro L2 = new Libro(1112,"No es un río", "Novela",300,1);
        Libro L3 = new Libro(1113,"Chicas muertas", "Crónica",700,1);
        
        Autor A2 = new Autor(2,"Gabriel","García",71);
        Libro L4 = new Libro(2111,"100 años de soledad", "Novela",400,2);
        Libro L5 = new Libro(2112,"Cronica de una muerte", "Novela",300,2);
        Libro L6 = new Libro(2113,"Doce Cuentos", "Cuento",130,2);
        
        Autor A3 = new Autor(3,"Miguel","Otero",99);
        Libro L7 = new Libro(3111,"Casas Muertas", "Ficcion",400,3);
        Libro L8 = new Libro(3112,"Fiebre", "Ficcion",300,3);
        Libro L9 = new Libro(3113,"La muerte de Honorio", "Novela",130,3);
        
        Libro[] vLibro = {L1, L2, L3, L4, L5, L6, L7, L8, L9};
        Autor[] vAutor = {A1,A2,A3};
        BD bd = new BD(vLibro,vAutor);
        
        //BASE DE DATOS DE OBEJETOS
        return bd;
        
    }

    
}
