package co.edu.poligran.polisong.vo;

import java.sql.Timestamp;

public class VentaVO {
    private int idVenta;
    private int idUsuario;
    private Integer idDiscoVinilo;
    private Integer idDiscoMp3;
    private int cantidad;
    private Timestamp fecha;
    private String estado;
    private String observacion;
    private String metodoPago;
    private Timestamp fechaEnvio;
    private Timestamp fechaRecepcion;
    private String valoracion;

    public VentaVO() {}

    public VentaVO(int idVenta, int idUsuario, Integer idDiscoVinilo, Integer idDiscoMp3, int cantidad, Timestamp fecha, String estado, String observacion, String metodoPago, Timestamp fechaEnvio, Timestamp fechaRecepcion, String valoracion) {
        this.idVenta = idVenta;
        this.idUsuario = idUsuario;
        this.idDiscoVinilo = idDiscoVinilo;
        this.idDiscoMp3 = idDiscoMp3;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.estado = estado;
        this.observacion = observacion;
        this.metodoPago = metodoPago;
        this.fechaEnvio = fechaEnvio;
        this.fechaRecepcion = fechaRecepcion;
        this.valoracion = valoracion;
    }

    public int getIdVenta() { return idVenta; }
    public void setIdVenta(int idVenta) { this.idVenta = idVenta; }
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public Integer getIdDiscoVinilo() { return idDiscoVinilo; }
    public void setIdDiscoVinilo(Integer idDiscoVinilo) { this.idDiscoVinilo = idDiscoVinilo; }
    public Integer getIdDiscoMp3() { return idDiscoMp3; }
    public void setIdDiscoMp3(Integer idDiscoMp3) { this.idDiscoMp3 = idDiscoMp3; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public Timestamp getFecha() { return fecha; }
    public void setFecha(Timestamp fecha) { this.fecha = fecha; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }
    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
    public Timestamp getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(Timestamp fechaEnvio) { this.fechaEnvio = fechaEnvio; }
    public Timestamp getFechaRecepcion() { return fechaRecepcion; }
    public void setFechaRecepcion(Timestamp fechaRecepcion) { this.fechaRecepcion = fechaRecepcion; }
    public String getValoracion() { return valoracion; }
    public void setValoracion(String valoracion) { this.valoracion = valoracion; }
}