package org.vs.helloworld.annotation_config;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloWorldConfig.class)
@ActiveProfiles("dev")
public class CompanyTest {

    @Autowired
    Company company;

    @Value("${company}")
    String companyName;

//    @Value("#{'TCS'}")
    @Value("#{company.companyName}")
    String companyNameSpel;

    @Test
    public void should_return_company_name() {
        assertThat(company.getCompanyName()).isEqualTo("TCS");
        assertThat(companyName).isEqualTo("TCS");
        assertThat(companyNameSpel).isEqualTo("TCS");
    }
}