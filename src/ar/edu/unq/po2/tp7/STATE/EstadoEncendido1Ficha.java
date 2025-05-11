package ar.edu.unq.po2.tp7.STATE;

public class EstadoEncendido1Ficha extends EstadoDeMaquina {
	private Juego singlePlayer = new Juego();
	
	public EstadoEncendido1Ficha(MaquinaDeVideoJuegos maquina) {
		super(maquina);
	}
	
	public EstadoDeMaquina siguienteEstado() {
		return new EstadoEncendido2Fichas(maquina);
	}
	
	public void accionBotonInicio() {
		this.maquina.iniciarJuego(singlePlayer);
	}
	
	public String estado() {
		return "encendido1";
	}
}

