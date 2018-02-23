package com.service_three;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/serviceThree")
    public String callServices() {
        return "Hello from service 3!";
    }
}