package io.github.nenodias.jmxexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(@RequestParam(required = false) final String name) {
        if (name != null) {
            return "Hello, " + name + "!";
        }
        return "Hello, World!";
    }

}
