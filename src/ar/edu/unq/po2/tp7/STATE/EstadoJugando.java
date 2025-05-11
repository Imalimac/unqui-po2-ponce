package ar.edu.unq.po2.tp7.STATE;

public class EstadoJugando extends EstadoDeMaquina{
	
	public EstadoJugando(MaquinaDeVideoJuegos maquina) {
		super(maquina);
	}
	
	public EstadoDeMaquina siguienteEstado() {
		return new EstadoEncendido(maquina);
	}
	
	public void accionBotonInicio() {
			this.maquina.setEstado(this.siguienteEstado());
	}
	
	public String estado() {
		return "jugando";
	}

}
