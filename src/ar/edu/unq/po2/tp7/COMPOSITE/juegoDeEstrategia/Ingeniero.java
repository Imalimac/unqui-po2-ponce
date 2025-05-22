package ar.edu.unq.po2.tp7.COMPOSITE.juegoDeEstrategia;

public class Ingeniero extends Personaje{
	private Integer cantidadDeLajas;

	public Ingeniero(Ubicacion ubicacionDeLPersonaje, Integer cantidadDeLajas) {
		super(ubicacionDeLPersonaje);
		this.cantidadDeLajas = cantidadDeLajas;
	}

	public Integer getCantidadDeLajas() {
		return cantidadDeLajas;
	}

	public void agregarLajas(Integer cantidadDeLajas) {
		this.cantidadDeLajas = this.cantidadDeLajas + cantidadDeLajas;
	}
	
	public void caminar(Ubicacion destino) {
		if(!this.getUbicacionDelPersonaje().tieneLaja() && this.getCantidadDeLajas()>0 ) {
			this.getUbicacionDelPersonaje().ponerLaja();
			this.cantidadDeLajas = this.cantidadDeLajas - 1;
			this.darUnPasoHacia(destino);
		} else {
			this.darUnPasoHacia(destino);
		}
	}

}
