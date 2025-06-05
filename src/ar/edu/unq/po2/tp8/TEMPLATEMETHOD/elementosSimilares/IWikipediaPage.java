package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.elementosSimilares;

import java.util.ArrayList;
import java.util.Map;

public interface IWikipediaPage {

	public String getTitle();
	public ArrayList<WikipediaPage> getLinks();
	public Map<String, WikipediaPage> getInfobox();
}
