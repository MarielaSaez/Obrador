
package Modelo;

public class Herramienta {
    private int id_herramienta, stock;
    private String nombre, descripcion;
    private boolean estado;

    public Herramienta( int stock, String nombre, String descripcion, boolean estado) {
        this.id_herramienta = -1;
        this.stock = stock;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Herramienta(int id_herramienta, int stock, String nombre, String descripcion, boolean estado) {
        this.id_herramienta = id_herramienta;
        this.stock = stock;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Herramienta() {
    }

    public int getId_herramienta() {
        return id_herramienta;
    }

    public void setId_herramienta(int id_herramienta) {
        this.id_herramienta = id_herramienta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return id_herramienta + "-" + nombre ;
    }
    
}
