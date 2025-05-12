package ar.edu.unq.po2.tp5INTERFACES;

public class FacturaServicios extends Factura  {
	private double costoPorUnidad;
	private double cantidadDeunidadesConsumidas;


	public FacturaServicios(String periodo, double costoPorUnidad, double cantidadDeunidadesConsumidas) {
		super(periodo);
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeunidadesConsumidas = cantidadDeunidadesConsumidas;
	}

	public double montoAPagar() {
		return this.costoPorUnidad * this.cantidadDeunidadesConsumidas;
	}

}
