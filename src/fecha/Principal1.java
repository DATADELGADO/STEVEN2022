package fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal1 {

    public static void main(String[] args) {
        //Fecha1 : 27-07-2022  Fecha2: 10-07-2022
        //Cuál es la fecha mayor
        String fecha1 = "05/07/2022";
        String fecha2 = "10/07/2022";

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            java.util.Date parsed1 = dateFormat.parse(fecha1);
            long mili_fecha1 = parsed1.getTime();

            java.util.Date parsed2 = dateFormat.parse(fecha2);
            long mili_fecha2 = parsed2.getTime();
            
            if(mili_fecha1 > mili_fecha2) {
               System.out.println("mayor fecha1");
            }else {
               System.out.println("mayor fecha2"); 
            }

        } catch (ParseException ex) {
            Logger.getLogger(Principal1.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

}
