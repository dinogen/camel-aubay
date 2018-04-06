package it.aubay.camel.example;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;

// Filtra e fa passare solo gli articoli
// che iniziano per la lettera I.
public class FilterEntry {
	public boolean filter(SyndFeed feed) {
		SyndEntry firstentry = (SyndEntry) feed.getEntries().get(0);
		String title = firstentry.getTitle();
		return title.toLowerCase().contains("un");
	}
}
