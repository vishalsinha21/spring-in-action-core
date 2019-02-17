package org.vs.helloworld.annotation_config;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public String sayHello() {
        String msg = "hello, world!";
        System.out.println(msg);

        return msg;
    }
}
