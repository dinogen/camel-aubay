import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class MainClass {

	public static void main(String[] args) throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		MyMQRouteBuilder myMQRouteBuilder = new  MyMQRouteBuilder();
		ActiveMQComponent activeMQComponent = 
				ActiveMQComponent.activeMQComponent("vm://localhost?broker.persistent=false");
		camelContext.addComponent("activemq", activeMQComponent);
		camelContext.addRoutes(myMQRouteBuilder);
		ProducerTemplate template = camelContext.createProducerTemplate();
		camelContext.start();
		template.sendBody("activemq:test.queue", "Ciao, Aubay");
        Thread.sleep(2000);
		template.sendBody("activemq:test.queue", "Ciao, di nuovo");
        Thread.sleep(2000);
		template.sendBody("activemq:test.queue", "Ciao, è finito");
        Thread.sleep(2000);
        camelContext.stop();
	}

}
