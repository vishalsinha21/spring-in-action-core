package org.vs.helloworld.annotation_config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloWorldConfig.class)
@ActiveProfiles("dev")
public class MagicTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void should_create_magic_when_magic_exists_condition_is_true() {
        Magic magic = context.getBean(Magic.class);

        assertThat(magic).isNotNull();
    }
}