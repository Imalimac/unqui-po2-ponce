package ar.edu.unq.po2.tp7.STATE;

public class MaquinaDeVideoJuegos {
	private EstadoDeMaquina estado = new EstadoApagado(this);
	public Integer cantidadDeFichas =0;

	public MaquinaDeVideoJuegos() {
		super();
	}

	public EstadoDeMaquina getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeMaquina estado) {
		this.estado = estado;
	} 

	public void botonInicio() {
		estado.accionBotonInicio();
	}
	
	public void encender() {
		this.setEstado(new EstadoEncendido(this));
	} // Método creado por que no aclara como se enciende la máquina.
	
	public void apagar() {
		this.setEstado(new EstadoApagado(this));
	} // Método creado por que no aclara como se apaga la máquina.
		
	public Integer getCantidadDeFichas() {
		return cantidadDeFichas;
	}

	public void ingresarFichas() {
		cantidadDeFichas=cantidadDeFichas+1;
		estado.cambiarEstado();
	}

	public void iniciarJuego(Juego unJuego) {
		cantidadDeFichas = 0;
		this.setEstado(new EstadoJugando(this));
	};
	
	public void terminarJuego() {
		this.setEstado(new EstadoEncendido(this));
	};
	
	
	
	
	
}
