package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.elementosSimilares;

import java.util.ArrayList;


public class SameLetterFilter extends Filter  {
	
	
	public SameLetterFilter() {}

	/* Retorna como páginas similares aquellas que poseen la misma primera letra en el comienzo del título, por ejemplo “La Plata” es similar con “Lucas Art” y “Lobo”.*/
	
	@Override
	public ArrayList<WikipediaPage> getSimilarPages(WikipediaPage page, ArrayList<WikipediaPage> wikipedia) {
		ArrayList<WikipediaPage> similarPages = new ArrayList<WikipediaPage>() ;
		
		for(WikipediaPage pageOfList : wikipedia) {
			if (pageOfList.getTitle().charAt(0)== page.getTitle().charAt(0)) {
				similarPages.add(page);
			}
		}
		
		return similarPages;
	}
	
}
