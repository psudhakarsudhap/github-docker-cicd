package com.vvit.githubdockercicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    @GetMapping("/greet/{id}")
    public String greet(@PathVariable String id) {
        return "Hello " + id;
    }
}
