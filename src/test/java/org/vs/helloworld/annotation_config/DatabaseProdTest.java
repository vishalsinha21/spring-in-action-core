package org.vs.helloworld.annotation_config;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloWorldConfig.class)
@ActiveProfiles("prod")
public class DatabaseProdTest {

    @Autowired
    Database database;

    @Test
    public void should_return_driver_name() {
        assertThat(database.createConnection()).isEqualTo("postgres driver");
    }
}