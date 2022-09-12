package modelo;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OperacionesCrud {

    private Connection conexion;

    public OperacionesCrud(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean eliminarTablaAficionadoSiExiste() {
        String nombreTabla = "Aficionado";
        try {
            String query = String.format("DROP TABLE IF EXISTS %s", nombreTabla);
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean crearTablaAficionado() {
        try {
            String query = "CREATE TABLE Aficionado (idAficionado INT, nombre TEXT, clubs TEXT[])";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertarRegistroAficionadoTablaAficionado(Aficionado aficionado) {
        try {
            String query = "INSERT INTO Aficionado (idAficionado, nombre, clubs) VALUES (?, ?, ?)";
            String[] clubs = aficionado.getClubs();
            Array arrayClubs = conexion.createArrayOf("text", clubs);
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, aficionado.getIdAficionado());
            ps.setString(2, aficionado.getNombre());
            ps.setArray(3, arrayClubs);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Aficionado> obtenerListaAficionadosFromTablaAficionado() {
        List<Aficionado> alumnos_al = new ArrayList<Aficionado>();
        String query = "SELECT * FROM Aficionado";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Array arrayClubs = rs.getArray(3);
                String[] clubs = (String[]) arrayClubs.getArray();
                alumnos_al.add(new Aficionado(rs.getInt(1), rs.getString(2), clubs));
            }
        } catch (SQLException e) {
            alumnos_al = null;
        }
        return alumnos_al;
    }

}
