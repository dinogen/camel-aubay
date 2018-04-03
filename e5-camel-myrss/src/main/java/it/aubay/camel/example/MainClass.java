package it.aubay.camel.example;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class MainClass {

	public static void main(String[] args) throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		MyRSSRouteBuilder myRSSRouteBuilder = new  MyRSSRouteBuilder();
		camelContext.addRoutes(myRSSRouteBuilder);
		camelContext.start();
        Thread.sleep(60000);
        camelContext.stop();
	}

}
