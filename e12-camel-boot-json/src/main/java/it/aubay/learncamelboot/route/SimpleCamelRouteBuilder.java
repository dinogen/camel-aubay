package it.aubay.learncamelboot.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.aubay.learncamelboot.beans.SomebodyBean;
import it.aubay.learncamelboot.beans.SomebodyBeanProcessor;


@Component
public class SimpleCamelRouteBuilder extends RouteBuilder {

	@Autowired
	SomebodyBeanProcessor sbp;
	
	@Override
	public void configure() throws Exception {
		from("{{route.from}}") // definito in application.properties
		.unmarshal().json(JsonLibrary.Gson,SomebodyBean.class)
		.process(sbp)
		.to("{{route.to}}");
	}

}
