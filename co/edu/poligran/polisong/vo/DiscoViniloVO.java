package co.edu.poligran.polisong.vo;

public class DiscoViniloVO {
    private int idDiscoVinilo;
    private int idAutor;
    private String nombre;
    private int anioSalida;
    private double precio;
    private int cantidad;
    private String imagen;

    public DiscoViniloVO() {}

    public DiscoViniloVO(int idDiscoVinilo, int idAutor, String nombre, int anioSalida, double precio, int cantidad, String imagen) {
        this.idDiscoVinilo = idDiscoVinilo;
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.anioSalida = anioSalida;
        this.precio = precio;
        this.cantidad = cantidad;
        this.imagen = imagen;
    }

    public int getIdDiscoVinilo() { return idDiscoVinilo; }
    public void setIdDiscoVinilo(int idDiscoVinilo) { this.idDiscoVinilo = idDiscoVinilo; }
    public int getIdAutor() { return idAutor; }
    public void setIdAutor(int idAutor) { this.idAutor = idAutor; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getAnioSalida() { return anioSalida; }
    public void setAnioSalida(int anioSalida) { this.anioSalida = anioSalida; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
}