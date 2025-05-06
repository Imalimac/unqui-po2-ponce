package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuento = 0.9;
	
    public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
    }
    
    public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
        super(nombre, precio, esPrecioCuidado);
        this.setDescuento(descuento);
    }

    @Override
    public double getPrecio() {
        return precio*descuento;
    }

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
}
