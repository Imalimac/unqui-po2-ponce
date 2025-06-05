package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.elementosSimilares;

import java.util.ArrayList;

public abstract class Filter {
	private ArrayList<WikipediaPage>wikipediaPages = new ArrayList<WikipediaPage>();
	
	public Filter() {}
	
	public void addPageToFilter(WikipediaPage pageToAdd) {
		this.wikipediaPages.add(pageToAdd);
	}


	public ArrayList<WikipediaPage> getWikipediaPages() {
		return wikipediaPages;
	}

	public void filtroLinkEnComun(WikipediaPage wikipediaPageToAdd) {
		this.wikipediaPages.add(wikipediaPageToAdd);
	}

	abstract public ArrayList<WikipediaPage> getSimilarPages(WikipediaPage page, ArrayList<WikipediaPage> wikipedia);
	
}
