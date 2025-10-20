package co.edu.poligran.polisong.dao;

import co.edu.poligran.polisong.vo.VentaVO;
import java.sql.*;

public class VentaDAO {
    private Connection conexion;
    private final String usuario = "root";
    private final String clave = "psswrd";
    private final String cadenaConexion = "jdbc:mysql://localhost:3306/PoliSongStockMarketPlacePA?useSSL=false&serverTimezone=UTC";

    public VentaDAO() {
        try { Class.forName("com.mysql.cj.jdbc.Driver"); }
        catch (ClassNotFoundException e) { e.printStackTrace(); }
    }

    private void conectar() throws SQLException { conexion = DriverManager.getConnection(cadenaConexion, usuario, clave); }
    private void cerrar() { try { if (conexion != null) conexion.close(); } catch (SQLException e) { e.printStackTrace(); } }

    public int registrarVenta(VentaVO v) {
        int filas = 0;
        try {
            conectar();
            PreparedStatement ps = conexion.prepareStatement(
                "INSERT INTO venta (id_usuario, id_disco_vinilo, id_disco_mp3, cantidad, estado, observacion, metodo_pago) VALUES (?,?,?,?,?,?,?)"
            );
            ps.setInt(1, v.getIdUsuario());
            ps.setObject(2, v.getIdDiscoVinilo());
            ps.setObject(3, v.getIdDiscoMp3());
            ps.setInt(4, v.getCantidad());
            ps.setString(5, v.getEstado());
            ps.setString(6, v.getObservacion());
            ps.setString(7, v.getMetodoPago());
            filas = ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
        finally { cerrar(); }
        return filas;
    }

    public int actualizarEstadoVenta(int idVenta, String nuevoEstado) {
        int filas = 0;
        try {
            conectar();
            PreparedStatement ps = conexion.prepareStatement("UPDATE venta SET estado=? WHERE id_venta=?");
            ps.setString(1, nuevoEstado);
            ps.setInt(2, idVenta);
            filas = ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
        finally { cerrar(); }
        return filas;
    }

    public int eliminarVenta(int idVenta) {
        int filas = 0;
        try {
            conectar();
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM venta WHERE id_venta=?");
            ps.setInt(1, idVenta);
            filas = ps.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
        finally { cerrar(); }
        return filas;
    }
}