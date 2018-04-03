import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ConvertAtoB implements Processor {
	// Trasforma il body.
	// Cambia le a in b.
	public void process(Exchange e) throws Exception {
		String body = (String) e.getIn().getBody();
		String newbody = body.replaceAll("a", "b");
		e.getIn().setBody(newbody);

	}

}
