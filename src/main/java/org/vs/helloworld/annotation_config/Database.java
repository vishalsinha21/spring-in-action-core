package org.vs.helloworld.annotation_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Database {

    public String driver;

    @Autowired
    public Database(String driver) {
        this.driver = driver;
    }

    public String createConnection() {
        return driver + " driver";
    }
}
