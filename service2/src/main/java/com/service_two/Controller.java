package com.service_two;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
public class Controller {
    RestTemplate restTemplate;

    @GetMapping("/serviceTwo")
    public String callService() {
        String serviceThreeResponse = restTemplate.getForObject("http://localhost:9002/serviceThree", String.class);
        String serviceFourResponse = restTemplate.getForObject("http://localhost:9003/serviceFour", String.class);
        return String.format("Hello from service 2! %s %s", serviceThreeResponse, serviceFourResponse);
    }

    @GetMapping("/breakServiceTwo")
    public String breakService() {
        String serviceThreeResponse = restTemplate.getForObject("http://localhost:9002/breakServiceThree", String.class);
        return String.format("Hello from service 2! %s", serviceThreeResponse);
    }
}