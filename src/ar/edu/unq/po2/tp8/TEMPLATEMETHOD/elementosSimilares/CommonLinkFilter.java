package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.elementosSimilares;

import java.util.ArrayList;

public class CommonLinkFilter extends Filter {
	
	
	public CommonLinkFilter(){}

	/* Retorna como páginas similares aquellas que posean al menos un link a una página en común, por ejemplo si la página de “Gimnasia y Esgrima La Plata” tiene un link a la 	página “La Plata” y la página “Buenos Aires” tiene un link a “La Plata” esas páginas serian similares.*/
	
	@Override
	public ArrayList<WikipediaPage> getSimilarPages(WikipediaPage page, ArrayList<WikipediaPage> wikipedia) {
		ArrayList<WikipediaPage> similarPages = new ArrayList<WikipediaPage>() ;
		
		for(WikipediaPage pageOfList : wikipedia) {
			if (pageOfList.getLinks().contains(page)) {
				similarPages.add(page);
			}
		}
		
		return similarPages;
	}

}
