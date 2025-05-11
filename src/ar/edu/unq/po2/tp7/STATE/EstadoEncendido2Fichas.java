package ar.edu.unq.po2.tp7.STATE;

public class EstadoEncendido2Fichas extends EstadoDeMaquina{
	private Juego multiPlayer = new Juego();
	public EstadoEncendido2Fichas(MaquinaDeVideoJuegos maquina) {
		super(maquina);
	}
	
	public EstadoDeMaquina siguienteEstado() {
		return new EstadoEncendido(maquina);
	}
		
	public void accionBotonInicio() {
		this.maquina.iniciarJuego(multiPlayer);
	}
	
	public String estado() {
		return "encendido2";
	}
}
