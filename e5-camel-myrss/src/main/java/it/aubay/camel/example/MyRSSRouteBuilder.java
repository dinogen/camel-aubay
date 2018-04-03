package it.aubay.camel.example;
import org.apache.camel.builder.RouteBuilder;

public class MyRSSRouteBuilder extends RouteBuilder {
	Integer counter = 0;
	@Override
	public void configure() throws Exception {
		// https://github.com/apache/camel/blob/master/components/camel-rss/src/main/docs/rss-component.adoc
		from("rss:http://www.ansa.it/sito/ansait_rss.xml?consumer.delay=50&splitEntries=true")	
		.filter()
		.method(new FilterEntry(),"filter")
		.to("stream:out");
	}

}
