package ar.edu.unq.po2.tp7.COMPOSITE.cultivos;

import java.util.ArrayList;

public class PorcionProductivaDeTierra {
	public ArrayList<RegionDeCultivo> regionDeCultivo = new ArrayList<RegionDeCultivo>();
	
	
	
	public PorcionProductivaDeTierra(RegionDeCultivo regionDeCultivo) {
		super();
	}
	
	
	
    public void cultivar(Cultivo cultivoACultivar) {
    	for(RegionDeCultivo region: regionDeCultivo) {
    		region.cultivar(cultivoACultivar);
    	}
    }
    
    public double calcularGanancia () {
    	double ganancia = 0;
    	
    	for(RegionDeCultivo region: regionDeCultivo) {
    		ganancia = ganancia + region.calcularGanancia();
    	}
    	
    	return ganancia;
    }
	
    public void agregarRegionDeCultivo(RegionDeCultivo regionAAgregar) {
    	regionDeCultivo.add(regionAAgregar);
    }
    
}
