package ar.edu.unq.po2.tp9.observer.complexWithListener;

public interface SensorListener {

	public void temperaturaInteriorModificada(ComplexSensor sensor, int nuevoValor);
	public void temperaturaExteriorModificada(ComplexSensor sensor, int nuevoValor);
	public void humedadModificada(ComplexSensor sensor, int nuevoValor);
	
}
