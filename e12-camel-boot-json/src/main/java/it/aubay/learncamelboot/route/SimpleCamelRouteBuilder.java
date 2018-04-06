package it.aubay.learncamelboot.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import it.aubay.learncamelboot.beans.SomebodyBean;
import it.aubay.learncamelboot.beans.SomebodyBeanProcessor;


@Component
public class SimpleCamelRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		SomebodyBeanProcessor sbp = new  SomebodyBeanProcessor();
		from("activemq:queue:test.queue")
		.unmarshal().json(JsonLibrary.Gson,SomebodyBean.class)
		.process(sbp)
		.to("stream:out");
	}

}
