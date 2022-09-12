package jason_practicando;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicios {

    public static void ejercicio1() throws IOException {
        {
            String ruta = "datos/persona.json";
            Persona persona = new Persona();
            //List<Persona> persona = new ArrayList<Persona>();
            try {
                Reader r = Files.newBufferedReader(Paths.get(ruta));
                Gson gson = new Gson();
                persona = gson.fromJson(r, Persona.class);
                //persona = gson.fromJson(r, List.class);
                if (persona != null) {
                    System.out.println(persona.getAficiones()[0]);
                    System.out.println(persona.getAficiones()[1]);

                    System.out.println(persona);
                } else {
                    System.out.println("no hay registros");
                }
            } catch (Exception e) {
                System.out.println("error");
            }
        }
        /*
        {
            try {
                
                //File f = new File("datos/persona.json");
               // FileReader fr = new FileReader(f);
                //BufferedReader br = new BufferedReader(fr);
                 
                BufferedReader br = new BufferedReader(new FileReader("datos/persona.json"));
                String linea;
                String json = "";
                while ((linea = br.readLine()) != null) {
                    json = json + linea;
                }
                br.close();
                System.out.println(json);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ejercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         */
    }

    public static void Ejercicio2() { // FICHEROS
        List<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto(1, "producto 1", 10.5, true, 'T'));
        productos.add(new Producto(2, "producto 2", 50.5, true, 'R'));
        productos.add(new Producto(3, "producto 3", 10.5, false, 'T'));
        productos.add(new Producto(4, "producto 4", 30.5, true, 'B'));
        productos.add(new Producto(5, "producto 5", 20.5, true, 'T'));

        try (RandomAccessFile raf = new RandomAccessFile("ejemplo_raf.dat", "rw")) {
            for (Producto p : productos) {
                raf.writeInt(p.getId());
                StringBuffer sb = new StringBuffer(p.getNombre());
                sb.setLength(10);
                raf.writeChars(sb.toString());
                raf.writeDouble(p.getPrecio());
                raf.writeBoolean(p.isDescuento());
                raf.writeChar(p.getTipo());

            }

            // 4 + 20 + 8 + 1 + 2 = 35 bytes cada registro
            raf.seek(105); // 0, 35, 70, 105, 140
            System.out.println(raf.readInt());
            String nombre = "";
            for (int i = 0; i < 10; i++) {
                nombre += raf.readChar();
            }
            System.out.println(nombre);
            System.out.println(raf.readDouble());
            System.out.println(raf.readBoolean());
            System.out.println(raf.readChar());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
