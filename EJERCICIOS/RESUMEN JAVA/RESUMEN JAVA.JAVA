*****************
****   0001   *** CONVERTIR ARRAY-1 TO ARRAYLIST
*****************

(1)

String cadena = "Hola Mundo";
char[] caracteres_a = cadena.toCharArray();
ArrayList<Character> list = new ArrayList<Character>();
for(char c : caracteres_a) {
    list.add(c);
}

(2)

        {//FORMA 1
            String[] turnos_a = {"M", "M", "M", "M", "T", "T", "T", "T"};
            String[] nombres_a = {"Luis", "Miguel", "Carlos", "Carmen", "Arturo", "Gerson", "Delly", "María"};
            Double[] sueldos_a = {1000.0, 900.0, 800.0, 1210.0, 1000.0, 920.0, 850.0, 1500.0};

            List<String> turnos_l = (List<String>) Arrays.asList(turnos_a);
            List<String> nombres_l = (List<String>) Arrays.asList(nombres_a);
            List<Double> sueldos_l = (List<Double>) Arrays.asList(sueldo_a);

            List<String> turnos_al = new ArrayList<String>(turnos_l);
            List<String> nombre_al = new ArrayList<String>(nombres_l);
            List<Double> sueldos_al = new ArrayList<Double>(sueldos_l);
        }

        {//FORMA 2
            List<String> turnos_l = (List<String>) Arrays.asList("M", "M", "M", "M", "T", "T", "T", "T");
            List<String> nombres_l = (List<String>) Arrays.asList("Luis", "Miguel", "Carlos", "Carmen", "Arturo", "Gerson", "Delly", "María");
            List<Double> sueldos_l = (List<Double>) Arrays.asList(1000.0, 900.0, 800.0, 1210.0, 1000.0, 920.0, 850.0, 1500.0);

            List<String> turnos_al = new ArrayList<String>(turnos_l);
            List<String> nombre_al = new ArrayList<String>(nombres_l);
            List<Double> sueldos_al = new ArrayList<Double>(sueldos_l);
        }
        {//FORMA 3
            List<String> turnos_al = new ArrayList<String>(Arrays.asList("M", "M"));
            List<String> nombre_al = new ArrayList<String>(Arrays.asList("Luis", "Miguel"));
            List<Double> sueldos_al = new ArrayList<Double>(Arrays.asList(1000.0, 900.0));
        }

****************
***   0002   *** TRUNCAR DECIMALES NUMERO REAL
****************

System.out.println("Hipotenusa: " + ((int)(c*100))/100.0);
System.out.printf("Hipotenusa: %-1.3f", c);

****************
***   0003   *** EJECUTAR COMANDOS DOS
****************


        try {
            Runtime.getRuntime().exec("taskkill /IM cmd.exe /F");
        }catch(Exception e) {
            e.printStackTrace();
        }

****************
***   0004   *** ARCHIVO TEXTO
****************

--------
ESCRIBIR
--------

        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File("datos/vocales.txt");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(cadena);
            bw.flush();//Bajar todo de la ram al disco

        } catch (Exception e) {
            e.printStackTrace();
        }

----
LEER
----

        File f;
        FileReader fr;
        BufferedReader br;

        String linea = "";

        try {
            f = new File(rutaNombreArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {

                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

****************
***   0005   *** CONVERSION TIPOS DE DATOS
****************

--------------------------------
ENTERO, REAL, CARACTER TO CADENA
--------------------------------

int x1 = 5;
String s1 = String.valueOf(x1);

double x2 = 5.1;
String s2 = String.valueOf(x2);

char x3 = 'h';
String s3 = String.valueOf(x3);

----------------------
CADENA TO ENTERO, REAL
----------------------
String s1 = "5";
int x1 = Integer.parseInt(s1);

String s2 = "5.1";
double x2 = Double.parseDouble(s1);

****************
***   0005   *** ENTRADA TECLADO
****************

Scanner sc = new Scanner(System.in);
String guardar = sc.next();

****************
***   0006   *** CONVERTIR UN
****************

(1)

List<String> nombres_al = (List<String>) Arrays.asList("Ramon","Ismael");
for(String s: nombres_al) {
    System.out.println(s);
}

(2)

String[] nombre = {"Luis", "Miguel", "Carlos", "Carmen", "Arturo", "Gerson", "Delly", "María"};
List<String> nombres_al = (List<String>) Arrays.asList(nombre);
for(String s: nombres_al) {
    System.out.println(s);
}

****************
***   0007   *** SEPARAR LAS PALABRAS DE UNA ORACION
****************

(1)

String s = "En un   puerto      italiano";
String[] c = s.split("\\s+");//El caracter que separa las palabras es un o mas espacios en blanco {"En","un","puerto","italiano"}
ArrayList<String> palabras_al= new ArrayList<String>(Arrays.asList(c));

(2)

String cadena = "hola";
String[] c = cadena.split(""); //El caracter que separa las letras es nada {"h","o","l","a"}
ArrayList<String> letras_al = new ArrayList<String>(Arrays.asList(c));
for(String s: letras_al) {
    System.out.println(s);
}

***************
***  0008   *** ORDENAMIENTO DE LA BURBUJA
***************

        for (int i = 0; i < nombres_a.length; i++) {
            for (int j = 0; j < nombres_a.length - 1; j++) {
                if (nombres_a[j].compareTo(nombres_a[j + 1]) > 0) {
                    aux = nombres_a[j];
                    nombres_a[j] = nombres_a[j + 1]; //en esta parte debo poner
                    nombres_a[j + 1] = aux;
                }
            }
        }
		
        String[] nombres_a = {"Cesar", "Miguel", "Gerson", "Sylvia", "Vanessa","Arturo","Maria"};
        List<String> nombres_l = (List<String>) Arrays.asList(nombres_a);
        List<String> nombres_al = new ArrayList<>(nombres_l);
        Collections.sort(nombres_al);
        for(String nombre: nombres_al) {
            System.out.println(nombre);
        }
		
****************
***   0009   *** ENTRADA POR TECLADO
****************

    public static String entradaNombre(String mensaje) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8);
        String er = "[a-zA-Z\u00F1\u00D1]+";
        String sCadena;
        boolean correcto;
        do {
            System.out.print(mensaje);
            sCadena = sc.next();
            correcto = sCadena.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        return sCadena;
    }
	
    public static int entradaNumeroEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String er = "[0-9]+";
        String sNumeroEntero;
        int iNumeroEntero;
        boolean correcto;
        do {
            System.out.print(mensaje);
            sNumeroEntero = sc.next();
            correcto = sNumeroEntero.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        iNumeroEntero = Integer.parseInt(sNumeroEntero);
        return iNumeroEntero;
    }	

****************
***   0010   *** ERROR
****************

import java.util.logging.Level;
import java.util.logging.Logger;
...
try {


} catch (Exception ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
}

****************
***   0011   *** CONEXION POSTGRESQL
****************

    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5432/campusfp";
        String usuario = "postgres";
        String clave = "12345678";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);


        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION");
        }
    }
	
****************
***   0012   *** CONEXION SQLITE
****************
	
    public static void main(String[] args) {
        File f = new File("datos/campusfp.db");//Ruta Relativa
        String ra = f.getAbsolutePath();//Ruta Absoluta 
        String url = "jdbc:sqlite:" + ra;
        try {
            Connection conexion = DriverManager.getConnection(url);
			

        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }
	
****************
***   0013   *** CONEXION MARIADB - MYSQL
****************

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/campusfp";
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);

        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }
	
****************
***   0014   *** CRUD
****************

(1) DELETE

    public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/campusfp";
        String usuario = "root";
        String clave = "12345678";
		String query = "DELETE FROM Tabla WHERE idTabla = ?";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, Entrada.cadena("Ingrese Identificador Tabla? "));
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }
	
(2) INSERT
	
    public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/campusfp";
        String usuario = "root";
        String clave = "12345678";
		String query = "INSERT INTO Alumno(idAlumno, nombre, edad, estatura) VALUES (?, ?, ?, ?)";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, "A1");
			ps.setString(2, "Miguel"); 
			ps.setInt(3, 23);
            ps.setDouble(3, 1.72);			
            ps.executeUpdate();
            System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }
	
(3) UPDATE

    public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/campusfp";
        String usuario = "root";
        String clave = "12345678";
        String query = "UPDATE Alumno SET nombre = ?, edad = ?, estatura = ? WHERE idAlumno = ?";
        try {
			Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, "Luis");
            ps.setInt(2, 24);
            ps.setDouble(3, 1.73);
            ps.setString(4, "A1");
            ps.executeUpdate();
			System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }
	
(4) SELECT

    public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/campusfp";
        String usuario = "root";
        String clave = "12345678";
        String query = "SELECT * FROM Alumno ORDER BY nombre DESC";
        try {
			Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idAlumno = rs.getString(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                double estatura = rs.getDouble(4);
				System.out.println(idAlumno + "\t" + nombre + "\t" + edad + "\t" + estatura);
			}
			System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }		
	
(5) CREAT TABLE

    public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/campusfp";
        String usuario = "root";
        String clave = "12345678";
        String query = "CREATE TABLE IF NOT EXISTS Alumno ("
                + "idAlumno VARCHAR(4)         NOT NULL PRIMARY KEY,"
                + "nombre   VARCHAR(25) NOT NULL,"
                + "edad     INT         NOT NULL,"
                + "estatura DOUBLE      NOT NULL"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";

        try {
			Connection conexion = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
			System.out.println("OK");
        } catch (SQLException e) {
            System.out.println("ERROR");
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*********************
***   PREGUNTAS   *** CRUD
*********************

-- (R) HACER UN PROGRAMA EN JAVA QUE PERMITA MOSTRAR LA FACTURA QUE TIENE EL MAYOR MONTO VENDIDO. MYSQL(TIENDARABAL).

SELECT numeroFactura, SUM(precio*cantidad) AS MONTO
FROM Detalle
GROUP BY numeroFactura
HAVING MONTO = (SELECT SUM(precio*cantidad) AS MONTO
FROM Detalle
GROUP BY numeroFactura
ORDER BY MONTO DESC
LIMIT 1);

-- (D) HACER UN PROGRAMA EN JAVA QUE PERMITA, ELIMINAR LA FACTURA 1201

DELETE FROM Factura WHERE numeroFactura = 1201;

-- (U) HACER UN PROGRAMA EN JAVA QUE PERMITA, ACTUALIZAR LA CANTIDAD VENDIDA DEL ARTICULO LAPIZ DE LA FACTURA 1200. LOS DATOS SERÁN CANTIDAD=102.

INSERT INTO Detalle VALUES(1200,1,'lapiz',1,100);
 
UPDATE SET cantidad = ? WHERE numerFactura = ? AND numeroitem = ?;

-- HACER UN PROGRAMA QUE INSERTE UNA FACTURA Y SUS DETALLES

INSERT INTO Factura VALUES(1500,'2020-01-20',1);
INSERT INTO Detalle VALUES(1500,1,'regla',1.5,40);
INSERT INTO Detalle VALUES(1500,2,'goma',0.5,100);



throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.