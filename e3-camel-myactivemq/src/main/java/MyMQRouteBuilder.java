import org.apache.camel.builder.RouteBuilder;

public class MyMQRouteBuilder extends RouteBuilder {
	Integer counter = 0;
	@Override
	public void configure() throws Exception {
		from("activemq:queue:test.queue").to("stream:out");
		//from("activemq:queue:test.queue").to("file:C:/outputFolder");

	}

}
