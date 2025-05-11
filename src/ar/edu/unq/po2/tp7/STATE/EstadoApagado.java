package ar.edu.unq.po2.tp7.STATE;

public class EstadoApagado extends EstadoDeMaquina {

	public EstadoApagado(MaquinaDeVideoJuegos maquina) {
		super(maquina);
	}
	
	public EstadoDeMaquina siguienteEstado() {
		return new EstadoEncendido(maquina);
	}
	
	public void accionBotonInicio() {
		this.cambiarEstado();
	}
	
	public String estado() {
		return "apagado";
	}
}
