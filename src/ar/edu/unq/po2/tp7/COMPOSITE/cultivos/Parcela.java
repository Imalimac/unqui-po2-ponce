package ar.edu.unq.po2.tp7.COMPOSITE.cultivos;

public class Parcela {
    public Cultivo cultivo;


    public Parcela(Cultivo cultivo) {
    	this.cultivo= cultivo;
    }
    
    public Cultivo getCultivo() {
    	return cultivo;
    }
    
    public void cultivar(Cultivo cultivoACultivar) {
    	cultivo = cultivoACultivar;
    }
    public double calcularGanancia () {
    	return cultivo.ganancia()*0.25;
    }
    

}
