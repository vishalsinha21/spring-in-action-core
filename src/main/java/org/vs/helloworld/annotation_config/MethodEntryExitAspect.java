package org.vs.helloworld.annotation_config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodEntryExitAspect {

    @Before("execution(* org.vs.helloworld.annotation_config.EmployeeService.getAllEmployees(..))")
    public void logMethodEntry() {
        System.out.println("method entry");
    }
}
