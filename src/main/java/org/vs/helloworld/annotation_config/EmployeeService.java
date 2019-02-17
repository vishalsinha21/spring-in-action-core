package org.vs.helloworld.annotation_config;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List getAllEmployees() {

        //heavy dao operation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new ArrayList();
    }
}
