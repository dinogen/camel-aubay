package it.aubay.camel.e9camelboottest;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.test.spring.CamelSpringBootRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@RunWith(CamelSpringBootRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@SpringBootTest
public class E9CamelBootTestApplicationTests {

	
	@Test
	public void testMQ() {
		ActiveMQComponent activeMQComponent = 
				ActiveMQComponent.activeMQComponent("vm://localhost?broker.persistent=false");

	}

}
