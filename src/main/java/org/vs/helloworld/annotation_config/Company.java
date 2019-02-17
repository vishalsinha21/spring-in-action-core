package org.vs.helloworld.annotation_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Company {

    private final Environment env;

    @Autowired
    public Company(Environment env) {
        this.env = env;
    }

    public String getCompanyName() {
        return env.getProperty("company");
    }
}
