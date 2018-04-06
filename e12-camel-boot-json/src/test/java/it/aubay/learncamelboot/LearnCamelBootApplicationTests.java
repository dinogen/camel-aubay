package it.aubay.learncamelboot;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.test.spring.CamelSpringBootRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@RunWith(CamelSpringBootRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@SpringBootTest
public class LearnCamelBootApplicationTests {

	@Autowired
	ProducerTemplate template;	
	
	@Test
	public void testJson() throws InterruptedException {
		template.sendBody("activemq:test.queue", "{\"nome\": \"Marcello Semboli\",\"dtnascita\": 19660409}");
		Thread.sleep(2000);
		template.sendBody("activemq:test.queue", "{\"nome\": \"Larry Page\",\"dtnascita\": 19730329}");
		Thread.sleep(2000);
		template.sendBody("activemq:test.queue", "{\"nome\": \"Mahatma Gandhi\",\"dtnascita\": 18691002}");
		Thread.sleep(2000);

	}

}
