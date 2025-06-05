package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.elementosSimilares;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilterTestCase {
	private SameLetterFilter filtroMismaLetraInicial;
	private CommonLinkFilter filtroLinkEnComun;
	private CommonPropertyFilter filtroPropiedadEnComun;
	private WikipediaPage buenosAires;
	private WikipediaPage bernal;
	private WikipediaPage laPlata;
	private WikipediaPage gimnasiaYEsgrimaLaPlata;
	
	@BeforeEach
	public void setUp() {
		filtroMismaLetraInicial = new SameLetterFilter();
		filtroMismaLetraInicial.addPageToFilter(buenosAires);
		filtroMismaLetraInicial.addPageToFilter(laPlata);
		filtroMismaLetraInicial.addPageToFilter(gimnasiaYEsgrimaLaPlata);
				
		filtroLinkEnComun = new CommonLinkFilter(); 
		filtroLinkEnComun.addPageToFilter(buenosAires);
		filtroLinkEnComun.addPageToFilter(bernal);
		filtroLinkEnComun.addPageToFilter(laPlata);
		filtroLinkEnComun.addPageToFilter(gimnasiaYEsgrimaLaPlata);
				
		filtroPropiedadEnComun = new CommonPropertyFilter();
		filtroPropiedadEnComun.addPageToFilter(buenosAires);
		filtroPropiedadEnComun.addPageToFilter(bernal);
		filtroPropiedadEnComun.addPageToFilter(laPlata);
		filtroPropiedadEnComun.addPageToFilter(gimnasiaYEsgrimaLaPlata);
		
		buenosAires = new WikipediaPage("buenosAires");
		buenosAires.addLinkToPage(laPlata);
		buenosAires.addLinkToPage(bernal);
		
		bernal = new WikipediaPage("bernal");
		
		laPlata = new WikipediaPage("laPlata");
		laPlata.addLinkToPage(gimnasiaYEsgrimaLaPlata);
		laPlata.addLinkToPage(laPlata);
		
		gimnasiaYEsgrimaLaPlata = new WikipediaPage("gimnasiaYEsgrimaLaPlata");
		gimnasiaYEsgrimaLaPlata.addLinkToPage(buenosAires);
		gimnasiaYEsgrimaLaPlata.addLinkToPage(laPlata);
		gimnasiaYEsgrimaLaPlata.addLinkToPage(gimnasiaYEsgrimaLaPlata);
		

		
	}

	@Test
	public void filtroMismaLetraInicial() {
	
		assertEquals(filtroMismaLetraInicial.getSimilarPages(bernal, filtroMismaLetraInicial.getWikipediaPages()), buenosAires);
	}

}
