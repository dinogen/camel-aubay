package it.aubay.camel.example;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class MainClass {

	public static void main(String[] args) throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		MyTimerRouteBuilder myTimerRouteBuilder = new  MyTimerRouteBuilder();
		camelContext.addRoutes(myTimerRouteBuilder);
		ProducerTemplate template = camelContext.createProducerTemplate();
		camelContext.start();
        Thread.sleep(10000);
        camelContext.stop();
	}

}
