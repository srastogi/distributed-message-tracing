package com.service_one;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
@Slf4j
public class Controller {
    RestTemplate restTemplate;

    @GetMapping("/start")
    public String callService() {
        String serviceTwoResponse = restTemplate.getForObject("http://localhost:9001/serviceTwo", String.class);
        return String.format("Hello from service 1! %s", serviceTwoResponse);
    }

    @GetMapping("/break")
    public String breakService() {
        String serviceTwoResponse = restTemplate.getForObject("http://localhost:9001/breakServiceTwo", String.class);
        return String.format("Hello from service 1! %s", serviceTwoResponse);
    }
}