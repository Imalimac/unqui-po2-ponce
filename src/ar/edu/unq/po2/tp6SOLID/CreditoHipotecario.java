package ar.edu.unq.po2.tp6SOLID;

public class CreditoHipotecario extends Credito {
    public PropiedadInmobiliaria propiedadInmobiliaria;
    
    public CreditoHipotecario(Cliente cliente, double montoSolicitado, Integer plazoEnMeses,
			PropiedadInmobiliaria propiedadInmobiliaria) {
		super(cliente, montoSolicitado, plazoEnMeses);
		this.propiedadInmobiliaria = propiedadInmobiliaria;
	}

	public boolean esAceptable(){
        return (this.montoCuotaMensual()<= this.montoTopeDeCuota() && this.noSuperaTopeDeValorFiscalDeGarantia() && this.clienteNoSuperaEdadTope());
    }

    public boolean noSuperaTopeDeValorFiscalDeGarantia(){
        return this.propiedadInmobiliaria.getValorFiscalDelInmueble() * 0.7 <= this.montoSolicitado;
    } 

    public double montoTopeDeCuota(){
        return this.cliente.getSueldoNetoMensual() * 0.5;
    }

    public boolean clienteNoSuperaEdadTope(){
        return this.cliente.getEdad() + this.plazoDeCreditoEnAños() <=65;
    }

    public Integer plazoDeCreditoEnAños(){
        return this.plazoEnMeses / 12;
    }
    
}