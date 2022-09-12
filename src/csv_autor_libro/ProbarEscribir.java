package csv_autor_libro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ProbarEscribir {

    public static void main(String[] args) {

        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
           
            f = new File("datos/resumen.txt");
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);
            
            bw.write("\nMe encuentro bien\ngracias por preguntar");
            bw.flush();
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

}
