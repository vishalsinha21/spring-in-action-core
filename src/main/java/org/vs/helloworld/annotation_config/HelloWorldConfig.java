package org.vs.helloworld.annotation_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.ActiveProfiles;

@Configuration
@ComponentScan(basePackages = "org.vs")
@EnableAspectJAutoProxy
@PropertySource("classpath:org/vs/app.properties")
public class HelloWorldConfig {

    @Bean
    @Profile("dev")
    public String mysqlDriver() {
        return "mysql";
    }

    @Bean
    @Profile("prod")
    public String postgresDriver() {
        return "postgres";
    }

    @Bean
    @Conditional(MagicExistsCondition.class)
    public Magic magic() {
        return new Magic();
    }

    @Bean
    //required for using @Value or property place holders
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
