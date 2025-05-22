package ar.edu.unq.po2.tp7.COMPOSITE.juegoDeEstrategia;

public class Caballero extends Personaje {

	public Caballero(Ubicacion ubicacionDeLPersonaje) {
		super(ubicacionDeLPersonaje);
	}
	
	public void caminar(Ubicacion destino) {
			
		while (this.getUbicacionDelPersonaje()!= destino) {
			this.moverseEnDiagonalDerecha();
			this.darUnPasoHacia(destino);
			this.moverseEnDiagonalIzquierda();
		}
	}
	
	public void moverseEnDiagonalDerecha() {
		final Ubicacion ubicacionDiagonalDerecha = new Ubicacion(this.getUbicacionDelPersonaje().getLatitud()+1,this.getUbicacionDelPersonaje().getLongitud()+1);
		
		this.setUbicacionDelPersonaje(ubicacionDiagonalDerecha);
	}
	
	public void moverseEnDiagonalIzquierda() {
		final Ubicacion ubicacionDiagonalDerecha = new Ubicacion(this.getUbicacionDelPersonaje().getLatitud()-1,this.getUbicacionDelPersonaje().getLongitud()+1);
		
		this.setUbicacionDelPersonaje(ubicacionDiagonalDerecha);
	}
	
}
