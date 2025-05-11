package ar.edu.unq.po2.tp7.STATE;

public class EstadoEncendido extends EstadoDeMaquina {

	public EstadoEncendido(MaquinaDeVideoJuegos maquina) {
		super(maquina);
	}
	
	public EstadoDeMaquina siguienteEstado() {
		return new EstadoEncendido1Ficha(maquina);
	}
	
	public void accionBotonInicio() {
		System.out.println(" Ingrese 1 ficha y presione incio para 1 jugador. Ingrese 2 fichas y presione inicio para 2 jugadores");
	}
	
	public String estado() {
		return "encendido";
	}

}
