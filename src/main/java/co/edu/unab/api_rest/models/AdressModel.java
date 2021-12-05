package co.edu.unab.api_rest.models;

public class AdressModel {
    private String departamento;
    private String ciudad;
    private String codigoPostal;

    public AdressModel() {
    }

    public AdressModel(String departamento, String ciudad, String codigoPostal) {
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }
    
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
}