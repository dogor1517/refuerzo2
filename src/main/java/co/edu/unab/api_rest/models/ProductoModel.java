package co.edu.unab.api_rest.models;

public class ProductoModel {
    
    private String nombre;
    private int cantidad;
    private int precio;


    public ProductoModel() {
    }

    public ProductoModel(String nombre, int cantidad, int precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ProductoModel nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public ProductoModel cantidad(int cantidad) {
        setCantidad(cantidad);
        return this;
    }

    public ProductoModel precio(int precio) {
        setPrecio(precio);
        return this;
    }
    
}
