package ar.edu.unq.po2.tp7.COMPOSITE.cultivos;

import java.util.ArrayList;

public class RegionDeCultivo {
	public ArrayList<Parcela> parcelasDeLaRegion = new ArrayList<Parcela>();

	public RegionDeCultivo(ArrayList<Parcela> parcelasDeLaRegion) {
		super();
	}
	
    public void cultivar(Cultivo cultivoACultivar) {
    	for(Parcela parcela: parcelasDeLaRegion) {
    		parcela.cultivar(cultivoACultivar);
    	}
    }
    
    public double calcularGanancia () {
    	double ganancia = 0;
    	
    	for(Parcela parcela: parcelasDeLaRegion) {
    		ganancia = ganancia + parcela.calcularGanancia();
    	}
    	
    	return ganancia;
    }
	
    public void agregarParcela(Parcela parcelaAAgregar) {
    	parcelasDeLaRegion.add(parcelaAAgregar);
    }
	
}
