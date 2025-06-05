package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.elementosSimilares;

import java.util.ArrayList;
import java.util.Set;


public class CommonPropertyFilter extends Filter {

	
	public CommonPropertyFilter(){}

	/* Retorna aquellas páginas que poseen alguna propiedad del infobox en común, por ejemplo si la página de una persona tiene la propiedad “birth_place” y otra página posee 	también la propiedad “birth_place” serian similares mutuamente. En este caso, no importa que el valor de la propiedad sea diferente.*/
	@Override
	public ArrayList<WikipediaPage> getSimilarPages(WikipediaPage page, ArrayList<WikipediaPage> wikipedia) {
		ArrayList<WikipediaPage> similarPages = new ArrayList<WikipediaPage>();
		
		for(WikipediaPage pageOfList : wikipedia) {
			if (this.paginasConInfoboxComun(pageOfList, page)) {
				similarPages.add(page);
			}
		}
		return similarPages;
	}
	
	private boolean paginasConInfoboxComun(WikipediaPage onePage, WikipediaPage anotherPage) {
		Set<String> onePageValues = onePage.getInfobox().keySet();
		boolean tieneValorComun = false;
		// Iteramos sobre los valores del map de onePage.
        for (String valor : onePageValues) {
        	// Si el map de anotherPage no contiene el valor, entonces no son iguales.
            if (anotherPage.getInfobox().containsKey(valor)) {
                tieneValorComun = true;
            }
        }
        return tieneValorComun;
    }
}

