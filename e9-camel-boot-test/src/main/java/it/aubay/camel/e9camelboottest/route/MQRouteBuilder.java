package it.aubay.camel.e9camelboottest.route;

import org.apache.camel.builder.RouteBuilder;

public class MQRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("activemq:queue:test.queue")
		.to("stream:out");

	}

}
