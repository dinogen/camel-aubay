import org.apache.camel.builder.RouteBuilder;

public class MyMQRouteBuilder extends RouteBuilder {
	Integer counter = 0;
	@Override
	public void configure() throws Exception {
		ConvertAtoB cp = new ConvertAtoB();
		from("activemq:queue:test.queue")		
		.process(cp)
		.to("stream:out");

	}

}
