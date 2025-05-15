package ar.edu.unq.po2.tp6SOLID;

public class PropiedadInmobiliaria {
    public String direccion;
    public String descripcionDeLaPropiedad;
    public double valorFiscalDelInmueble;

    public PropiedadInmobiliaria(String direccion, String descripcionDeLaPropiedad, double valorFiscarDelInmueble){
        this.direccion = direccion;
        this.descripcionDeLaPropiedad = descripcionDeLaPropiedad;
        this.valorFiscalDelInmueble = valorFiscarDelInmueble;
    }

    public double getValorFiscalDelInmueble(){
        return this.valorFiscalDelInmueble;
    }

    public String getDireccion(){
        return this.direccion;
    }
    
    public String getDescripcionDeLaPropiedad(){
        return this.descripcionDeLaPropiedad;
    }
}
