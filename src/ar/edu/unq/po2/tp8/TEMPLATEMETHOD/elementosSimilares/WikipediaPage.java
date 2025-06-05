package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.elementosSimilares;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WikipediaPage implements IWikipediaPage {
	private String title;
	private ArrayList<WikipediaPage> links = new ArrayList<WikipediaPage>() ;

	public WikipediaPage(String title) {
		this.title = title;
	}

	/*retorna el título de la página.*/
	public String getTitle() {
		return title;
	}
	
	/*retorna una Lista de las páginas de Wikipedia con las que se conecta.*/
	public ArrayList<WikipediaPage> getLinks(){
		return links;
	}
	public Map<String, WikipediaPage> getInfobox(){
		HashMap<String, WikipediaPage>miLinksInfoboxMap = new HashMap<>(); 
		
		for (WikipediaPage page : this.links) {
			miLinksInfoboxMap.put(page.getTitle(), page);
		}
		
		return miLinksInfoboxMap;
	}
	
	public void addLinkToPage(WikipediaPage pageToAdd) {
		links.add(pageToAdd);
	}

}
