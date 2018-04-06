package it.aubay.camel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class MyMQRouteBuilder extends RouteBuilder {
	Integer counter = 0;
	@Override
	public void configure() throws Exception {
		SomebodyBeanProcessor sbp = new  SomebodyBeanProcessor();
		from("activemq:queue:test.queue")
		.unmarshal().json(JsonLibrary.Gson,SomebodyBean.class)
		.process(sbp)
		.to("stream:out");
	}

}
