package ar.edu.unq.po2.tp7.COMPOSITE.juegoDeEstrategia;

import java.util.ArrayList;

public class Ejercito extends Personaje {
	private ArrayList<Personaje> soldados = new ArrayList<Personaje>();
	
	public Ejercito(Ubicacion ubicacionDeLPersonaje) {
		super(ubicacionDeLPersonaje);
	}

	public ArrayList<Personaje> getSoldados() {
		return soldados;
	}

	public void agregarSoldado(Personaje soldadoAAgregar) {
		soldados.add(soldadoAAgregar);
	}
	
	public void agregarEjercito(Ejercito ejercitoAAgregar) {
		for (Personaje soldado : ejercitoAAgregar.getSoldados()) {
			soldados.add(soldado);
		}
	}
	
	public void caminar(Ubicacion ubicacion) {
		for(Personaje soldado : soldados) {
			soldado.caminar(ubicacion);
		}
	}

}
