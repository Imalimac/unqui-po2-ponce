package ar.edu.unq.po2.tp7.COMPOSITE.juegoDeEstrategia;

public abstract class Personaje implements IAccionDelPersonaje {
	private Ubicacion ubicacionDelPersonaje;

	public Personaje(Ubicacion ubicacionDeLPersonaje) {
		super();
		this.ubicacionDelPersonaje = ubicacionDeLPersonaje;
	}

	public Ubicacion getUbicacionDelPersonaje() {
		return ubicacionDelPersonaje;
	}

	public void setUbicacionDelPersonaje(Ubicacion ubicacionDeLPersonaje) {
		this.ubicacionDelPersonaje = ubicacionDeLPersonaje;
	}
	
	public void darUnPasoHacia(Ubicacion destino) {
		final Ubicacion pasoHacia = new Ubicacion (destino.getLatitud()-this.getUbicacionDelPersonaje().getLatitud()+1, destino.getLongitud()-this.getUbicacionDelPersonaje().getLatitud()+1);
		
		while (this.ubicacionDelPersonaje!=destino) {
			this.setUbicacionDelPersonaje(pasoHacia);
		}
	}
}
