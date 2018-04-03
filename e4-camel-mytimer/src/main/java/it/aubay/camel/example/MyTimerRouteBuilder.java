package it.aubay.camel.example;
import org.apache.camel.builder.RouteBuilder;

public class MyTimerRouteBuilder extends RouteBuilder {
	Integer counter = 0;
	@Override
	public void configure() throws Exception {
		from("timer://myTimer?period=2000")
		.setBody()		   
		.simple("Hello World Camel fired at ${header.firedTime}")		   
		.to("stream:out");
	}

}
