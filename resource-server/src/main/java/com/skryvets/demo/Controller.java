package com.skryvets.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class Controller {

    @GetMapping
    public Map<String, String> helloEndpoint() {
        return Collections.singletonMap("message", "hello");
    }
}
