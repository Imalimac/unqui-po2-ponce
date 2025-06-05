package ar.edu.unq.po2.tp7.COMPOSITE.cultivos;

import java.util.ArrayList;

public class ParcelaCompuesta extends Parcela{
	public ArrayList<Parcela> parcelasDeLaRegion = new ArrayList<Parcela>();
	
	public ParcelaCompuesta(Parcela primeraParcela, Parcela segundaParcela, Parcela terceraParcela, Parcela cuartaParcela) {
		this.parcelasDeLaRegion.add(primeraParcela);
		this.parcelasDeLaRegion.add(segundaParcela);
		this.parcelasDeLaRegion.add(terceraParcela);
		this.parcelasDeLaRegion.add(cuartaParcela);
	}


	public double calcularGanancia() {
		double gananciaDeLaParcelaCompuesta = 0;
		for (Parcela parcela : parcelasDeLaRegion) {
			gananciaDeLaParcelaCompuesta = gananciaDeLaParcelaCompuesta + parcela.calcularGanancia()*0.25;
		}
		
		return gananciaDeLaParcelaCompuesta;
	}
}
