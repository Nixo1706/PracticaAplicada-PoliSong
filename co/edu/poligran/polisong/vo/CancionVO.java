package co.edu.poligran.polisong.vo;

public class CancionVO {
    private int idCancion;
    private int idAutor;
    private String nombre;
    private String genero;
    private String duracion;
    private double tamanoMb;
    private int calidadKbps;

    public CancionVO() {}

    public CancionVO(int idCancion, int idAutor, String nombre, String genero, String duracion, double tamanoMb, int calidadKbps) {
        this.idCancion = idCancion;
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.tamanoMb = tamanoMb;
        this.calidadKbps = calidadKbps;
    }

    public int getIdCancion() { return idCancion; }
    public void setIdCancion(int idCancion) { this.idCancion = idCancion; }
    public int getIdAutor() { return idAutor; }
    public void setIdAutor(int idAutor) { this.idAutor = idAutor; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getDuracion() { return duracion; }
    public void setDuracion(String duracion) { this.duracion = duracion; }
    public double getTamanoMb() { return tamanoMb; }
    public void setTamanoMb(double tamanoMb) { this.tamanoMb = tamanoMb; }
    public int getCalidadKbps() { return calidadKbps; }
    public void setCalidadKbps(int calidadKbps) { this.calidadKbps = calidadKbps; }
}