package co.edu.unab.api_rest.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ClienteModel {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private AdressModel direccion;
    private List<ProductoModel> productos;
    private Long puntos;
    
    public ClienteModel() {
    }
    
    public ClienteModel(String id, String nombre, String apellido, String telefono, AdressModel direccion,
            List<ProductoModel> productos, Long puntos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.productos = productos;
        this.puntos = puntos;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public Long getPuntos() {
        return puntos;
    }
    
    public void setPuntos(Long puntos) {
        this.puntos = puntos;
    }
    
    public AdressModel getDireccion() {
        return direccion;
    }
    
    public void setDireccion(AdressModel direccion) {
        this.direccion = direccion;
    }
    
    public List<ProductoModel> getProductos() {
        return productos;
    }
    
    
    public void setProductos(List<ProductoModel> productos) {
        this.productos = productos;
    }
}
