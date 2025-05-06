package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {
	public Integer cantidadDeHorasExtras;
	
	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double montoPercibido, Integer cantidadDeHorasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
	
	@Override
	public double getMontoImponible() {
		return 0;
	}

	public Integer getCantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}

	public void setCantidadDeHorasExtras(Integer cantidadDeHorasExtras) {
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
	
	
}
