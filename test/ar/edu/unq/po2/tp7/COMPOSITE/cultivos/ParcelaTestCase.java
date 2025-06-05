package ar.edu.unq.po2.tp7.COMPOSITE.cultivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
	
class ParcelaTestCase {
	private ParcelaSimple parcelaSoja;
	private ParcelaSimple parcelaTrigo;
	private ParcelaSimple parcelaSoja2;
	private ParcelaSimple parcelaTrigo2;
	private ParcelaSimple parcelaSoja3;
	private ParcelaSimple parcelaTrigo3;
	private ParcelaSimple parcelaTrigo4;
	private ParcelaCompuesta parcelaCompuestaDeSimplesMixta;
	private ParcelaCompuesta parcelaCompuestaDeCompuesta;
	private Trigo trigo;
	private Soja soja;
	
	
	@BeforeEach
	public void setUp() {
		trigo = new Trigo();
		soja = new Soja(); 
		
		parcelaSoja = new ParcelaSimple(soja);
		parcelaTrigo = new ParcelaSimple(trigo);
		parcelaSoja2 = new ParcelaSimple(soja);
		parcelaTrigo2 = new ParcelaSimple(trigo);
		parcelaSoja3 = new ParcelaSimple(soja);
		parcelaTrigo3 = new ParcelaSimple(trigo);
		parcelaTrigo4 = new ParcelaSimple(trigo);
		parcelaCompuestaDeSimplesMixta = new ParcelaCompuesta(parcelaSoja, parcelaSoja2, parcelaTrigo, parcelaTrigo2);
		parcelaCompuestaDeCompuesta = new ParcelaCompuesta(parcelaCompuestaDeSimplesMixta, parcelaSoja3, parcelaTrigo3, parcelaTrigo4);

		
	}	
	
	@Test
	void parcelaSimple() {
		assertEquals(parcelaSoja.calcularGanancia(), 500);
		assertEquals(parcelaTrigo.calcularGanancia(), 300);

	}
	
	@Test
	void parcelaCompuesta() {
		assertEquals(parcelaCompuestaDeSimplesMixta.calcularGanancia(), 400);
		assertEquals(parcelaCompuestaDeCompuesta.calcularGanancia(), 375); 

	}
	


}
