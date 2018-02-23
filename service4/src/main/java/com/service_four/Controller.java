package com.service_four;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/serviceFour")
    public String callServices() {
        return "Hello from service 4!";
    }
}