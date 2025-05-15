package ar.edu.unq.po2.tp6SOLID;

abstract class Credito {
    public Cliente cliente;
    public double montoSolicitado;
    public Integer plazoEnMeses;

    
    public Credito(Cliente cliente, double montoSolicitado, Integer plazoEnMeses) {
		super();
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}
      
    public Cliente getCliente() {
		return cliente;
	}

    public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}

	public Integer getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(Integer plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public double montoCuotaMensual(){
        return this.montoSolicitado / this.plazoEnMeses;
    }

    abstract boolean esAceptable();

    abstract double montoTopeDeCuota();
}