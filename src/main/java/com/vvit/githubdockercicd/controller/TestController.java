package com.vvit.githubdockercicd.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    //http://localhost:8080/api/v1/test/greet?name=John
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
