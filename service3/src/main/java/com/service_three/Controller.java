package com.service_three;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @SneakyThrows
    @GetMapping("/serviceThree")
    public String callServices() {
        return "Hello from service 3!";
    }

    @GetMapping("/breakServiceThree")
    public String breakServices() {
        throw new RuntimeException("Oops....something went wrong!");
    }
}