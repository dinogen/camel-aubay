package it.aubay.example;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
    public void configure() throws Exception {
        from("file:C:/inputFolder?noop=true")
        .process(new MyProcessor())
        .to("file:C:/outputFolder");
    }

}