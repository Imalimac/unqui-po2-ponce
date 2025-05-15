package ar.edu.unq.po2.tp6SOLID;

public class CreditoPersonal extends Credito {

	public CreditoPersonal(Cliente cliente, double montoSolicitado, Integer plazoEnMeses) {
		super(cliente, montoSolicitado, plazoEnMeses);
	}

	public boolean esAceptable(){
        return (this.cliente.getSueldoNetoAnual()>= 15000 && this.montoCuotaMensual()<= this.montoTopeDeCuota());
    }

    public double montoTopeDeCuota(){
        return this.cliente.getSueldoNetoMensual() * 0.7;
    }
}