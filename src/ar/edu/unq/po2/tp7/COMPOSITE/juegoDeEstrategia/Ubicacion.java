package ar.edu.unq.po2.tp7.COMPOSITE.juegoDeEstrategia;


public class Ubicacion {
    private double latitud; // Eje y.
	private double longitud; // Eje x.
    private boolean tieneLaja = false;
    
    
    public Ubicacion(double latitud, double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}

    
	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public double distanciaEntreDosUbicaciones(Ubicacion primerUbicacion, Ubicacion segundaUbicacion) {
    	final CalculadoraDeDistancias calculadora = new CalculadoraDeDistancias();
        	
    	return calculadora.calcularDistanciaHaversine(primerUbicacion.getLatitud(),primerUbicacion.getLongitud(), segundaUbicacion.getLatitud(), segundaUbicacion.getLongitud());
    }
	
	public boolean tieneLaja() {
		return tieneLaja;
	}

	public void ponerLaja() {
		this.tieneLaja = true;
	}
}
