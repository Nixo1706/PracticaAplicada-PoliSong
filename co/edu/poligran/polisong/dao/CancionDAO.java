package co.edu.poligran.polisong.dao;

import co.edu.poligran.polisong.vo.CancionVO;
import java.sql.*;

public class CancionDAO {

    private Connection conexion;
    private final String usuario = "root";
    private final String clave = "psswrd";
    private final String cadenaConexion = "jdbc:mysql://localhost:3306/PoliSongStockMarketPlacePA?useSSL=false&serverTimezone=UTC";

    public CancionDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void conectar() throws SQLException {
        conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);
    }

    private void cerrar() {
        try {
            if (conexion != null) conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int agregarCancion(CancionVO c) {
        int filas = 0;
        try {
            conectar();
            PreparedStatement ps = conexion.prepareStatement(
                "INSERT INTO cancion (id_autor, nombre, genero, duracion, tamano_mb, calidad_kbps) VALUES (?,?,?,?,?,?)"
            );
            ps.setInt(1, c.getIdAutor());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getGenero());
            ps.setString(4, c.getDuracion());
            ps.setDouble(5, c.getTamanoMb());
            ps.setInt(6, c.getCalidadKbps());
            filas = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrar();
        }
        return filas;
    }

    public int actualizarCancion(CancionVO c) {
        int filas = 0;
        try {
            conectar();
            PreparedStatement ps = conexion.prepareStatement(
                "UPDATE cancion SET nombre=?, genero=?, duracion=?, tamano_mb=?, calidad_kbps=? WHERE id_cancion=?"
            );
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getGenero());
            ps.setString(3, c.getDuracion());
            ps.setDouble(4, c.getTamanoMb());
            ps.setInt(5, c.getCalidadKbps());
            ps.setInt(6, c.getIdCancion());
            filas = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrar();
        }
        return filas;
    }

    public int eliminarCancion(int idCancion) {
        int filas = 0;
        try {
            conectar();
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM cancion WHERE id_cancion=?");
            ps.setInt(1, idCancion);
            filas = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrar();
        }
        return filas;
    }
}