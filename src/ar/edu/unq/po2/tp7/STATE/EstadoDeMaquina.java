package ar.edu.unq.po2.tp7.STATE;

abstract class EstadoDeMaquina {
	
	public MaquinaDeVideoJuegos maquina;

	public EstadoDeMaquina(MaquinaDeVideoJuegos unaMaquina) {
		super();
		this.maquina = unaMaquina;
	}
	
	public void cambiarEstado() {
		this.maquina.setEstado(this.siguienteEstado());	
	}
	
	abstract EstadoDeMaquina siguienteEstado();
	abstract void accionBotonInicio();
	abstract String estado();
	
	
}
