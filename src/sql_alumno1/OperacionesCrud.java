package sql_alumno1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OperacionesCrud {

    /**
     * Crear tabla alumno
     *
     * @param conexion es el objeto que tiene la conexion a la base de datos
     * @return 1 significa que la creación de tabla alumno fue correcta, -1
     * significa que ocurrio un error inesperaddo
     */
    public static int crearTablaAlumno(Connection conexion) {
        String query = "CREATE TABLE IF NOT EXISTS Alumno ("
                + "idAlumno INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,"
                + "nombre   VARCHAR(25) NOT NULL,"
                + "edad     INT         NOT NULL,"
                + "estatura DOUBLE      NOT NULL"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
        } catch (SQLException e) {
            return -1;
        }
        return 1;
    }

    /**
     *
     * @param alumno es el objeto que vamos a insertar en la tabla Alumno
     * @param conexion es el objeto que tiene la conexion a la base de datos
     * @return 1 significa que la inserción del objeto alumno fue correcto, -1
     * significa que ocurrio un error inesperaddo
     */
    public static int insertar(Alumno alumno, Connection conexion) {
        String nombre = alumno.getNombre();
        int edad = alumno.getEdad();
        double estatura = alumno.getEstatura();
        String query = "INSERT INTO Alumn (idAlumno, nombre, edad, estatura) VALUES (NULL,?,?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setInt(2, edad);
            ps.setDouble(3, estatura);
            ps.executeUpdate();
        } catch (SQLException ex) {
            return -1;
        }
        return 1;
    }

    /**
     *
     * @param idAlumno es el identificador del alumno que vamoa a eliminar
     * @param conexion es el objeto que tiene la conexion a la base de datos
     * @return 1 significa que la eliminación del objeto alumno fue correcto, -1
     * significa que ocurrio un error inesperaddo
     */
    public static int eliminar(int idAlumno, Connection conexion) {
        String query = "DELETE FROM Alumno WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ps.executeUpdate();
        } catch (SQLException ex) {
            return -1;
        }
        return 1;
    }

    /**
     *
     * @param nombre
     * @param conexion
     * @return
     */
    public static int eliminar(String nombre, Connection conexion) {
        String query = "DELETE FROM Alumno WHERE nombre = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, nombre);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            return -1;
        }
    }

    /**
     *
     * @param alumno
     * @param conexion
     * @return
     */
    public static int actualizar(Alumno alumno, Connection conexion) {
        String query = "UPDATE Alumno SET nombre = ?, edad = ?, estatura = ? WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, alumno.getNombre());
            ps.setInt(2, alumno.getEdad());
            ps.setDouble(3, alumno.getEstatura());
            ps.setInt(4, alumno.getIdAlumno());
            ps.executeUpdate();
        } catch (SQLException ex) {
            return -1;
        }
        return 1;
    }

    public static int existeAlumno(int idAlumno, Connection conexion) {
        String query = "SELECT * FROM Alumno WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {//Mientras haya registro imprime
                return 1;
            }
            return 0;
        } catch (SQLException ex) {
            return -1;
        }
    }

    public static List<Alumno> retornarTodosRegistrosTablaAlumno(Connection conexion, int opcion) {
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        String query1 = "SELECT * FROM Alumno";
        String query2 = "SELECT * FROM Alumno ORDER BY nombre";
        String query3 = "SELECT * FROM Alumno ORDER BY nombre DESC";
        String query = "";
        if (opcion == 1) {
            query = query1;
        }
        if (opcion == 2) {
            query = query2;
        }
        if (opcion == 3) {
            query = query3;
        }
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idAlumno = rs.getInt(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                double estatura = rs.getDouble(4);
                Alumno a = new Alumno(idAlumno, nombre, edad, estatura);
                /*
                Alumno a = new Alumno(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getInt(3),
                                       rs.getDouble(4));
                 */
                alumnos_al.add(a);
            }
        } catch (SQLException ex) {
            return null;
        }
        return alumnos_al;
    }

    public static List<Alumno> buscarRegistroAlumno(String nombreBuscar, Connection conexion) {
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        String query = "SELECT * FROM Alumno WHERE nombre = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, nombreBuscar);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idAlumno = rs.getInt(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                double estatura = rs.getDouble(4);
                Alumno a = new Alumno(idAlumno, nombre, edad, estatura);
                /*
                Alumno a = new Alumno(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getInt(3),
                                       rs.getDouble(4));
                 */
                alumnos_al.add(a);
            }
        } catch (SQLException ex) {
            return null;
        }
        return alumnos_al;
    }

    public static Alumno buscarRegistroAlumno(int idAlumnoBuscar, Connection conexion) {
        String query = "SELECT * FROM Alumno WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idAlumnoBuscar);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idAlumno = rs.getInt(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                double estatura = rs.getDouble(4);
                Alumno alumno = new Alumno(idAlumno, nombre, edad, estatura);
                return alumno;
            }
            return new Alumno(0, "", 0, 0.0);
        } catch (SQLException ex) {
            return null;
        }
    }

    public static Connection miconexion() {
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        return conexion;
    }

}
