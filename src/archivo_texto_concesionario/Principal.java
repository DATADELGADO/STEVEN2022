package archivo_texto_concesionario;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
       List<Coche> coches_al = MetodosArchivosTexto.leer("datos/concesionario.csv");
       for(int i=0; i<coches_al.size(); i++) {
           Coche coche = coches_al.get(i);
           System.out.println(coche);
       }

    }

}
