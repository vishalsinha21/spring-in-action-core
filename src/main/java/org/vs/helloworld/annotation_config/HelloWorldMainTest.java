package org.vs.helloworld.annotation_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldMainTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        helloWorld.sayHello();
    }
}
