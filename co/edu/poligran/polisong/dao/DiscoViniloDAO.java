package co.edu.poligran.polisong.dao;

import co.edu.poligran.polisong.vo.DiscoViniloVO;
import java.sql.*;

public class DiscoViniloDAO {

    private Connection conexion;
    private final String usuario = "root";
    private final String clave = "psswrd";
    private final String cadenaConexion = "jdbc:mysql://localhost:3306/PoliSongStockMarketPlacePA?useSSL=false&serverTimezone=UTC";

    public DiscoViniloDAO() {
        try { Class.forName("com.mysql.cj.jdbc.Driver"); }
        catch (ClassNotFoundException e) { e.printStackTrace(); }
    }

    private void conectar() throws SQLException {
        conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);
    }

    private void cerrar() {
        try { if (conexion != null) conexion.close(); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    public int agregarVinilo(DiscoViniloVO d) {
        int filas = 0;
        try {
            conectar();
            PreparedStatement ps = conexion.prepareStatement(
                "INSERT INTO disco_vinilo (id_autor, nombre, anio_salida, precio, cantidad, imagen) VALUES (?,?,?,?,?,?)"
            );
            ps.setInt(1, d.getIdAutor());
            ps.setString(2, d.getNombre());
            ps.setInt(3, d.getAnioSalida());
            ps.setDouble(4, d.getPrecio());
            ps.setInt(5, d.getCantidad());
            ps.setString(6, d.getImagen());
            filas = ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
        finally { cerrar(); }
        return filas;
    }

    public int actualizarPrecioVinilo(int idVinilo, double nuevoPrecio) {
        int filas = 0;
        try {
            conectar();
            PreparedStatement ps = conexion.prepareStatement(
                "UPDATE disco_vinilo SET precio=? WHERE id_disco_vinilo=?"
            );
            ps.setDouble(1, nuevoPrecio);
            ps.setInt(2, idVinilo);
            filas = ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
        finally { cerrar(); }
        return filas;
    }

    public int eliminarVinilo(int idVinilo) {
        int filas = 0;
        try {
            conectar();
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM disco_vinilo WHERE id_disco_vinilo=?");
            ps.setInt(1, idVinilo);
            filas = ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
        finally { cerrar(); }
        return filas;
    }
}