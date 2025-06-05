package ar.edu.unq.po2.tp7.COMPOSITE.cultivos;

public class ParcelaSimple extends Parcela{
	private Cultivo cultivo;
	
	public ParcelaSimple(Cultivo cultivo) {
		super();
		this.cultivo = cultivo;
	}
	
	public Cultivo getCultivo() {
		return cultivo;
	}

	public double calcularGanancia () {
    	return this.getCultivo().ganancia();
    }
}
