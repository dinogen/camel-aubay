package it.aubay.learncamelboot.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class SimpleCamelRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer:hello?period=10s")
		.log("Timer invoked, body= ${body}")
		.pollEnrich("file:data/input?delete=true&readLock=none")
		.to("file:data/output");
	}

}
