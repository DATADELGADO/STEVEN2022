package archivo_texto_concesionario;

import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        List<Coche> coches_al = MetodosArchivosTexto.leer("datos/concesionario.csv");
        System.out.printf("%7S  %-10s  %-15S  %12s\n","IDCOCHE","COLOR","MARCA","KILOMETRAJE");
        System.out.printf("%7S  %-10s  %-15S  %12s\n","-------","-----","-----","-----------");
        for (int i = 0; i < coches_al.size(); i++) {
            Coche coche = coches_al.get(i);
            coche.imprimirTabla();
        }
    }
}
