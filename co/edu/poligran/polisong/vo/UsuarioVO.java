package co.edu.poligran.polisong.vo;

import java.sql.Timestamp;

public class UsuarioVO {
    private int idUsuario;
    private String tipoUsuario;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    private String password;
    private Timestamp fechaRegistro;

    public UsuarioVO() {}

    public UsuarioVO(int idUsuario, String tipoUsuario, String nombre, String telefono, String correo, String direccion, String password, Timestamp fechaRegistro) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.password = password;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public String getTipoUsuario() { return tipoUsuario; }
    public void setTipoUsuario(String tipoUsuario) { this.tipoUsuario = tipoUsuario; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public Timestamp getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(Timestamp fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}