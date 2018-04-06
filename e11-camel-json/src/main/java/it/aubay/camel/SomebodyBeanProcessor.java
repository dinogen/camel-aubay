package it.aubay.camel;

import java.time.LocalDate;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SomebodyBeanProcessor implements Processor {

	public void process(Exchange arg0) throws Exception {
		SomebodyBean sbb = (SomebodyBean) arg0.getIn().getBody();
		System.out.println("Sto processando " + sbb.getNome());
		sbb.setEta(LocalDate.now().getYear() - sbb.getDtnascita()/10000);
		arg0.getIn().setBody(sbb);
		
	}

}
