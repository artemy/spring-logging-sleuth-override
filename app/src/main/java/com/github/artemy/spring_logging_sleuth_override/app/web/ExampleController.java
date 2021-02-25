package com.github.artemy.spring_logging_sleuth_override.app.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ExampleController {

    @GetMapping("/hello")
    String helloWorld() {
        LOGGER.info("Received HTTP request");

        return "Hello world!";
    }
}
