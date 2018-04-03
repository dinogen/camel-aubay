import org.apache.camel.builder.RouteBuilder;

public class MyMQRouteBuilder extends RouteBuilder {
	Integer counter = 0;
	@Override
	public void configure() throws Exception {
		CoolPrint cp = new CoolPrint();
		from("activemq:queue:test.queue")		
		.process(cp);

	}

}
