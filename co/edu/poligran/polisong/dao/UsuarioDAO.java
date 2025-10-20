package co.edu.poligran.polisong.dao;

import co.edu.poligran.polisong.vo.UsuarioVO;
import java.sql.*;

public class UsuarioDAO {

    private Connection conexion;
    private String usuario = "root";
    private String clave = "psswrd";
    private String cadenaConexion = "jdbc:mysql://localhost:3306/PoliSongStockMarketPlacePA?useSSL=false&serverTimezone=UTC";

    public UsuarioDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void establecerConexion() throws SQLException {
        conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);
    }

    private void cerrarConexion() {
        try {
            if (conexion != null) conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int registrarUsuario(UsuarioVO u) {
        int filas = 0;
        try {
            establecerConexion();
            PreparedStatement ps = conexion.prepareStatement(
                "INSERT INTO usuario (tipo_usuario, nombre, telefono, correo, direccion, password) VALUES (?,?,?,?,?,?)"
            );
            ps.setString(1, u.getTipoUsuario());
            ps.setString(2, u.getNombre());
            ps.setString(3, u.getTelefono());
            ps.setString(4, u.getCorreo());
            ps.setString(5, u.getDireccion());
            ps.setString(6, u.getPassword());
            filas = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return filas;
    }

    public int actualizarUsuario(UsuarioVO u) {
        int filas = 0;
        try {
            establecerConexion();
            PreparedStatement ps = conexion.prepareStatement(
                "UPDATE usuario SET nombre=?, telefono=?, direccion=?, password=? WHERE id_usuario=?"
            );
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getTelefono());
            ps.setString(3, u.getDireccion());
            ps.setString(4, u.getPassword());
            ps.setInt(5, u.getIdUsuario());
            filas = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return filas;
    }

    public int eliminarUsuario(int idUsuario) {
        int filas = 0;
        try {
            establecerConexion();
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM usuario WHERE id_usuario=?");
            ps.setInt(1, idUsuario);
            filas = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return filas;
    }
}