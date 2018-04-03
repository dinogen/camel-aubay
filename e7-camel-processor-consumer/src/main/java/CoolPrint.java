import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CoolPrint implements Processor {
	// Stampa il corpo del messaggio con delle barre decorative
	public void process(Exchange e) throws Exception {
		System.out.println("/////// ");
		System.out.println("// " + e.getIn().getBody());
		System.out.println("// ");

	}

}
